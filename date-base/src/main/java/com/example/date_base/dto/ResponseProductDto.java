package com.example.date_base.dto;

/**
 * DTO for {@link com.example.date_base.model.Product}
 */
public record ResponseProductDto(

        Long id, String name, Integer price) {
}