package com.example.dto;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.util.Date;

/**
 * @author tuzhijin
 * @version Id: OrderExcelDto.java, v 0.1 2019/6/10 22:43 tuzhijin Exp $$
 */

public class OrderExcelDto {

    @Excel(name = "序号", width = 20, orderNum = "0")
    private String seqNo;

    @Excel(name = "订单号", width = 20, orderNum = "1")
    private String orderId;

    @Excel(name = "支付金额", width = 20, orderNum = "2")
    private String payment;

    @Excel(name = "交易时间", width = 30, exportFormat = "yyyy-MM-dd HH:mm:ss", orderNum = "3")
    private Date createTime;

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
