# WebSocket & STOMP Implementation Guide

## What is This?

This document explains the **real-time batch status updates** feature in your application. It allows the frontend to automatically receive updates when batch statuses change on the backend, **without refreshing the page**.

---

## Why WebSocket & STOMP?

### The Problem
Before: When a batch status changed in the backend database, the frontend had to manually refresh the page to see the update.

### The Solution
WebSocket allows the **server to push updates to the browser** in real-time. STOMP (Simple Text Oriented Messaging Protocol) is a layer on top of WebSocket that makes it easier to send structured messages.

**Analogy**: Instead of constantly asking "are there updates?" (polling), the server calls you when something changes (push).

---

## How It Works (Simple Explanation)

```
┌─────────────┐                    ┌─────────────┐
│   Backend   │                    │  Frontend   │
│  (Spring)   │                    │  (Angular)  │
└─────────────┘                    └─────────────┘
       │                                  │
       │  1. Frontend connects to /ws    │
       │◄────────────────────────────────│
       │                                  │
       │  2. Backend confirms connection │
       │─────────────────────────────────►│
       │                                  │
       │  3. Batch status changes (DB)   │
       │                                  │
       │  4. Send message to topic       │
       │  "/topic/batch-status"          │
       │─────────────────────────────────►│
       │                                  │
       │  5. Frontend updates UI         │
       │                                  │  ✅ Status updated!
```

---

## What Was Implemented

### Backend (Spring Boot)

#### 1. **WebSocketConfig.java** - STOMP Configuration
**Location**: `Back/src/main/java/com/mss/backOffice/config/WebSocketConfig.java`

**What it does**:
- Enables STOMP messaging over WebSocket
- Creates endpoint `/ws` where frontend connects
- Configures message broker with topic `/topic/batch-status`
- Uses SimpleBroker (works for single server)

**Key code**:
```java
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    // Register endpoint where clients connect
    registry.addEndpoint("/ws")
        .setAllowedOrigins("*")
        .withSockJS();

    // Enable message broker for /topic destinations
    config.enableSimpleBroker("/topic", "/queue");
}
```

#### 2. **batchHistoryService.java** - Sends Updates
**Location**: `Back/src/main/java/com/mss/backOffice/services/batchHistoryService.java`

**What it does**:
- When batch status changes, broadcasts the update via STOMP
- Uses `SimpMessagingTemplate` to send messages

**Key code**:
```java
@Autowired
private SimpMessagingTemplate messagingTemplate;

public void updateStatus(Long historyId, Integer status) {
    // Update database
    history.setStatus(status);
    batchesHistoryRepository.save(history);

    // Broadcast to all connected clients
    BatchStatusUpdateMessage message = new BatchStatusUpdateMessage(
        history.getBatchHId(), status, history.getBatchName()
    );
    messagingTemplate.convertAndSend("/topic/batch-status", message);
}
```

#### 3. **BatchHistoryOrchestratorService.java** - Sends Updates During Processing
**Location**: `Back/src/main/java/com/mss/backOffice/services/BatchHistoryOrchestratorService.java`

**What it does**:
- Sends real-time updates during batch file processing
- Status 0 (Parsing Started) → Status 3 (Completed) or Status 2 (Error)

---

### Frontend (Angular)

#### 1. **batch-history.service.ts** - STOMP Client
**Location**: `frontFransabank/src/app/services/batch-history.service.ts`

**What it does**:
- Connects to backend WebSocket endpoint `/ws`
- Subscribes to topic `/topic/batch-status`
- Receives status updates and emits them as Observable

**Key code**:
```typescript
connectWebSocket(token: string): void {
    const socket = new SockJS('http://localhost:5000/ws');
    this.stompClient = Stomp.over(socket);

    this.stompClient.connect({}, (frame) => {
        // Subscribe to status updates
        this.stompClient.subscribe('/topic/batch-status', (message) => {
            const update = JSON.parse(message.body);
            this.statusUpdates$.next(update);
        });
    });
}
```

#### 2. **batches-history-list.ts** - Subscribes to Updates
**Location**: `frontFransabank/src/app/components/batches-history-list/batches-history-list.ts`

**What it does**:
- Subscribes to status updates from service
- Updates the table in real-time when status changes
- Shows connection status indicator (green dot = connected)

**Key code**:
```typescript
ngOnInit(): void {
    this.loadBatchesHistory();
    if (this.isBrowser) {
        this.connectToWebSocket();
        this.subscribeToStatusUpdates();
    }
}

private subscribeToStatusUpdates(): void {
    this.batchHistoryService.getStatusUpdates().subscribe(update => {
        // Find batch and update its status
        const batch = this.batchesHistory.find(b => b.batchHId === update.batchHId);
        if (batch) {
            batch.status = update.status;
        }
    });
}
```

