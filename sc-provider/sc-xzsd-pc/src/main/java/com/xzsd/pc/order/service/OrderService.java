package com.xzsd.pc.order.service;

import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.pc.order.dao.OrderDao;
import com.xzsd.pc.order.entity.OrderDetails;
import com.xzsd.pc.order.entity.OrderInfoF;
import com.xzsd.pc.order.entity.OrderInfoState;
import com.xzsd.pc.util.AppResponse;
import com.xzsd.pc.util.AuthorUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

@Service
public class OrderService {

    @Resource
    private OrderDao orderDao;

    /**
     * 查询订单列表
     * @param orderInfoF
     * @return
     * @author weiming
     * @date 2020-4-5
     */
    public AppResponse listOrder(OrderInfoF orderInfoF){
        List<OrderDetails> orderInfoList = orderDao.listOrderByPage(orderInfoF);
        return AppResponse.success("查询成功！",getPageInfo(orderInfoList));
    }
    /**
     * 查询订单详情
     * @param orderId
     * @return
     * @author weiming
     * @date 2020-4-5
     */
    public AppResponse getOrderById(String orderId){
        List<OrderDetails> orderDetailsList = orderDao.getOrderById(orderId);
        return AppResponse.success("查询成功！",orderDetailsList);
    }
    /**
     * 修改订单状态
     * @param
     * @return
     * @author weiming
     * @date 2020-4-5
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateOrderState(String orderId,int orderState){
        AppResponse appResponse = AppResponse.success("修改成功");

        List<String> listId = Arrays.asList(orderId.split(","));
        String userId = SecurityUtils.getCurrentUserId();
        //修改订单状态
        int count = orderDao.updateOrderState(listId,userId,orderState);
        if(count == 0){
            appResponse = AppResponse.versionError("数据有变化，请刷新");
            return appResponse;
        }
        return appResponse;
    }
}
