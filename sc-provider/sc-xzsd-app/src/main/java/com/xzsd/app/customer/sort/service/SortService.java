package com.xzsd.app.customer.sort.service;

import com.xzsd.app.customer.sort.dao.SortDao;
import com.xzsd.app.customer.sort.entity.SortGoodsInfoV;
import com.xzsd.app.customer.sort.entity.SortInfoV;
import com.xzsd.app.util.AppResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

/**
 * @author weiming
 * @date 2020-4-15
 */
@Service
public class SortService {
    @Resource
    private SortDao sortDao;

    /**
     * 获取一级分类信息
     * @param
     * @return AppResponse
     */
    public AppResponse getFirstSort(){
        SortInfoV sortInfoV = sortDao.getFirstSortInfo();
        return AppResponse.success("查询成功",sortInfoV);
    }
    /**
     * 获取二级分类信息
     * @param firstSortId
     * @return AppResponse
     */
    public AppResponse getSecondSort(String firstSortId){
        SortInfoV sortInfoV = sortDao.getSecondSortInfo(firstSortId);
        return AppResponse.success("查询成功",sortInfoV);
    }
    /**
     * 查询商品
     * @param firstSortId
     * @param secondSortId
     * @return
     */
    public AppResponse getSortGoodsList(String firstSortId,String secondSortId){
        List<SortGoodsInfoV> sortGoodsInfoVList = sortDao.getSortGoodsList(firstSortId,secondSortId);
        return AppResponse.success("查询商品成功",getPageInfo(sortGoodsInfoVList));
    }
}
