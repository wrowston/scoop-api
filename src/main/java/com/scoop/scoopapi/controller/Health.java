package com.scoop.scoopapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Health {

    @GetMapping("/health")
    public ResponseEntity getHealthStatus() {
        return ResponseEntity.ok("OK");
    }
}
