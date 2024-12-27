package com.davidng.app.controller;

import com.davidng.app.dto.BaseResponse;
import com.davidng.app.dto.ProductDto;
import com.davidng.app.service.ProductService;
import com.davidng.app.validator.PreventDuplicateValidator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    @PreventDuplicateValidator(
            includeFieldKeys = {"productId", "transactionId"},
            optionalValues = {"CAFEINCODE"},
            expireTime = 40_000L)
    public BaseResponse<?> createProduct(@RequestBody ProductDto request) {
        return BaseResponse.ofSucceeded(productService.createProduct(request));
    }
}
