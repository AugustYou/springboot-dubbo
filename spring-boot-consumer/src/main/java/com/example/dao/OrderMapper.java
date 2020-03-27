package com.example.dao;

import com.example.domain.Order;

public interface OrderMapper {
    int insert(Order record);

    int insertSelective(Order record);
}