---

## Message Flow Example

### Scenario: Batch status changes from "Parsing Started" to "Done"

**Step 1**: User clicks "Process Batch" button
```
Frontend → Backend: HTTP POST /BatchHistory/processBatchHistory
```

**Step 2**: Backend starts processing and updates status to 0
```java
history.setStatus(0); // Parsing Started
messagingTemplate.convertAndSend("/topic/batch-status", message);
```

**Step 3**: WebSocket message sent to all connected clients
```json
{
  "type": "STATUS_UPDATE",
  "batchHId": 5,
  "status": 0,
  "batchName": "Batch_2026-02-11",
  "timestamp": "2026-02-11T13:50:36"
}
```

**Step 4**: Frontend receives message and updates UI
```typescript
update.batchHId = 5, update.status = 0
→ Table row updates: Status badge shows "Parsing Started" (blue)
```

**Step 5**: Processing completes, backend sends status 3
```java
history.setStatus(3); // Parsing Completed
messagingTemplate.convertAndSend("/topic/batch-status", message);
```

**Step 6**: Frontend updates UI again
```
→ Table row updates: Status badge shows "Parsing Completed" (green)
```

**All of this happens WITHOUT page refresh! 🎉**

---

## Architecture Diagram

```
┌──────────────────────────────────────────────────────────────┐
│                         BACKEND                              │
├──────────────────────────────────────────────────────────────┤
│                                                              │
│  WebSocketConfig.java                                        │
│  ┌────────────────────────────────────────┐                 │
│  │ @EnableWebSocketMessageBroker          │                 │
│  │ Endpoint: /ws                          │                 │
│  │ Topic: /topic/batch-status             │                 │
│  └────────────────────────────────────────┘                 │
│                      ▲                                       │
│                      │ Uses                                  │
│                      │                                       │
│  batchHistoryService.java                                    │
│  ┌────────────────────────────────────────┐                 │
│  │ @Autowired                             │                 │
│  │ SimpMessagingTemplate messagingTemplate│                 │
│  │                                        │                 │
│  │ updateStatus() {                       │                 │
│  │   // Update DB                         │                 │
│  │   messagingTemplate.convertAndSend(...)│                 │
│  │ }                                      │                 │
│  └────────────────────────────────────────┘                 │
│                                                              │
└──────────────────────────────────────────────────────────────┘
                          │
                          │ WebSocket Connection
                          │ (ws://localhost:5000/ws)
                          ▼
┌──────────────────────────────────────────────────────────────┐
│                        FRONTEND                              │
├──────────────────────────────────────────────────────────────┤
│                                                              │
│  batch-history.service.ts                                    │
│  ┌────────────────────────────────────────┐                 │
│  │ stompClient                            │                 │
│  │ ├─ connect()                           │                 │
│  │ └─ subscribe('/topic/batch-status')   │                 │
│  │                                        │                 │
│  │ statusUpdates$ (Observable)            │                 │
│  └────────────────────────────────────────┘                 │
│                      ▲                                       │
│                      │ Subscribes                            │
│                      │                                       │
│  batches-history-list.ts (Component)                         │
│  ┌────────────────────────────────────────┐                 │
│  │ subscribeToStatusUpdates() {           │                 │
│  │   service.getStatusUpdates()           │                 │
│  │     .subscribe(update => {             │                 │
│  │       // Update table row              │                 │
│  │     })                                 │                 │
│  │ }                                      │                 │
│  └────────────────────────────────────────┘                 │
│                      │                                       │
│                      ▼                                       │
│  batches-history-list.html                                   │
│  ┌────────────────────────────────────────┐                 │
│  │ <p-table [value]="batchesHistory">     │                 │
│  │   Status: {{ batch.status }}           │                 │
│  │   ✅ Updates automatically!            │                 │
│  │ </p-table>                             │                 │
│  └────────────────────────────────────────┘                 │
│                                                              │
└──────────────────────────────────────────────────────────────┘
```

---

## Key Concepts

### 1. **STOMP (Simple Text Oriented Messaging Protocol)**
- Layer on top of WebSocket
- Uses **destinations** (like `/topic/batch-status`)
- Messages are JSON objects
- Easier than raw WebSocket

### 2. **SimpleBroker**
- In-memory message broker
- Works for **single server** deployments
- For multiple servers, switch to RabbitMQ or Redis

