package com.example.date_base.service;

import com.example.date_base.convert.DescriptionProductMapper;
import com.example.date_base.convert.ImageListMapper;
import com.example.date_base.convert.ProductListMapper;
import com.example.date_base.convert.ProductMapper;
import com.example.date_base.dto.RequestProductDto;
import com.example.date_base.dto.ResponseProductDto;
import com.example.date_base.repository.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;


@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    private final ProductListMapper productListMapper;
    private final DescriptionProductMapper descriptionProductMapper;
    private final ImageListMapper imageListMapper;
    private final String TEXT_ERROR_NO_SUCH_ELEMENT_EXCEPTION = "Not find product with id: %d";

    @Override
    public List<ResponseProductDto> listAllProduct() {
        return productListMapper.toListDTO(productRepository.findAll());
    }

    @Override
    @Transactional
    public void saveNewProduct(RequestProductDto requestDto) {
         productRepository.save(productMapper.toModel(requestDto));
    }

    @Override
    public ResponseProductDto findProduct(Long id) {
        return productMapper.toDTO(productRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException(TEXT_ERROR_NO_SUCH_ELEMENT_EXCEPTION.formatted(id))));
    }

    @Override
    @Transactional
    public void updateProduct(RequestProductDto dto, Long id) {
        productRepository.findById(id).ifPresentOrElse(
                product -> {
                    product.setName(dto.name());
                    product.setPrice(dto.price());
                    product.setDescription(descriptionProductMapper.toModel(dto.description()));
                    product.setFileImages(imageListMapper.toListModel(dto.fileImages()));
                }, () -> {
                    throw new NoSuchElementException(TEXT_ERROR_NO_SUCH_ELEMENT_EXCEPTION.formatted(id));
                });
    }


    @Override
    public void deleteProduct(Long id) {
        if(!productRepository.existsById(id)){
            throw new NoSuchElementException(TEXT_ERROR_NO_SUCH_ELEMENT_EXCEPTION.formatted(id));
        }
        productRepository.deleteById(id);
    }

}
