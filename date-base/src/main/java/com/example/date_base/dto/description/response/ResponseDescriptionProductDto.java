package com.example.date_base.dto.description.response;

import java.util.List;


public record ResponseDescriptionProductDto(
        Long id,
        ResponseDescriptionFullProductDto fullDescriptionProduct,
        List<ResponseDescriptionBriefProductDto> briefDescriptionProduct
) {
}
