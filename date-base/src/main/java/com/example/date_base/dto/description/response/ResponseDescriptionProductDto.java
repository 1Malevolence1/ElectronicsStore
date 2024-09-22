package com.example.date_base.dto.description.response;

import com.example.date_base.dto.description.request.RequestDescriptionBriefProductDto;
import com.example.date_base.dto.description.request.RequestDescriptionFullProductDto;

import java.util.List;

public record ResponseDescriptionProductDto(
        ResponseDescriptionFullProductDto fullDescriptionProduct,
        List<ResponseDescriptionBriefProductDto> briefDescriptionProduct
) {
}
