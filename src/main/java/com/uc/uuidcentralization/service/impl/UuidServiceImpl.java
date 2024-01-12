package com.uc.uuidcentralization.service.impl;

import com.uc.uuidcentralization.service.UuidService;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public class UuidServiceImpl implements UuidService {
    @Override
    public String generateUuid() {
        return UUID.randomUUID().toString();
    }
}
