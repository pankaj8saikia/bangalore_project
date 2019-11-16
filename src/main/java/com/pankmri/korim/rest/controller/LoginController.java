package com.pankmri.korim.rest.controller;

import com.pankmri.korim.rest.dto.LoginDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Project user-activity
 * @Author mgohain
 * @Created 2019-11-16
 **/
@Controller
@RequestMapping("/api/1.0/user")
public class LoginController {
    @PostMapping(value = "/login")
    public ResponseEntity login(LoginDTO loginDTO) {
        return ResponseEntity.ok("Logged in successfully");
    }
}
