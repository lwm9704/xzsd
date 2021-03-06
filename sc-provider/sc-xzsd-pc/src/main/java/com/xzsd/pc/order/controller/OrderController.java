package com.xzsd.pc.order.controller;

import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.pc.order.entity.OrderInfoF;
import com.xzsd.pc.order.service.OrderService;
import com.xzsd.pc.util.AppResponse;
import com.xzsd.pc.util.AuthorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author weiming
 * @date 2020-4-5
 */
@RestController
@RequestMapping("/user")
public class OrderController {

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Resource
    private OrderService orderService;

    /**
     * 查询订单列表
     * @param
     * @return
     * @author weiming
     * @date 2020-4-5
     */
    @RequestMapping("listOrder")
    public AppResponse listOrder(OrderInfoF orderInfoF){
        try{
            return orderService.listOrder(orderInfoF);
        }catch (Exception e){
            logger.error("查询订单列表异常",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询订单详情
     * @param
     * @return
     * @author weiming
     * @date 2020-4-5
     */
    @RequestMapping("getOrder")
    public AppResponse getOrderById(String orderId){
        try{
            return orderService.getOrderById(orderId);
        }catch (Exception e){
            logger.error("查询订单错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 修改订单状态
     * @param
     * @return
     * @author weiming
     * @date 2020-4-5
     */
    @PostMapping("updateOrderState")
    public AppResponse updateOrder(String orderId,int orderState){
        try{
            return orderService.updateOrderState(orderId,orderState);
        }catch (Exception e){
            logger.error("修改订单状态错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
