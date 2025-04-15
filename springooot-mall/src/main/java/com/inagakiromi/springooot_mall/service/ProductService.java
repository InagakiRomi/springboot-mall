package com.inagakiromi.springooot_mall.service;

import com.inagakiromi.springooot_mall.dto.ProductRequest;
import com.inagakiromi.springooot_mall.model.Product;

public interface ProductService {
        Product getProductById(Integer productId);

        Integer createProduct(ProductRequest productRequest);

        void updateProduct(Integer productId,ProductRequest productRequest);

        void deleteProductById(Integer productId);
}
