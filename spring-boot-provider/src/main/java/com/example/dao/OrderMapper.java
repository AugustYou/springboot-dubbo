package com.example.dao;

import com.example.domain.Order;

import java.util.List;
import java.util.Map;

public interface OrderMapper {
    int insert(Order record);

    int insertSelective(Order record);

    List<Order> queryOrder(Map<String, Object> param);
}
