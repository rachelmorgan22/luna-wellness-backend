package com.lunawellness.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lunawellness.backend.model.Signup;
import com.lunawellness.backend.repository.SignupRepository;

@RestController
@RequestMapping("/api/signups")
@CrossOrigin(origins = "https://lunawellness.netlify.app/") // replace with actual Netlify URL
public class SignupController {

    @Autowired
    private SignupRepository signupRepository;

    // ✅ Health check endpoint for Railway / monitoring
    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("Backend is healthy!");
    }

    // ✅ Create new signup
    @PostMapping
    public Signup createSignup(@RequestBody Signup signup) {
        return signupRepository.save(signup);
    }

    // ✅ Get all signups
    @GetMapping
    public List<Signup> getAllSignups() {
        return signupRepository.findAll();
    }
}
