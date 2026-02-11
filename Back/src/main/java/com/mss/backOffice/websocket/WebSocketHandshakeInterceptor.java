package com.mss.backOffice.websocket;

import com.mss.backOffice.security.jwt.JwtProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

import javax.annotation.PostConstruct;

@Component
public class WebSocketHandshakeInterceptor implements HandshakeInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(WebSocketHandshakeInterceptor.class);

    // TODO: TEMPORARY - Set to true to disable authentication for development/testing
    // WARNING: Set this to false and implement proper authentication before production!
    private static final boolean DISABLE_AUTH_FOR_DEVELOPMENT = true;

    @Autowired
    private JwtProvider jwtProvider;

    @PostConstruct
    public void init() {
        logger.info("===================================================");
        logger.info("WebSocketHandshakeInterceptor bean created!");
        logger.info("Authentication disabled for development: {}", DISABLE_AUTH_FOR_DEVELOPMENT);
        logger.info("===================================================");
    }

    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response,
                                   WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception {

        // TEMPORARY: Allow connections without authentication during development
        if (DISABLE_AUTH_FOR_DEVELOPMENT) {
            attributes.put("username", "anonymous");
            logger.warn("WebSocket connection allowed WITHOUT authentication (development mode)");
            return true;
        }

        // Production authentication logic (currently disabled)
        if (request instanceof ServletServerHttpRequest) {
            ServletServerHttpRequest servletRequest = (ServletServerHttpRequest) request;
            HttpServletRequest httpRequest = servletRequest.getServletRequest();
            String token = httpRequest.getParameter("token");

            if (token != null && !token.isEmpty()) {
                try {
                    if (jwtProvider.validateToken(token)) {
                        String username = jwtProvider.getUserIdFromJWT(token);
                        attributes.put("username", username);
                        logger.info("WebSocket authenticated for user: {}", username);
                        return true;
                    } else {
                        logger.warn("WebSocket authentication failed - invalid or expired token");
                        return false;
                    }
                } catch (Exception e) {
                    logger.error("Error validating WebSocket token: {}", e.getMessage());
                    return false;
                }
            } else {
                logger.warn("WebSocket authentication failed - no token provided");
                return false;
            }
        }
        logger.warn("WebSocket authentication failed - not a servlet request");
        return false;
    }

    @Override
    public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response,
                              WebSocketHandler wsHandler, Exception exception) {
        if (exception != null) {
            logger.error("Error during WebSocket handshake: {}", exception.getMessage());
        }
    }
}
