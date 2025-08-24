package com.lunawellness.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
@CrossOrigin(origins = "http://localhost:3000") // adjust if frontend runs elsewhere
public class SignupController {

    @Autowired
    private SignupRepository signupRepository;

    @PostMapping
    public Signup createSignup(@RequestBody Signup signup) {
        return signupRepository.save(signup);
    }

    @GetMapping
    public List<Signup> getAllSignups() {
        return signupRepository.findAll();
    }
}
