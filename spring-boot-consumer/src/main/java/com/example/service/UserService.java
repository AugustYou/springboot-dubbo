package com.example.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.domain.Order;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tuzhijin
 * @version Id: UserServiceImpl.java, v 0.1 2019/6/12 15:10 tuzhijin Exp $$
 */
@Service
public class UserService {

    @Reference
    private OrderService orderService;

    public List<Order> queryAll(){
        return orderService.queryAll();
    }
}
