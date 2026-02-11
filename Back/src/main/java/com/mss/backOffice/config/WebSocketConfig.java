package com.mss.backOffice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * STOMP WebSocket Configuration with SimpleBroker for development.
 *
 * This configuration uses STOMP (Simplified Message-Oriented Text Protocol) for real-time messaging.
 * SimpleBroker is suitable for single-server deployments. For multi-server deployments, switch to
 * Redis or RabbitMQ message broker.
 *
 * STOMP Destinations:
 * - /topic/* : Server-to-client broadcast topics (public)
 * - /queue/* : Server-to-client unicast queues (private per user)
 * - /app/* : Client-to-server message endpoints (request mapping)
 *
 * Best Practices Applied:
 * - Separated application prefixes (/app) from broker topics (/topic, /queue)
 * - SockJS fallback for browsers without WebSocket support
 * - CORS enabled for development (restrict in production)
 * - SimpleBroker for development, easily switchable to RabbitMQ/Redis for production
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    private static final Logger logger = LoggerFactory.getLogger(WebSocketConfig.class);

    /**
     * Configure the message broker for relay and destination prefixes.
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        logger.info("===================================================");
        logger.info("Configuring STOMP Message Broker");
        logger.info("===================================================");

        // Enable simple in-memory message broker
        // For production with multiple servers, use:
        // config.enableRabbitMqBroker("/topic", "/queue");
        // or
        // config.enableRedisMessageBroker("/topic", "/queue");
        config.enableSimpleBroker("/topic", "/queue");

        // Set the prefix for application-handled destination messages
        // Messages to destinations starting with /app will be routed to @MessageMapping methods
        config.setApplicationDestinationPrefixes("/app");

        // Set the prefix for user-specific destination messages
        // Used for point-to-point messaging (e.g., /user/queue/reply-to)
        config.setUserDestinationPrefix("/user");

        logger.info("Message broker configured: SimpleBroker with destinations /topic, /queue");
        logger.info("===================================================");
    }

    /**
     * Register WebSocket STOMP endpoints.
     * Clients connect to /ws endpoint and upgrade to STOMP protocol.
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        logger.info("===================================================");
        logger.info("Registering STOMP endpoints");
        logger.info("===================================================");

        registry.addEndpoint("/ws")
                .setAllowedOrigins("*")  // In production, restrict to specific origins
                .withSockJS()             // Enable SockJS fallback for older browsers
                .setSessionCookieNeeded(false);  // Avoid session cookie issues

        logger.info("STOMP endpoint registered at /ws with SockJS fallback");
        logger.info("===================================================");
    }
}

