package com.example.date_base.convert;


import com.example.date_base.dto.image.RequestImageDto;
import com.example.date_base.dto.image.ResponseImageDto;
import com.example.date_base.model.Image;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ImageMapper {


    Image toModel(RequestImageDto dtoImage);

    @Mapping(target = "fileImages", expression = "java(ImageUtils.getImageDataInBase64(model))")
    ResponseImageDto toDTO(Image model);


}
