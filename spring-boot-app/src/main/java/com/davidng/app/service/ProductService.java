package com.davidng.app.service;

import com.davidng.app.dto.ProductDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class ProductService implements IProductService {

    @Override
    public ProductDto createProduct(ProductDto dto) {
        return null;
    }
}
