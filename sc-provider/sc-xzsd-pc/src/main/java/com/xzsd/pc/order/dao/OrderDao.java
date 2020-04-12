package com.xzsd.pc.order.dao;

import com.xzsd.pc.order.entity.OrderInfo;
import com.xzsd.pc.order.entity.OrderInfoF;
import com.xzsd.pc.order.entity.OrderInfoV;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDao {
    /**
     * 查询订单列表
     */
    List<OrderInfo> listOrderByPage(OrderInfoF orderInfoF);
    /**
     * 查询订单详情
     */
    OrderInfo getOrderById(String orderId);
    /**
     * 修改订单状态
     */
    int updateOrderState(List<OrderInfoV> orderInfoVList);
    /**
     * 校验该订单是否存在
     */
    int countOrder(String orderId);
}
