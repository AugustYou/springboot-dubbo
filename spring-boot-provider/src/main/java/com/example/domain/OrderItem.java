package com.example.domain;

import lombok.Data;

import java.util.Date;

@Data
public class OrderItem {
    private String id;

    private String orderId;

    private String shoppname;

    private Long price;

    private Date createTime;

    private Date updateTime;

    private String createBy;

    private String updateBy;

}
