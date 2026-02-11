import { Injectable, NgZone, OnDestroy } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, Subject, BehaviorSubject } from 'rxjs';
import { BatchesHistory } from '../types';

export interface BatchStatusUpdate {
  type: 'STATUS_UPDATE' | 'connected';
  batchHId?: number;
  status?: number;
  batchName?: string;
  timestamp?: string;
  message?: string;
}

@Injectable({
  providedIn: 'root'
})
export class BatchHistoryService implements OnDestroy {
  private readonly BASE_URL = 'http://localhost:5000/BatchHistory';
  private readonly WS_URL = 'ws://localhost:5000/ws/batch-history';

  private websocket: WebSocket | null = null;
  private statusUpdates$ = new Subject<BatchStatusUpdate>();
  private connectionStatus$ = new BehaviorSubject<'connected' | 'disconnected' | 'connecting'>('disconnected');

  private reconnectAttempts = 0;
  private maxReconnectAttempts = 5;
  private reconnectInterval = 3000; // 3 seconds
  private reconnectTimer: any;
  private intentionalDisconnect = false;

  constructor(private http: HttpClient, private ngZone: NgZone) {}

  // HTTP Methods
  getAllHistory(): Observable<BatchesHistory[]> {
    return this.http.get<BatchesHistory[]>(`${this.BASE_URL}/getAllHistory`);
  }

  getHistoryByBatchId(batchId: number): Observable<BatchesHistory[]> {
    return this.http.get<BatchesHistory[]>(`${this.BASE_URL}/getHistoryByBatchId/${batchId}`);
  }

  getHistoryByStatus(status: number): Observable<BatchesHistory[]> {
    return this.http.get<BatchesHistory[]>(`${this.BASE_URL}/getHistoryByStatus/${status}`);
  }

  updateStatus(historyId: number, status: number): Observable<void> {
    return this.http.put<void>(`${this.BASE_URL}/updateStatus/${historyId}/${status}`, {});
  }

  processBatchHistory(batchHIds: number[]): Observable<any> {
    return this.http.post(`${this.BASE_URL}/processBatchHistory`, null, {
      params: { batchHIds: batchHIds.join(',') }
    });
  }

  // WebSocket Methods
  connectWebSocket(token: string): void {
    if (this.websocket?.readyState === WebSocket.OPEN) {
      console.log('WebSocket already connected');
      return;
    }

    this.intentionalDisconnect = false;
    this.connectionStatus$.next('connecting');

    try {
      const wsUrl = `${this.WS_URL}?token=${encodeURIComponent(token)}`;

      // Create WebSocket outside Angular zone to avoid unnecessary change detection on every event
      this.ngZone.runOutsideAngular(() => {
        this.websocket = new WebSocket(wsUrl);

        this.websocket.onopen = (event) => {
          console.log('WebSocket connected', event);
          this.ngZone.run(() => {
            this.connectionStatus$.next('connected');
          });
          this.reconnectAttempts = 0;
        };

        this.websocket.onmessage = (event) => {
          try {
            const update: BatchStatusUpdate = JSON.parse(event.data);
            console.log('Received status update:', update);
            this.ngZone.run(() => {
              this.statusUpdates$.next(update);
            });
          } catch (error) {
            console.error('Error parsing WebSocket message:', error);
          }
        };

        this.websocket.onerror = (error) => {
          console.error('WebSocket error:', error);
          this.ngZone.run(() => {
            this.connectionStatus$.next('disconnected');
          });
        };

        this.websocket.onclose = (event) => {
          console.log('WebSocket disconnected', event);
          this.ngZone.run(() => {
            this.connectionStatus$.next('disconnected');
          });

          if (!this.intentionalDisconnect) {
            this.attemptReconnect(token);
          }
        };
      });

    } catch (error) {
      console.error('Error creating WebSocket:', error);
      this.connectionStatus$.next('disconnected');
      if (!this.intentionalDisconnect) {
        this.attemptReconnect(token);
      }
    }
  }

  disconnectWebSocket(): void {
    this.intentionalDisconnect = true;

    if (this.websocket) {
      console.log('Disconnecting WebSocket');
      this.websocket.close();
      this.websocket = null;
    }

    if (this.reconnectTimer) {
      clearTimeout(this.reconnectTimer);
      this.reconnectTimer = null;
    }

    this.connectionStatus$.next('disconnected');
  }

  private attemptReconnect(token: string): void {
    if (this.intentionalDisconnect) {
      return;
    }

    if (this.reconnectAttempts >= this.maxReconnectAttempts) {
      console.error('Max reconnect attempts reached');
      return;
    }

    this.reconnectAttempts++;
    console.log(`Attempting reconnect ${this.reconnectAttempts}/${this.maxReconnectAttempts} in ${this.reconnectInterval}ms`);

    this.reconnectTimer = setTimeout(() => {
      this.connectWebSocket(token);
    }, this.reconnectInterval);
  }

  // Observables for components to subscribe
  getStatusUpdates(): Observable<BatchStatusUpdate> {
    return this.statusUpdates$.asObservable();
  }

  getConnectionStatus(): Observable<'connected' | 'disconnected' | 'connecting'> {
    return this.connectionStatus$.asObservable();
  }

  // Send ping to keep connection alive (optional)
  sendPing(): void {
    if (this.websocket?.readyState === WebSocket.OPEN) {
      this.websocket.send('ping');
    }
  }

  ngOnDestroy(): void {
    this.disconnectWebSocket();
    this.statusUpdates$.complete();
    this.connectionStatus$.complete();
  }
}
