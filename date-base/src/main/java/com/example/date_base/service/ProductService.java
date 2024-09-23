package com.example.date_base.service;

import com.example.date_base.dto.RequestProductDto;
import com.example.date_base.dto.ResponseProductDto;

import java.util.List;
import java.util.Optional;

public interface ProductService {


    List<ResponseProductDto> listAllProduct();

    void saveNewProduct(RequestProductDto requestDto);

    ResponseProductDto findProduct(Long id);

    void updateProduct(RequestProductDto dto, Long id);

    void deleteProduct(Long id);
}
