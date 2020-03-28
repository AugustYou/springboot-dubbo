package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tuzhijin
 * @version Id: RestTemplateController.java, v 0.1 2020/3/28 22:35 tuzhijin Exp $$
 */
@Slf4j
@RestController
public class RestTemplateController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("getDemo")
    public String getDemo(Integer id) {
        return restTemplate.getForObject("http://localhost:8081/order/getDemo?id="+id, String.class);
    }

    @GetMapping("exchangeDemo")
    public String exchangeDemo(Integer id, String name) {
        HttpHeaders headers = new HttpHeaders();//header参数
        headers.setContentType(MediaType.APPLICATION_JSON);

        JSONObject obj = new JSONObject();//放入body中的json参数
        obj.put("userId", id);
        obj.put("name", name);
        HttpEntity<JSONObject> request = new HttpEntity<JSONObject>(obj, headers); //组装

        ResponseEntity<String> response = restTemplate.exchange("http://localhost:8081/order/exchangeDemo",
                HttpMethod.POST, request, String.class);
        log.info("返回结果：{}", response);
        return response.getBody();
    }

    @GetMapping("postDemo")
    public String postDemo(Integer id, String name) {
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("userId", id);
        param.put("name", name);
        HttpEntity<String> formEntity = new HttpEntity<String>(JSON.toJSONString(param), headers);
        String result = restTemplate.postForObject("http://localhost:8081/order/postDemo", formEntity, String.class);
        log.info("返回结果：{}", result);
        return result;
    }
}
