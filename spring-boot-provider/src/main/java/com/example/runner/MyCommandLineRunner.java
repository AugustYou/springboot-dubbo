package com.example.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author tuzhijin
 * @version Id: MyCommandLineRunner.java, v 0.1 2019/5/30 14:47 tuzhijin Exp $$
 */
@Component
@Order(-2)
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("MyCommandLineRunner init");
    }
}
