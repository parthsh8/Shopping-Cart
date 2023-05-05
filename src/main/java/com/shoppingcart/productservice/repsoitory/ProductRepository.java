package com.shoppingcart.productservice.repsoitory;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.shoppingcart.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>
{

}
