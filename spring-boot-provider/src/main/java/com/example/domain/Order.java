package com.example.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class Order extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 357502069133030435L;

    private String id;

    private String amount;

    private Integer status;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date paymentTime;

    List<OrderItem> items;

}
