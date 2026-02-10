package com.ibm.auth.controller;

import com.ibm.auth.security.JwtUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestParam String user) {
        return JwtUtil.generateToken(user);
    }
}
