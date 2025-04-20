package com.inagakiromi.springooot_mall.dao;

import java.util.List;

import com.inagakiromi.springooot_mall.dto.ProductQueryParams;
import com.inagakiromi.springooot_mall.dto.ProductRequest;
import com.inagakiromi.springooot_mall.model.Product;

public interface ProductDao {
    
    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void updateStock(Integer productId, Integer stock);

    void deleteProductById(Integer productId);
}
