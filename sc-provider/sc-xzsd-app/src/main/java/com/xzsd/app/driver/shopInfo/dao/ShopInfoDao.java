package com.xzsd.app.driver.shopInfo.dao;

import com.xzsd.app.driver.shopInfo.entity.DriverShopInfoV;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author weiming
 * @date 2020-4-26
 */
@Mapper
public interface ShopInfoDao {

    /**
     * 获取门店信息
     */
    DriverShopInfoV getShopInfo(String userId);
}
