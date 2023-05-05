package com.shoppingcart.productservice.repsoitory.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcart.productservice.dto.ProductRequest;
import com.shoppingcart.productservice.service.ProductService;

import lombok.RequiredArgsConstructor;

//for implementing REST API
@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor

public class ProductController 
{
    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void CreateProduct(@RequestBody ProductRequest productRequest)
    {
        productService.CreateProduct(productRequest);

    }
    
    
}