### 3. **Topic vs Queue**
- **`/topic/*`**: Broadcast to all subscribers (like radio)
- **`/queue/*`**: Send to one specific user (like phone call)
- We use `/topic/batch-status` so **all users** see updates

### 4. **SockJS**
- Fallback for browsers that don't support WebSocket
- Automatically uses polling if WebSocket unavailable
- Makes connection more reliable

---

## Current Implementation Status

### ✅ What's Working
- Backend sends status updates via STOMP
- Frontend can connect to WebSocket endpoint
- Messages are broadcast to `/topic/batch-status`
- Component is guarded to only run in browser (not SSR)

### ⚠️ Current Issue
- **WebSocket shows "Disconnected"** on frontend
- Cause: Old `stompjs` and `sockjs-client` libraries incompatible with Angular SSR
- Solution needed: Switch to `@stomp/stompjs` (modern library)

---

## How to Test (When Working)

### 1. Start Backend
```bash
cd Back
mvn spring-boot:run
```
**Look for logs**:
```
STOMP endpoint registered at /ws with SockJS fallback
```

### 2. Start Frontend
```bash
cd frontFransabank
ng serve
```

### 3. Open Browser
- Navigate to `http://localhost:4200/batches-history`
- Check status indicator (should show green "Live Updates")

### 4. Test Real-Time Update
**Option A**: Via API
```bash
curl -X PUT "http://localhost:5000/BatchHistory/updateStatus/5/3"
```

**Option B**: Via UI
- Click "Update Status" button on any batch
- Watch the table update WITHOUT page refresh!

### 5. Verify in Browser Console
```
STOMP Connected: ...
Received STOMP status update: { batchHId: 5, status: 3, ... }
Updated batch 5 to status 3
```

---

## Files Modified Summary

### Backend (6 files)
1. **WebSocketConfig.java** - NEW: STOMP configuration
2. **batchHistoryService.java** - Updated: uses `SimpMessagingTemplate`
3. **BatchHistoryOrchestratorService.java** - Updated: broadcasts during processing
4. **BackOfficeApplication.java** - Cleaned: removed old handler imports
5. **BatchHistoryWebSocketHandler.java** - DELETED (old plain WebSocket)
6. **WebSocketHandshakeInterceptor.java** - DELETED (old interceptor)

### Frontend (3 files)
1. **batch-history.service.ts** - Rewritten: STOMP client instead of plain WebSocket
2. **batches-history-list.ts** - Updated: SSR guards, change detection
3. **index.html** - Added: `global` polyfill for Node libraries

### Dependencies
**Added**:
- `stompjs`
- `sockjs-client`
- `@types/stompjs`
- `@types/sockjs-client`

---

## Next Steps (To Fix Current Issue)

### Replace Old Libraries with Modern Ones

**Uninstall old**:
```bash
npm uninstall stompjs sockjs-client @types/stompjs @types/sockjs-client
```

**Install modern**:
```bash
npm install @stomp/stompjs
```

**Update service** to use `@stomp/stompjs` instead of old libraries.

**Remove polyfill** from `index.html` (won't be needed with modern library).

---

## Benefits of This Implementation

1. **Real-Time Updates**: Users see status changes immediately
2. **Better UX**: No need to refresh page manually
3. **Scalable**: Can switch to RabbitMQ/Redis for multi-server
4. **Standard Protocol**: STOMP is widely used and well-documented
5. **Production Ready**: Follows Spring Boot best practices

---

## Common Questions

### Q: Why STOMP over plain WebSocket?
**A**: STOMP adds structure (topics, subscriptions, message format) that makes development easier. Plain WebSocket requires custom message handling code.

### Q: Can multiple users see the same updates?
**A**: Yes! `/topic/batch-status` is a broadcast topic. All connected users receive updates.

### Q: What happens if user disconnects?
**A**: Service automatically attempts reconnection (5 times, 3 seconds apart).

### Q: Does this work with multiple browser tabs?
**A**: Yes! Each tab has its own WebSocket connection and receives updates.

### Q: What if backend restarts?
**A**: Frontend detects disconnection and auto-reconnects when backend comes back online.

---

## Resources

- [Spring STOMP Documentation](https://docs.spring.io/spring-framework/reference/web/websocket/stomp.html)
- [STOMP Protocol Spec](https://stomp.github.io/)
- [SockJS Project](https://github.com/sockjs/sockjs-client)

---

**Created**: 2026-02-11
**Last Updated**: 2026-02-11
**Status**: Implementation complete, troubleshooting connection issue
