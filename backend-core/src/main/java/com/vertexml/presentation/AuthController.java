package com.vertexml.presentation;
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/auth")
public class AuthController {
    @PostMapping("/login") public String login() { return "token"; }
}
