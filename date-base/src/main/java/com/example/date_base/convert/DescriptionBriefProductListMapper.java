package com.example.date_base.convert;


import com.example.date_base.dto.description.request.RequestDescriptionBriefProductDto;
import com.example.date_base.dto.description.response.ResponseDescriptionBriefProductDto;
import com.example.date_base.model.DescriptionBriefProduct;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = DescriptionBriefProductMapper.class)
public interface DescriptionBriefProductListMapper {

    List<ResponseDescriptionBriefProductDto> toDTO(List<DescriptionBriefProduct> listModel);
    List<DescriptionBriefProduct> toModel(List<RequestDescriptionBriefProductDto> listDto);
}
