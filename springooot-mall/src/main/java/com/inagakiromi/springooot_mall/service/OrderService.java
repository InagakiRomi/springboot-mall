package com.inagakiromi.springooot_mall.service;

import java.util.List;

import com.inagakiromi.springooot_mall.dto.CreateOrderRequest;
import com.inagakiromi.springooot_mall.dto.OrderQueryParams;
import com.inagakiromi.springooot_mall.model.Order;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId,CreateOrderRequest createOrderRequest);
}
