package com.example.date_base.convert;


import com.example.date_base.dto.image.RequestImageDto;
import com.example.date_base.dto.image.ResponseImageDto;
import com.example.date_base.model.Image;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = ImageMapper.class)
public interface ImageListMapper {

    List<ResponseImageDto> toListDTO(List<Image> modelList);
    List<Image> toListModel(List<RequestImageDto> dtoList);

}
