package com.xzsd.app.customer.order.service;

import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.app.customer.order.dao.OrderDao;
import com.xzsd.app.customer.order.dao.OrderDetailsDao;
import com.xzsd.app.customer.order.entity.*;
import com.xzsd.app.util.AppResponse;
import com.xzsd.app.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author weiming
 * @date 2020-4-18
 */
@Service
public class OrderService {

    @Resource
    private OrderDao orderDao;
    @Resource
    private OrderDetailsDao orderDetailsDao;
    /**
     *新增订单
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addOrder(OrderDetailsU orderDetailsU){
        //新增订单
        String userId = SecurityUtils.getCurrentUserId();
        String orderId = StringUtil.getCommonCode(2);
        OrderU orderU = new OrderU();
        orderU.setUserId(userId);
        orderU.setOrderId(orderId);
        orderU.setGoodsNum(orderDetailsU.getNum());
        double totalPrice = orderDetailsU.getPrice()*orderDetailsU.getNum();
        orderU.setTotalPrice(totalPrice);
        int count= orderDao.addOrder(orderU);
        if(count == 0){
            return AppResponse.bizError("新增订单失败");
        }
        //新增订单详情
        orderDetailsU.setTotalPrice(totalPrice);
        orderDetailsU.setUserId(userId);
        orderDetailsU.setOrderId(orderId);
        int countDetail = orderDetailsDao.addOrderDetails(orderDetailsU);
        if(countDetail == 0){
            return AppResponse.bizError("新增订单详情失败");
        }
        return AppResponse.success("新增订单成功");
    }

    /**
     * 查询订单
     */
    public AppResponse getOrderList(String userId){
        List<Order> orderList = orderDao.getOrderList(userId);
        return AppResponse.success("查询订单成功",orderList);
    }

    /**
     * 查询订单详情
     */
    public AppResponse getOrderDetails(String orderId){
        OrderDetails orderDetails = orderDetailsDao.getGoodsDetails(orderId);
        return AppResponse.success("查询订单详情成功",orderDetails);
    }

    /**
     * 修改订单状态
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateOrderState(State state){
        String userId = SecurityUtils.getCurrentUserId();
        state.setUserId(userId);
        int count = orderDao.updateOrderState(state);
        if(count == 0){
            return AppResponse.bizError("修改订单状态失败");
        }
        if(state.getState() == 5){
            int countOrderDetails = orderDetailsDao.deleteOrderDetails(state.getOrderId());
            int countOrder = orderDao.deleteOrder(state.getOrderId());
            if(countOrder == 0 || countOrderDetails == 0){
                return AppResponse.bizError("修改订单状态失败");
            }
        }
        return AppResponse.success("修改订单状态成功");
    }

}
