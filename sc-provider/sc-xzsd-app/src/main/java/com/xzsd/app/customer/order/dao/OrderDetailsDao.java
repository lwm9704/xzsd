package com.xzsd.app.customer.order.dao;

import com.xzsd.app.customer.order.entity.OrderDetails;
import com.xzsd.app.customer.order.entity.OrderDetailsU;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author weiming
 * @date 2020-4-18
 */
@Mapper
public interface OrderDetailsDao {
    /**
     * 新增订单详情
     */
    int addOrderDetails(OrderDetailsU orderDetailsU);
    /**
     * 查询订单详情
     */
    OrderDetails getGoodsDetails(String orderId);
    /**
     * 删除订单详情
     */
    int deleteOrderDetails(String orderId);
}
