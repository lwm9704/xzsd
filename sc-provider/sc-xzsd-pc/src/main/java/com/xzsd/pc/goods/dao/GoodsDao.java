package com.xzsd.pc.goods.dao;

import com.xzsd.pc.goods.entity.GoodsInfoF;
import com.xzsd.pc.goods.entity.GoodsInfoU;
import com.xzsd.pc.goods.entity.GoodsInfoV;
import com.xzsd.pc.goods.entity.GoodsState;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodsDao {
    /**
     * 检验新增商品是否成功
     * @param goodsInfoU
     * @return
     */
    int countGoods(GoodsInfoU goodsInfoU);
    /**
     * 新增商品
     * @param goodsInfoU 商品信息
     * @return
     */
    int addGoods(GoodsInfoU goodsInfoU);
    /**
     * 删除商品
     * @param listId 选中的商品编号集合
     * @param  gUserId 更新人
     * @return
     */
    int deleteGoods(@Param("listId") List<String> listId, @Param("gUserId") String gUserId);
    /**
     * 修改商品信息
     * @param goodsInfo
     * @return
     * @author weiming
     * @date 2020-3-27
     */
    int updateGoods(GoodsInfoU goodsInfo);
    /**
     * 查询商品列表
     * @param
     * @return
     * @author weiming
     * @date 2020-4-12
     */
    List<GoodsInfoV> listGoodsByPage(GoodsInfoF goodsInfoF);
    /**
     * 修改和商品状态
     */
    int updateState(GoodsState goodsState);
    /**
     * 查询商品详情
     */
    GoodsInfoU getGoodsInfo(String goodsId);
    /**
     * 新增商品时对应二级分类增加
     */
    int addSecondSort(@Param("sortId") String sortId,@Param("userId") String userId);
}
