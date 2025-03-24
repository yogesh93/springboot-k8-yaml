package com.javatechie.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringApplicationDemo {


	@PostMapping(path = "/test/yogesh")
	public ResponseEntity<Object> getRecentReviewDashboard() {
		return ResponseEntity.ok("Test content");
	}

	@GetMapping(path = "/test/yogesh/get")
	public ResponseEntity<Object> getCall() {
		return ResponseEntity.ok("GET content");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringApplicationDemo.class, args);
	}

}
