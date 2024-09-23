package com.example.date_base.convert;


import com.example.date_base.dto.ResponseProductDto;
import com.example.date_base.model.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = ProductMapper.class)
public interface ProductListMapper {

    List<ResponseProductDto> toListDTO(List<Product> listModel);
}
