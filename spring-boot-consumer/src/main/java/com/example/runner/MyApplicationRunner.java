package com.example.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author tuzhijin
 * @version Id: MyApplicationRunner.java, v 0.1 2019/5/30 14:45 tuzhijin Exp $$
 */
@Component
@Order(-1)
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("MyApplicationRunner init");
    }
}
