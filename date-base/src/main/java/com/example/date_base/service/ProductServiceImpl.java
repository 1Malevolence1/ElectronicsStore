package com.example.date_base.service;

import com.example.date_base.convert.ProductMapper;
import com.example.date_base.dto.RequestProductDto;
import com.example.date_base.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor

public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public void saveNewProduct(RequestProductDto requestDto) {
            productRepository.save(productMapper.toModel(requestDto));
    }
}
