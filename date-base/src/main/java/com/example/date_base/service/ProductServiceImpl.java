package com.example.date_base.service;

import com.example.date_base.convert.ProductMapper;
import com.example.date_base.dto.RequestProductDto;
import com.example.date_base.dto.ResponseProductDto;
import com.example.date_base.model.Product;
import com.example.date_base.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public ResponseProductDto saveNewProduct(RequestProductDto requestDto) {
        log.info("Данные dto: {}", requestDto);
        Product product = productMapper.toModel(requestDto);
        log.info("Итог после конвектирования: {}",product);
        log.info("метод закончился");
        return productMapper.toDTO(product);
    }
}
