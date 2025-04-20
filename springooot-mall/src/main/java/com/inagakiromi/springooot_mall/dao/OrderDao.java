package com.inagakiromi.springooot_mall.dao;

import java.util.List;

import com.inagakiromi.springooot_mall.model.Order;
import com.inagakiromi.springooot_mall.model.OrderItem;

public interface OrderDao {

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItems);
}
