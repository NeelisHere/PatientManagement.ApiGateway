package com.patientManagement.api_gateway.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.reactive.function.client.WebClientException;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(WebClientResponseException.Unauthorized.class)
    public ResponseEntity<String> WebClientResponseExceptionUnauthorizedHandler(ServerWebExchange exchange) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Token!");
    }
}
