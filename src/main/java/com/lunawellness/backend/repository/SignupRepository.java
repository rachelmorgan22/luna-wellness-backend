package com.lunawellness.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lunawellness.backend.model.Signup;

public interface SignupRepository extends JpaRepository<Signup, Long> {
}
