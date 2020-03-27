//package com.example.mq;
//
//import com.example.domain.Order;
//import org.springframework.amqp.core.AmqpTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
///**
// * @author tuzhijin
// * @version Id: HelloSender.java, v 0.1 2019/6/11 12:05 tuzhijin Exp $$
// */
//@Component
//public class MQSender {
//
//    @Autowired
//    private AmqpTemplate rabbitTemplate;
//
//    public void send(Order order) {
//        System.out.println("Sender object: " + order.toString());
//        this.rabbitTemplate.convertAndSend("testQueue", order);
//    }
//
//    public void send1() {
//        String context = "hi, i am message 1";
//        System.out.println("Sender : " + context);
//        this.rabbitTemplate.convertAndSend("exchange", "topic.message", context);
//    }
//
//    public void send2() {
//        String context = "hi, i am messages 2";
//        System.out.println("Sender : " + context);
//        this.rabbitTemplate.convertAndSend("exchange", "topic.messages", context);
//    }
//}
