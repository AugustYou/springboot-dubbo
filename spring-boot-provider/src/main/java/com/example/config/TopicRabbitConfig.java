//package com.example.config;
//
//import org.springframework.amqp.core.Binding;
//import org.springframework.amqp.core.BindingBuilder;
//import org.springframework.amqp.core.Queue;
//import org.springframework.amqp.core.TopicExchange;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author tuzhijin
// * @version Id: TopicRabbitConfig.java, v 0.1 2019/6/11 13:45 tuzhijin Exp $$
// */
//@Configuration
//public class TopicRabbitConfig {
//
//    final static String message = "topic.message";
//    final static String messages = "topic.messages";
//
//    //定义队列列
//    @Bean
//    public Queue queueMessage() {
//        return new Queue(TopicRabbitConfig.message);
//    }
//
//    @Bean
//    public Queue queueMessages() {
//        return new Queue(TopicRabbitConfig.messages);
//    }
//
//    //交换机
//    @Bean
//    TopicExchange exchange() {
//        return new TopicExchange("exchange");
//    }
//
//    //将队列列和交换机绑定
//    @Bean
//    Binding bindingExchangeMessage(Queue queueMessage, TopicExchange exchange) {
//        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message");
//    }
//
//    @Bean
//    Binding bindingExchangeMessages(Queue queueMessages, TopicExchange exchange) {
//        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.#");
//    }
//}
