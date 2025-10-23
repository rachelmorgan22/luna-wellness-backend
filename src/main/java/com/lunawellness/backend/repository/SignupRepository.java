package com.lunawellness.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lunawellness.backend.model.Signup;

@Repository
public interface SignupRepository extends MongoRepository<Signup, String> {
}
