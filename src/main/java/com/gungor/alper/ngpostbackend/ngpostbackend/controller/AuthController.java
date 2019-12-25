package com.gungor.alper.ngpostbackend.ngpostbackend.controller;

import com.gungor.alper.ngpostbackend.ngpostbackend.dto.LoginRequest;
import com.gungor.alper.ngpostbackend.ngpostbackend.dto.RegisterRequest;
import com.gungor.alper.ngpostbackend.ngpostbackend.security.AuthenticationResponse;
import com.gungor.alper.ngpostbackend.ngpostbackend.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ag on 22.12.2019
 */
@RestController
@RequestMapping("/api/auth")
public class AuthController {


    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody RegisterRequest registerRequest){
        authService.signup(registerRequest);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/login")
    public AuthenticationResponse login(@RequestBody LoginRequest loginRequest){
        return authService.login(loginRequest);
    }
}
