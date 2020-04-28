package com.xzsd.app.driver.shopInfo.controller;

import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.app.driver.shopInfo.service.ShopInfoService;
import com.xzsd.app.util.AppResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author weiming
 * @date 2020-4-26
 */
@RestController
@RequestMapping("driver")
public class ShopInfoController {

    private static final Logger logger = LoggerFactory.getLogger(ShopInfoController.class);

    @Resource
    private ShopInfoService shopInfoService;

    /**
     * 获取门店信息
     */
    @RequestMapping("getShopInfo")
    public AppResponse getShopInfo(){
        try{
            String userId = SecurityUtils.getCurrentUserId();
            return shopInfoService.getShopInfo(userId);
        }catch (Exception e){
            logger.error("获取门店信息失败",e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
