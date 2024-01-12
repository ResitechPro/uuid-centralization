package com.uc.uuidcentralization.web;

import com.uc.uuidcentralization.domain.dto.response.uuid.UuidResponseDto;
import com.uc.uuidcentralization.service.UuidService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/uuids")
public class UuidRest {
    private final UuidService uuidService;

    public UuidRest(UuidService uuidService) {
        this.uuidService = uuidService;
    }

    @GetMapping("/generate")
    public ResponseEntity<UuidResponseDto> generateUuid() {
        return ResponseEntity.ok().body(
                UuidResponseDto.builder()
                        .uuid(uuidService.generateUuid())
                        .build()
        );
    }
}
