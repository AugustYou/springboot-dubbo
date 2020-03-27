package com.example.service.impl;

import com.example.dao.OrderMapper;
import com.example.domain.Order;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tuzhijin
 * @version Id: OrderServiceImpl.java, v 0.1 2019/6/8 23:39 tuzhijin Exp $$
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order selectById(String orderId) {
        return orderMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public List<Order> queryAll() {
        return orderMapper.queryAll();
    }
}
