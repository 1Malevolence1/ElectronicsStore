package com.example.date_base.controller;


import com.example.date_base.dto.RequestProductDto;
import com.example.date_base.dto.ResponseProductDto;
import com.example.date_base.service.ProductService;
import jakarta.ws.rs.POST;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/data-base")
@RequiredArgsConstructor
public class ProductManagerRestController {

    private final ProductService productService;

    @PostMapping()
    public ResponseEntity<ResponseProductDto> save(@RequestBody RequestProductDto dto){
        productService.saveNewProduct(dto);
        return ResponseEntity.ok(productDto);
    }


}
