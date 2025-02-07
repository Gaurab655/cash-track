package com.cashTrack.service;

import com.cashTrack.dto.requestDto.RegisterDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;

public interface RegisterService {
    ResponseEntity<?> register(@Valid RegisterDto registerDto);
}
