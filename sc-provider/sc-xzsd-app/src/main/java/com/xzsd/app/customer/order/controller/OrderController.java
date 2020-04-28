package com.xzsd.app.customer.order.controller;

import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.app.customer.order.entity.OrderDetails;
import com.xzsd.app.customer.order.entity.OrderDetailsU;
import com.xzsd.app.customer.order.entity.OrderU;
import com.xzsd.app.customer.order.entity.State;
import com.xzsd.app.customer.order.service.OrderService;
import com.xzsd.app.util.AppResponse;
import com.xzsd.app.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author weiming
 * @date 2020-4-20
 */
@RestController
@RequestMapping("/customer")
public class OrderController {

    @Resource
    private OrderService orderService;

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    /**
     *新增订单(立即购买时)
     */
    @RequestMapping("buyAtNow")
    public AppResponse addOrder(OrderDetailsU orderDetailsU){
        try{
            return orderService.addOrder(orderDetailsU);
        }catch (Exception e){
            logger.error("新增订单失败",e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询订单列表
     */
    @RequestMapping("orderList")
    public AppResponse getOrder(){
        try{
            String userId = SecurityUtils.getCurrentUserId();
            return orderService.getOrderList(userId);
        }catch (Exception e){
            logger.error("查询订单失败",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询订单详情
     */
    @RequestMapping("findorder")
    public AppResponse getOrderDetails(String orderId){
        try{
            return orderService.getOrderDetails(orderId);
        }catch (Exception e){
            logger.error("查询订单详情失败",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 修改订单状态
     */
    @RequestMapping("updataOrderGoodsState")
    public AppResponse updateOrderState(State state){
        try{
            return orderService.updateOrderState(state);
        }catch (Exception e){
            logger.error("修改订单状态失败",e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
