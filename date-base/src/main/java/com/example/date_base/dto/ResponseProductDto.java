package com.example.date_base.dto;

import com.example.date_base.dto.image.ResponseImageDto;
import jdk.jfr.RecordingState;

import java.util.List;

/**
 * DTO for {@link com.example.date_base.model.Product}
 */
public record ResponseProductDto(
        Long id, String name,
        Integer price,
        List<ResponseImageDto> fileImages) {
}