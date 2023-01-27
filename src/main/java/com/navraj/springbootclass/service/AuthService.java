package com.navraj.springbootclass.service;

import com.navraj.springbootclass.entity.dto.request.LoginRequest;
import com.navraj.springbootclass.entity.dto.request.RefreshTokenRequest;
import com.navraj.springbootclass.entity.dto.response.LoginResponse;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}