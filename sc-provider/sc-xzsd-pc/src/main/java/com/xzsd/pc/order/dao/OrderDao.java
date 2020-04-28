package com.xzsd.pc.order.dao;

import com.xzsd.pc.order.entity.OrderDetails;
import com.xzsd.pc.order.entity.OrderInfoF;
import com.xzsd.pc.order.entity.OrderInfoState;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderDao {
    /**
     * 查询订单列表
     */
    List<OrderDetails> listOrderByPage(OrderInfoF orderInfoF);
    /**
     * 查询订单详情
     */
    List<OrderDetails> getOrderById(String orderId);
    /**
     * 修改订单状态
     */
    int updateOrderState(@Param("orderList") List<String> orderList,@Param("userId") String userId,@Param("orderState") int orderState);
    /**
     * 校验该订单是否存在
     */
    int countOrder(String orderId);
}
