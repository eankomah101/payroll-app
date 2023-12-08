package com.eankomah.miniaturepayroll.service.Security.impl;


import com.eankomah.miniaturepayroll.dto.JwtAuthenticationResponse;
import com.eankomah.miniaturepayroll.dto.RefreshTokenRequest;
import com.eankomah.miniaturepayroll.dto.LogInRequest;

public interface AuthenticationService {

    JwtAuthenticationResponse logIn(LogInRequest logInRequest);

    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
