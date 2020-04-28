package com.xzsd.app.customer.car.service;

import com.xzsd.app.customer.car.dao.CarDao;
import com.xzsd.app.customer.car.entity.*;
import com.xzsd.app.util.AppResponse;
import com.xzsd.app.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @author weiming
 * @date 2020-4-23
 */
@Service
public class CarService {
    @Resource
    private CarDao carDao;

    /**
     * 新增购物车
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addCar(CarInfoA carInfoA){
        int count = carDao.addCar(carInfoA);
        if(count == 0){
            return AppResponse.bizError("新增购物车失败");
        }
        return AppResponse.success("新增购物车成功");
    }
    /**
     * 修改购物车商品数量
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateCar(CarInfoU carInfoU){
        int count = carDao.updateCar(carInfoU);
        if(count == 0){
            return AppResponse.bizError("修改购物车失败");
        }
        return AppResponse.success("修改购物车成功");
    }
    /**
     *查询购物车列表
     */
    public AppResponse listCar(String userId){
        List<CarInfoV> carInfoVList = carDao.listCar(userId);
        return AppResponse.success("查询购物车成功");
    }
    /**
     * 结算，修改购物车
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse settlement(String carId,String userId){
        List<String> listCarId = Arrays.asList(carId.split(","));
        int count = carDao.settlement(listCarId,userId);
        if(count == 0){
            return AppResponse.bizError("修改购物车状态失败");
        }
        //获取商品列表
        List<Goods>goodsList = carDao.getGoodsList(listCarId,userId);
        //创建订单和订单详情
        String orderId = StringUtil.getCommonCode(2);
        Order order = new Order();
        order.setOrderId(orderId);
        order.setUserId(userId);
        int num = 0;
        double totalPrice = 0;
        for (int i = 0;i < goodsList.size();i ++){
            goodsList.get(i).setOrderId(orderId);
            goodsList.get(i).setCreatBy(userId);
            num += goodsList.get(i).getGoodsNum();
            totalPrice += goodsList.get(i).getTotalPrice();
        }
        order.setNum(num);
        order.setTotalPrice(totalPrice);
        int countOrder = carDao.creatOrder(order);
        if(countOrder == 0){
            return AppResponse.bizError("结算时创建订单失败");
        }
        int countDetail = carDao.creatOrderDetail(goodsList);
        if(countDetail == 0){
            return AppResponse.bizError("结算时创建订单详情失败");
        }
        return AppResponse.success("成功结算");
    }
}
