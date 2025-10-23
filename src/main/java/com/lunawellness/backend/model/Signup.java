package com.lunawellness.backend.model;

import java.time.Instant;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "signups")
public class Signup {

    @Id
    private String id;  // MongoDB ID is String

    private String name;
    private String email;

    @Field("class_type")
    private String classType;

    private String username;
    private String password;

    @CreatedDate
    @Field("created_at")
    private Instant createdAt;

    // Constructors
    public Signup() {}

    public Signup(String name, String email, String classType, String username, String password) {
        this.name = name;
        this.email = email;
        this.classType = classType;
        this.username = username;
        this.password = password;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getClassType() { return classType; }
    public void setClassType(String classType) { this.classType = classType; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public Instant getCreatedAt() { return createdAt; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }
}
