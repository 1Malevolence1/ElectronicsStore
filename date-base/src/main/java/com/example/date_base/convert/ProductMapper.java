package com.example.date_base.convert;


import com.example.date_base.dto.RequestProductDto;
import com.example.date_base.dto.ResponseProductDto;
import com.example.date_base.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ResponseProductDto toDTO(Product dto);

    Product toModel(RequestProductDto dto);

}
