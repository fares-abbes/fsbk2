package com.mss.backOffice.websocket;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

@Component
public class BatchHistoryWebSocketHandler extends TextWebSocketHandler {

    private static final Logger logger = LoggerFactory.getLogger(BatchHistoryWebSocketHandler.class);
    private final ObjectMapper objectMapper = new ObjectMapper();

    // Thread-safe set to store active sessions
    private final Set<WebSocketSession> sessions = ConcurrentHashMap.newKeySet();

    @PostConstruct
    public void init() {
        logger.info("===================================================");
        logger.info("BatchHistoryWebSocketHandler bean created!");
        logger.info("===================================================");
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        sessions.add(session);
        String username = (String) session.getAttributes().get("username");
        logger.info("WebSocket connection established for user: {} (total: {})", username, sessions.size());

        // Send initial connection success message
        String welcomeMessage = "{\"type\":\"connected\",\"message\":\"Connected to batch history updates\"}";
        session.sendMessage(new TextMessage(welcomeMessage));
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        sessions.remove(session);
        String username = (String) session.getAttributes().get("username");
        logger.info("WebSocket connection closed for user: {} (status: {}, total: {})",
                    username, status, sessions.size());
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String payload = message.getPayload();
        logger.debug("Received message from client: {}", payload);

        // Handle ping/pong to keep connection alive
        if ("ping".equals(payload)) {
            session.sendMessage(new TextMessage("pong"));
        }
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        logger.error("WebSocket transport error for session {}: {}", session.getId(), exception.getMessage());
        sessions.remove(session);
    }

    /**
     * Broadcast status update to all connected clients
     */
    public void broadcastStatusUpdate(BatchStatusUpdateMessage message) {
        logger.info("broadcastStatusUpdate called - active sessions: {}, message: {}", sessions.size(), message);
        if (sessions.isEmpty()) {
            logger.warn("No active WebSocket sessions - skipping broadcast for batch {}", message.getBatchHId());
            return;
        }

        try {
            String json = objectMapper.writeValueAsString(message);
            TextMessage textMessage = new TextMessage(json);

            // Create a copy to avoid ConcurrentModificationException
            List<WebSocketSession> sessionsCopy = new ArrayList<>(sessions);
            int successCount = 0;

            for (WebSocketSession session : sessionsCopy) {
                try {
                    if (session.isOpen()) {
                        session.sendMessage(textMessage);
                        successCount++;
                        logger.debug("Sent status update to session: {}", session.getId());
                    } else {
                        sessions.remove(session);
                        logger.debug("Removed closed session: {}", session.getId());
                    }
                } catch (Exception e) {
                    logger.error("Error sending message to session {}: {}", session.getId(), e.getMessage());
                    sessions.remove(session);
                }
            }

            logger.info("Broadcasted status update for batch {} to {} clients",
                        message.getBatchHId(), successCount);

        } catch (Exception e) {
            logger.error("Error serializing batch status update message: {}", e.getMessage());
        }
    }

    /**
     * Get count of active WebSocket sessions
     */
    public int getActiveSessionCount() {
        return sessions.size();
    }
}
