package com.xzsd.pc.goods.dao;

import com.xzsd.pc.goods.entity.GoodsInfoF;
import com.xzsd.pc.goods.entity.GoodsInfoU;
import com.xzsd.pc.goods.entity.GoodsInfoV;
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
     * @param listGId 选中的商品编号集合
     * @param  gUserId 更新人
     * @return
     */
    int deleteGoods(List<String> listGId, @Param("gUserId") String gUserId);
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

}
