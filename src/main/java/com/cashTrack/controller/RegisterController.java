package com.cashTrack.controller;

import com.cashTrack.dto.requestDto.RegisterDto;
import com.cashTrack.service.RegisterService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RegisterController {
    private final RegisterService registerService;

    public ResponseEntity<?> register(@Valid RegisterDto registerDto) {
        return ResponseEntity.ok(registerService.register(registerDto));

    }
}
