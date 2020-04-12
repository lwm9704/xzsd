package com.xzsd.pc.order.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xzsd.pc.order.dao.OrderDao;
import com.xzsd.pc.order.entity.OrderInfo;
import com.xzsd.pc.order.entity.OrderInfoF;
import com.xzsd.pc.order.entity.OrderInfoV;
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
        List<OrderInfo> orderInfoList = orderDao.listOrderByPage(orderInfoF);
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
        OrderInfo orderInfo = orderDao.getOrderById(orderId);
        return AppResponse.success("查询成功！",orderInfo);
    }
    /**
     * 修改订单状态
     * @param
     * @return
     * @author weiming
     * @date 2020-4-5
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateOrderState(String orderId,int state){
        AppResponse appResponse = AppResponse.success("修改成功");

        List<String> listId = Arrays.asList(orderId.split(","));
        String userId = AuthorUtil.getCurrentUserId();
        List<OrderInfoV> orderInfoVList = new LinkedList<OrderInfoV>();
        for(int i = 0;i < listId.size();i++){
            OrderInfoV orderInfoV = new OrderInfoV();
            orderInfoV.setOrderId(listId.get(i));
            orderInfoV.setState(state);
            orderInfoV.setLastModifyBy(userId);
            orderInfoVList.add(orderInfoV);
        }
        //修改订单状态
        int count = orderDao.updateOrderState(orderInfoVList);
        if(count == 0){
            appResponse = AppResponse.versionError("数据有变化，请刷新");
            return appResponse;
        }
        return appResponse;
    }
}
