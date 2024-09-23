package com.example.date_base.convert;


import com.example.date_base.dto.description.request.RequestDescriptionBriefProductDto;
import com.example.date_base.dto.description.response.ResponseDescriptionBriefProductDto;
import com.example.date_base.model.DescriptionBriefProduct;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DescriptionBriefProductMapper {

    ResponseDescriptionBriefProductDto toDTO(DescriptionBriefProduct model);
    DescriptionBriefProduct toModel(RequestDescriptionBriefProductDto dto);
}
