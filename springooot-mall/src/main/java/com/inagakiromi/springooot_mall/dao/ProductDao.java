package com.inagakiromi.springooot_mall.dao;

import com.inagakiromi.springooot_mall.dto.ProductRequest;
import com.inagakiromi.springooot_mall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
