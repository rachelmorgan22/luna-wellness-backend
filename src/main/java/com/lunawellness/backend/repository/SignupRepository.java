package com.lunawellness.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lunawellness.backend.model.Signup;


@Repository
public interface SignupRepository extends JpaRepository<Signup, Long> {
}
