package com.example.date_base.dto;

import com.example.date_base.dto.description.request.RequestDescriptionProductDto;
import com.example.date_base.dto.image.RequestImageDto;

import java.util.List;

/**
 * DTO for {@link com.example.date_base.model.Product}
 */
public record RequestProductDto(String name,
                                Integer price,
                                List<RequestImageDto> fileImages,
                                RequestDescriptionProductDto description
) {

}