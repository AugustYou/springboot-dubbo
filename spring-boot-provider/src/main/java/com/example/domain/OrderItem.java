package com.example.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderItem extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 5777846899765500421L;

    private String id;

    private String orderId;

    private String shoppingName;

    private Long price;

}
