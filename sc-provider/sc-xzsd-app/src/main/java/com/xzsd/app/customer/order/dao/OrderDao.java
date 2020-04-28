package com.xzsd.app.customer.order.dao;

import com.xzsd.app.customer.order.entity.Order;
import com.xzsd.app.customer.order.entity.OrderU;
import com.xzsd.app.customer.order.entity.State;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author weiming
 * @date 2020-4-18
 */
@Mapper
public interface OrderDao {
    /**
     * 查询订单列表
     */
    List<Order> getOrderList(String userId);
    /**
     * 新增订单
     */
    int addOrder(OrderU orderU);
    /**
     * 删除订单
     */
    int deleteOrder(String userId);
    /**
     * 修改订单状态
     */
    int updateOrderState(State state);
}
