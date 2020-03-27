package com.example.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Order {
    private String id;

    private String amount;

    private Integer status;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date updateTime;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date paymentTime;

    private String createBy;

    private Integer updateBy;

    List<OrderItem> items;

}
