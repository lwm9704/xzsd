package com.xzsd.app.customer.car.controller;

import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.app.customer.car.dao.CarDao;
import com.xzsd.app.customer.car.entity.CarInfoA;
import com.xzsd.app.customer.car.entity.CarInfoU;
import com.xzsd.app.customer.car.entity.CarInfoV;
import com.xzsd.app.customer.car.service.CarService;
import com.xzsd.app.util.AppResponse;
import com.xzsd.app.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author weiming
 * @date 2020-4-23
 */
@RestController
@RequestMapping("customer")
public class CarController {

    @Resource
    private CarService carService;

    private static final Logger logger = LoggerFactory.getLogger(CarController.class);

    /**
     * 新增购物车（添加商品）
     */
    @RequestMapping("addCar")
    public AppResponse addCar(CarInfoA carInfoA){
        try{
            String userId = SecurityUtils.getCurrentUserId();
            carInfoA.setUserId(userId);
            String carId = StringUtil.getCommonCode(2);
            carInfoA.setCarId(carId);
            return carService.addCar(carInfoA);
        }catch (Exception e){
            logger.error("新增购物车失败");
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     *修改购物车中商品数量
     */
    @RequestMapping("updatetShoppingCartNum")
    public AppResponse updateCarNum(CarInfoU carInfoU){
        try{
            String userId = SecurityUtils.getCurrentUserId();
            carInfoU.setUserId(userId);
            return carService.updateCar(carInfoU);
        }catch (Exception e){
            logger.error("修改购物车商品数量失败",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询购物车列表
     */
    @RequestMapping("shoppingCartList")
    public AppResponse listCar(String carId){
        try{
            return carService.listCar(carId);
        }catch (Exception e){
            logger.error("查询购物车列表成功",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 修改购物车状态,结算
     */
    @RequestMapping("settlement")
    public AppResponse settlement(String carId){
        try{
            String userId = SecurityUtils.getCurrentUserId();
            return carService.settlement(carId,userId);
        }catch (Exception e){
            logger.error("修改购物车状态失败");
            System.out.println(e.toString());
            throw e;
        }
    }
}
