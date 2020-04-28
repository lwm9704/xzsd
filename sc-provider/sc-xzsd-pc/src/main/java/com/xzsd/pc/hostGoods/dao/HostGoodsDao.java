package com.xzsd.pc.hostGoods.dao;

import com.xzsd.pc.hostGoods.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HostGoodsDao {

    /**
     * 热门位列表查询
     */
    List<HostGoodsInfoV> listHostGoodsByPage(HostGoodsInfoF hostGoodsInfoF);
    /**
     * 热门位商品新增
     */
    int addHostGoods(HostGoodsInfoU hostGoodsInfoU);
    /**
     * 修改热门位商品
     */
    int updateHostGoods(HostGoodsInfoU hostGoodsInfoU);
    /**
     * 删除热门位商品
     */
    int deleteHost(@Param("listHostId") List<String> listHostId,@Param("userId") String userId);
    /**
     * 展示数量设置
     */
    int setShowNum(ShowNumInfo showNumInfo);
    /**
     * 获取展示数量
     */
    ShowNumInfo getShowNum();
    /**
     * 校验该商品是否在热门位
     */
    int countHostGoods(String goodsId);

    /**
     * 热门商品详情
     */
    HostInfo getHostInfo(String hostId);
}
