package com.mss.backOffice.config;

import com.mss.backOffice.websocket.BatchHistoryWebSocketHandler;
import com.mss.backOffice.websocket.WebSocketHandshakeInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import javax.annotation.PostConstruct;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    private static final Logger logger = LoggerFactory.getLogger(WebSocketConfig.class);

    @Autowired
    private BatchHistoryWebSocketHandler batchHistoryWebSocketHandler;

    @Autowired
    private WebSocketHandshakeInterceptor handshakeInterceptor;

    @PostConstruct
    public void init() {
        logger.info("===================================================");
        logger.info("WebSocketConfig is being initialized!");
        logger.info("BatchHistoryWebSocketHandler: {}", batchHistoryWebSocketHandler != null ? "INJECTED" : "NULL");
        logger.info("WebSocketHandshakeInterceptor: {}", handshakeInterceptor != null ? "INJECTED" : "NULL");
        logger.info("===================================================");
    }

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        logger.info("===================================================");
        logger.info("Registering WebSocket handler at /ws/batch-history");
        logger.info("===================================================");

        registry.addHandler(batchHistoryWebSocketHandler, "/ws/batch-history")
                .addInterceptors(handshakeInterceptor)
                .setAllowedOrigins("*"); // Allow all origins for development

        logger.info("WebSocket handler registration completed!");
    }
}
