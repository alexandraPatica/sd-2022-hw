package com.app.bookingapp.security.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class SignupRequest {
    private String username;
    private String email;
    private String password;
    private Boolean admin;
    private Set<String> roles;
}
