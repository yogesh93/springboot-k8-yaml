package com.javatechie.k8s;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XSSVulnerableController {

    @GetMapping("/greet")
    public String greetUser(@RequestParam String name) {
        return "<h1>Welcome, " + name + "!</h1>";  // 🚨 XSS Vulnerability
    }
}