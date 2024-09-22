package com.example.date_base.service;

import com.example.date_base.dto.RequestProductDto;
import com.example.date_base.dto.ResponseProductDto;

public interface ProductService {


    ResponseProductDto saveNewProduct(RequestProductDto requestDto);
}
