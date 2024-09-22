package com.example.date_base.dto;

import com.ctc.wstx.shaded.msv_core.util.LightStack;
import com.example.date_base.dto.image.RequestImageDto;

import java.util.List;

/**
 * DTO for {@link com.example.date_base.model.Product}
 */
public record RequestProductDto(String name,
                                Integer price,
                                List<RequestImageDto> fileImages
) {

}