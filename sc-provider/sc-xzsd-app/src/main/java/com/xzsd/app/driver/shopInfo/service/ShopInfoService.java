package com.xzsd.app.driver.shopInfo.service;

import com.xzsd.app.driver.shopInfo.dao.ShopInfoDao;
import com.xzsd.app.driver.shopInfo.entity.DriverShopInfoV;
import com.xzsd.app.util.AppResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author weiming
 * @date 2020-4-26
 */
@Service
public class ShopInfoService {

    @Resource
    private ShopInfoDao shopInfoDao;

    /**
     * 获取门店信息
     */
    public AppResponse getShopInfo(String userId){
        DriverShopInfoV driverShopInfoV = shopInfoDao.getShopInfo(userId);
        return AppResponse.success("成功获取门店信息",driverShopInfoV);
    }
}
