package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class DateController {

    @GetMapping("/current-date")
    public LocalDateTime getCurrentDateTime() {
        return LocalDateTime.now();
    }
}
