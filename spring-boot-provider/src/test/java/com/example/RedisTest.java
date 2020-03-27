/*
package com.example;

import com.example.domain.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

*/
/**
 * @author tuzhijin
 * @version Id: com.example.RedisTest.java, v 0.1 2019/6/11 11:02 tuzhijin Exp $$
 *//*

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @org.junit.Test
    public void testString() {
        redisTemplate.opsForValue().set("tzj", "hello world");
        Assert.assertEquals("hello world", redisTemplate.opsForValue().get("tzj"));
    }

    @org.junit.Test
    public void testObj() {
        Order order = new Order("233", "1000", 1);
        ValueOperations operations = redisTemplate.opsForValue();
        operations.set("object", order);
        Order o = (Order) operations.get("object");
        System.out.println("order: " + o);
    }

    @Test
    public void testExpire() throws InterruptedException {
        Order order = new Order("233", "1000", 1);
        ValueOperations<String, Order> operations = redisTemplate.opsForValue();
        operations.set("expire", order, 1100, TimeUnit.MILLISECONDS);
        Thread.sleep(1000);
        boolean exists = redisTemplate.hasKey("expire");
        if (exists) {
            System.out.println("exists is true");
        } else {
            System.out.println("exists is false");
        }
    }

    @Test
    public void testDelete() {
        ValueOperations<String, Order> operations = redisTemplate.opsForValue();
        redisTemplate.opsForValue().set("deletekey", "ityouknow");
        redisTemplate.delete("deletekey");
        boolean exists = redisTemplate.hasKey("deletekey");
        if (exists) {
            System.out.println("exists is true");
        } else {
            System.out.println("exists is false");
        }
    }
}
*/
