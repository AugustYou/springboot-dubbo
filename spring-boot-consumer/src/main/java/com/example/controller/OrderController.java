package com.example.controller;

import com.example.domain.Person;
import com.example.service.UserService;
import com.example.util.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author tuzhijin
 * @version Id: OrderController.java, v 0.1 2019/6/8 23:41 tuzhijin Exp $$
 */
@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private UserService userService;

    @GetMapping("/queryAll")
    public R queryAll() {
        return R.ok().put("order", userService.queryAll());
    }

    @GetMapping("/getDemo")
    public R getDemo(@RequestParam("id") Integer id) {
        return R.ok().put("info", id);
    }

    @PostMapping("/postDemo")
    public R postDemo(@RequestBody Person person) {
        log.info("参数：{}", person);
        return R.ok().put("order", person);
    }

    @PostMapping("/exchangeDemo")
    public R exchangeDemo(@RequestBody Person person) {
        log.info("参数：{}", person);
        return R.ok().put("order", person);
    }
}
