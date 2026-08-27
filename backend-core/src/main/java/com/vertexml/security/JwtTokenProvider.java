package com.vertexml.security;
import org.springframework.stereotype.Component;
@Component
public class JwtTokenProvider {
    public String generateToken(String email) { return "dummy-jwt-token"; }
    public boolean validateToken(String token) { return true; }
}
