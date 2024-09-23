package com.example.date_base.convert;


import com.example.date_base.dto.description.request.RequestDescriptionFullProductDto;
import com.example.date_base.dto.description.request.RequestDescriptionProductDto;
import com.example.date_base.dto.description.response.ResponseDescriptionFullProductDto;
import com.example.date_base.model.DescriptionFullProduct;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DescriptionFullProductMapper {

    DescriptionFullProduct toModel(RequestDescriptionFullProductDto dto);
    ResponseDescriptionFullProductDto toDTO(DescriptionFullProduct model);
}
