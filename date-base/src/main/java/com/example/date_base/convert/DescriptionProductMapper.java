package com.example.date_base.convert;


import com.example.date_base.dto.ResponseProductDto;
import com.example.date_base.dto.description.request.RequestDescriptionProductDto;
import com.example.date_base.dto.description.response.ResponseDescriptionProductDto;
import com.example.date_base.model.DescriptionProduct;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {DescriptionBriefProductListMapper.class, DescriptionFullProductMapper.class})
public interface DescriptionProductMapper {

    ResponseDescriptionProductDto toDTO(DescriptionProduct model);

    DescriptionProduct toModel(RequestDescriptionProductDto dto);
}
