//package com.example.mq;
//
//import org.springframework.amqp.rabbit.annotation.RabbitHandler;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
///**
// * @author tuzhijin
// * @version Id: TopicReceiver.java, v 0.1 2019/6/11 13:48 tuzhijin Exp $$
// */
//@Component
//@RabbitListener(queues = "topic.message")
//public class TopicReceiver {
//
//    @RabbitHandler
//    public void process(String message) {
//        System.out.println("Topic Receiver1 : " + message);
//    }
//}
//
