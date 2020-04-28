package com.xzsd.app.customer.car.dao;

import com.xzsd.app.customer.car.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.access.method.P;

import javax.validation.OverridesAttribute;
import java.util.List;

/**
 * @author weiming
 * @date 2020-4-23
 */
@Mapper
public interface CarDao {

    /**
     * 新增购物车
     */
    int addCar(CarInfoA carInfoA);

    /**
     * 修改购物车中商品数量
    */
    int updateCar(CarInfoU carInfoU);

    /**
     * 查询购物车列表
     */
    List<CarInfoV>listCar(String userId);

    /**
     * 购物车结算，修改状态
     */
    int settlement(@Param("listCarId") List<String>listCarId, @Param("userId") String userId);
    /**
     * 购物车结算时，拉出商品信息
     */
    List<Goods>getGoodsList(@Param("listCarId") List<String>listCarId, @Param("userId") String userId);
    /**
     * 创建订单详情
     */
    int creatOrderDetail(@Param("goodsList") List<Goods> goodsList);
    /**
     * 创建订单
     */
    int creatOrder(Order order);
    /**
     * 修改商品数量
     */
    int changeGoodsNum(List<ChangeGoodsNum> changeGoodsNumeList);
}
