package com.xzsd.app.customer.hotGoods.service;

import com.xzsd.app.customer.hotGoods.dao.HotGoodsDao;
import com.xzsd.app.customer.hotGoods.entity.HotGoodsInfoV;
import com.xzsd.app.util.AppResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

/**
 * @author weiming
 * @date 2020-4-14
 */
@Service
public class HotGoodsService {
    @Resource
    private HotGoodsDao hotGoodsDao;

    /**
     * 获取热门商品信息列表
     * @param
     * @return AppResponse
     */
    public AppResponse getHotGoodsList(){
        int num = hotGoodsDao.getShowNum().getNum();
        List<HotGoodsInfoV> hotGoodsInfoVList = hotGoodsDao.getHotGoodsByPage(num);
        return AppResponse.success("查询成功",hotGoodsInfoVList);
    }
}
