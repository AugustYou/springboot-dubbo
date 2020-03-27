package com.example.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private String id;

    private String amount;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private Date paymentTime;

    private String createBy;

    private Integer updateBy;

}
