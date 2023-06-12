package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank(message = "The username is required.")
    private String username;

    @NotBlank(message = "The name is required.")
    private String name;

    @NotBlank(message = "The email is required.")
    private String email;
}