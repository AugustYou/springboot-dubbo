package com.example.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.example.domain.Order;
import com.example.dto.OrderExcelDto;
import com.example.service.impl.OrderServiceImpl;
import com.example.util.R;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tuzhijin
 * @version Id: OrderController.java, v 0.1 2019/6/8 23:41 tuzhijin Exp $$
 */

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderServiceImpl orderService;

    @GetMapping("/queryOrder")
    public R queryOrder(String orderId) {
        return R.ok().put("order", orderService.selectById(orderId));
    }

    @GetMapping("/queryAll")
    public R queryAll(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 3); //pageNumber, pageSize，第几页，每页几条
        List<Order> orderList = orderService.queryAll();
        PageInfo page = new PageInfo(orderList);
        return R.ok().put("order", page);
    }

    @GetMapping("/orderExport")
    public void orderExport(HttpServletResponse response) throws Exception {
        String fileName = "订单信息";
        String codedFileName = java.net.URLEncoder.encode(fileName, "UTF-8");
        response.setHeader("content-Type", "application/vnd.ms-excel");
        response.setHeader("content-disposition", "attachment;filename=" + codedFileName + ".xls");
        List<Order> orderList = orderService.queryAll();

        List<OrderExcelDto> list = new ArrayList<OrderExcelDto>();
        Integer seqNo = 1;
        for (Order order : orderList) {
            OrderExcelDto excelDto = doToDto(order, seqNo);
            list.add(excelDto);
            seqNo++;
        }

        ExportParams exportParams = new ExportParams("订单明细", "交易数据");
        Workbook workbook = ExcelExportUtil.exportExcel(exportParams, OrderExcelDto.class, list);
        workbook.write(response.getOutputStream());
    }

    public static OrderExcelDto doToDto(Order order, Integer seqNo) {
        OrderExcelDto dto = new OrderExcelDto();
        dto.setSeqNo(String.valueOf(seqNo));
        dto.setOrderId(order.getOrderId());
        dto.setPayment(order.getPayment());
        dto.setCreateTime(order.getCreateTime());
        return dto;
    }

}
