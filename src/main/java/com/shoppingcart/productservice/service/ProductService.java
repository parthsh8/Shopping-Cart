package com.shoppingcart.productservice.service;

import org.springframework.stereotype.Service;
import com.shoppingcart.productservice.dto.ProductRequest;
import com.shoppingcart.productservice.model.Product;
import com.shoppingcart.productservice.repsoitory.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j

public class ProductService 
{
    private final ProductRepository productRepository;

    public void CreateProduct(ProductRequest productRequest) 
    {
        Product product = Product.builder()
            .name(productRequest.getName())
            .description(productRequest.getDescription())
            .price(productRequest.getPrice())
                .build();
            
        productRepository.save(product);
        log.info("Product {} is saved",product.getId());
    }
    
}
