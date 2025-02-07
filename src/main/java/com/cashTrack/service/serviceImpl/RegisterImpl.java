package com.cashTrack.service.serviceImpl;

import com.cashTrack.dto.requestDto.RegisterDto;
import com.cashTrack.service.RegisterService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RegisterImpl implements RegisterService {

    @Override
    public ResponseEntity<?> register(RegisterDto registerDto) {
        return null;
    }
}
