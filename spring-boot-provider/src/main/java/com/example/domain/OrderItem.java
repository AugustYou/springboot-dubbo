package com.example.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class OrderItem {
    private String id;

    private String orderId;

    private String shoppingName;

    private Long price;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date updateTime;

    private String createBy;

    private String updateBy;

}
