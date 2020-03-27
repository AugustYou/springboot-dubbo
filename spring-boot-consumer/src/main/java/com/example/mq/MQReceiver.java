//package com.example.mq;
//
//import com.example.domain.Order;
//import org.springframework.amqp.rabbit.annotation.RabbitHandler;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
///**
// * @author tuzhijin
// * @version Id: HelloReceiver.java, v 0.1 2019/6/11 12:05 tuzhijin Exp $$
// */
////queues 指明队列列名称
//@Component
//@RabbitListener(queues = "testQueue")
//public class MQReceiver {
//
//    //@RabbitHandler 为具体接收的⽅方法
//    @RabbitHandler
//    public void process(Order order) {
//        System.out.println("Receiver object: " + order);
//    }
//}
