package com.example.date_base.dto.description.response;

import java.util.List;


public record ResponseDescriptionProductDto(
        ResponseDescriptionFullProductDto fullDescriptionProduct,
        List<ResponseDescriptionBriefProductDto> briefDescriptionProduct
) {
}
