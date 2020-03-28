package com.example.controller;

import com.example.controller.base.ResultBody;
import com.example.domain.Order;
import com.example.exception.BizException;
import com.example.service.impl.OrderServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author tuzhijin
 * @version Id: OrderController.java, v 0.1 2019/6/8 23:41 tuzhijin Exp $$
 */

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Autowired
    private OrderServiceImpl orderService;


    @GetMapping("/queryAll")
    public ResultBody queryAll(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 3); //pageNumber, pageSize，第几页，每页几条
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("beginTime", "2020-03-27 08:16:12");
        param.put("endTime", "2020-03-27 20:16:12");
        List<Order> orderList = orderService.queryOrder(param);
        PageInfo page = new PageInfo(orderList);
        return ResultBody.success(page);
    }

    @PostMapping("/update")
    public boolean update(@RequestBody Order order) {
        //这里故意造成一个空指针的异常，并且不进行处理
        String str = null;
        str.equals("111");
        return true;
    }

    @PostMapping("/delete")
    public boolean delete(@RequestBody Order order) {
        //这里故意造成一个空指针的异常，并且不进行处理
        if (StringUtils.isBlank(order.getId())) {
            throw new BizException("-1", "id不能为空！");
        }
        return true;
    }

//    @GetMapping("/orderExport")
//    public void orderExport(HttpServletResponse response) throws Exception {
//        String fileName = "订单信息";
//        String codedFileName = java.net.URLEncoder.encode(fileName, "UTF-8");
//        response.setHeader("content-Type", "application/vnd.ms-excel");
//        response.setHeader("content-disposition", "attachment;filename=" + codedFileName + ".xls");
//        List<Order> orderList = orderService.queryAll();
//
//        List<OrderExcelDto> list = new ArrayList<OrderExcelDto>();
//        Integer seqNo = 1;
//        for (Order order : orderList) {
//            OrderExcelDto excelDto = doToDto(order, seqNo);
//            list.add(excelDto);
//            seqNo++;
//        }
//
//        ExportParams exportParams = new ExportParams("订单明细", "交易数据");
//        Workbook workbook = ExcelExportUtil.exportExcel(exportParams, OrderExcelDto.class, list);
//        workbook.write(response.getOutputStream());
//    }


}
