package com.example.service;

import com.example.domain.Order;

import java.util.List;
import java.util.Map;

/**
 * @author tuzhijin
 * @version Id: OrderService.java, v 0.1 2019/6/8 23:38 tuzhijin Exp $$
 */
public interface OrderService {

    List<Order> queryOrder(Map<String, Object> param);
}
