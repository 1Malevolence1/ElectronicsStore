package com.example.date_base.dto.description.request;

import java.util.List;

public record RequestDescriptionProductDto(
        RequestDescriptionFullProductDto fullDescriptionProduct,
        List<RequestDescriptionBriefProductDto> briefDescriptionProduct
) {
}
