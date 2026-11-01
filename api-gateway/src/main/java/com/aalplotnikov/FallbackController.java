package com.aalplotnikov;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/fallback/users")
    public ResponseEntity<String> userServiceFallback() {
        return ResponseEntity
                .status(HttpStatus.SERVICE_UNAVAILABLE)
                .body("Сервис пользователь сейчас временно недоступен");
    }

    @GetMapping("/fallback/notifications")
    public ResponseEntity<String> notificationsServiceFallback() {
        return ResponseEntity
                .status(HttpStatus.SERVICE_UNAVAILABLE)
                .body("Сервис уведомлений сейчас временно недоступен");
    }
}
