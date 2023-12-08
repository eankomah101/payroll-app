package com.eankomah.miniaturepayroll.controller;


import com.eankomah.miniaturepayroll.dto.JwtAuthenticationResponse;
import com.eankomah.miniaturepayroll.dto.RefreshTokenRequest;
import com.eankomah.miniaturepayroll.dto.LogInRequest;
import com.eankomah.miniaturepayroll.service.Security.impl.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;
//http://localhost:8080/api/v1/auth/logIn

    @PostMapping("/logIn")
    public ResponseEntity<JwtAuthenticationResponse> logIn(@RequestBody LogInRequest logInRequest){
        return ResponseEntity.ok(authenticationService.logIn(logInRequest));

    }

    @PostMapping("/refresh")
    public ResponseEntity<JwtAuthenticationResponse> refresh(@RequestBody RefreshTokenRequest refreshTokenRequest){
        return ResponseEntity.ok(authenticationService.refreshToken(refreshTokenRequest));

    }

}
