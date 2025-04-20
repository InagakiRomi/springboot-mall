package com.inagakiromi.springooot_mall.service;

import com.inagakiromi.springooot_mall.dto.CreateOrderRequest;

public interface OrderService {
    Integer createOrder(Integer userId,CreateOrderRequest createOrderRequest);
}
