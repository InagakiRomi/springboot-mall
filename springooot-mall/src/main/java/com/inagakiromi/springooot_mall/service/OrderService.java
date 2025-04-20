package com.inagakiromi.springooot_mall.service;

import com.inagakiromi.springooot_mall.dto.CreateOrderRequest;
import com.inagakiromi.springooot_mall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId,CreateOrderRequest createOrderRequest);
}
