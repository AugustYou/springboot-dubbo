package com.example.controller;

import com.example.service.UserService;
import com.example.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tuzhijin
 * @version Id: OrderController.java, v 0.1 2019/6/8 23:41 tuzhijin Exp $$
 */

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private UserService userService;

    @GetMapping("/queryAll")
    public R queryAll() {
        return R.ok().put("order", userService.queryAll());
    }

}
