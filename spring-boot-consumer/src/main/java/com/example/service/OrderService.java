package com.example.service;

import com.example.domain.Order;

import java.util.List;

/**
 * @author tuzhijin
 * @version Id: OrderService.java, v 0.1 2019/6/8 23:38 tuzhijin Exp $$
 */
public interface OrderService {

    Order selectById(String orderId);

    List<Order> queryAll();
}
