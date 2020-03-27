package com.example.service.impl;

import com.example.dao.OrderMapper;
import com.example.domain.Order;
import com.example.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author tuzhijin
 * @version Id: OrderServiceImpl.java, v 0.1 2019/6/8 23:39 tuzhijin Exp $$
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;


    @Override
    public List<Order> queryOrder(Map<String, Object> param) {
        return orderMapper.queryOrder(param);
    }
}
