/*
package com.example;

import com.example.domain.Order;
import com.example.mq.MQSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

*/
/**
 * @author tuzhijin
 * @version Id: RabbitMqTest.java, v 0.1 2019/6/11 12:08 tuzhijin Exp $$
 *//*

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqTest {

    @Autowired
    private MQSender mqSender;


    @Test
    public void test() throws Exception {
        mqSender.send(new Order("666", "60000", 3));
        Thread.sleep(1000l);
    }

    @Test
    public void topic1() throws Exception {
        mqSender.send1();
        Thread.sleep(1000l);
    }

    @Test
    public void topic2() throws Exception {
        mqSender.send2();
        Thread.sleep(1000l);
    }
}
*/
