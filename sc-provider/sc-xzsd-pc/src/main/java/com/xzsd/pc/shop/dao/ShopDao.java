package com.xzsd.pc.shop.dao;

import com.xzsd.pc.shop.entity.ShopInfoF;
import com.xzsd.pc.shop.entity.ShopInfoU;
import com.xzsd.pc.shop.entity.ShopInfoV;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ShopDao {

    /**
     * 新增门店
     * @param shopInfoU
     * @return
     */
    int addShopInfo(ShopInfoU shopInfoU);
    /**
     * 删除门店信息
     * @param listId
     * @param userId
     * @return
     */
    int deleteShopId(List<String> listId, @Param("userId") String userId);
    /**
     * 更新门店信息
     * @param shopInfoU
     * @return
     */
    int updateShopInfo(ShopInfoU shopInfoU);
    /**
     * 查询门店信息列表
     */
    List<ShopInfoV> listShopInfoByPage(ShopInfoF shopInfoF);
    /**
     * 查询门店信息详情
     * @param shopId
     * @return
     */
    ShopInfoV getShopInfo(@Param("shopId") String shopId);
    /**
     * 校验该门店是否已经存在
     * @param shopInfoU
     * @return
     */
    int countShop(ShopInfoU shopInfoU);
}
