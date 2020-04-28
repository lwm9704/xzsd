package com.xzsd.pc.sort.dao;

import com.xzsd.pc.sort.entity.SecondSortInfo;
import com.xzsd.pc.sort.entity.SortInfo;
import com.xzsd.pc.sort.entity.SortInfoA;
import com.xzsd.pc.sort.entity.SortInfoU;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @className SecondSortDao
 * @author weiming
 * @date 2020-3-28
 */
@Mapper
public interface SecondSortDao {

    /**
     *统计是否有重复的类
     * @param sortInfoA
     * @return
     */
    int countSecondSort(SortInfoA sortInfoA);
    /**
     * 新增分类
     * @param sortInfoA
     * @return
     */
    int addSecondSort(SortInfoA sortInfoA);
    /**
     * 获取分类信息
     * @param secondSortInfo
     * @return 所有二级分类信息
     */
    List<SecondSortInfo> listSecondSortByPage(SecondSortInfo secondSortInfo);
    /**
     * 修改分类信息
     * @param sortInfoU
     * @return 修改结果
     */
    int updateSecondSort(SortInfoU sortInfoU);
    /**
     * 删除分类信息
     * @param sortInfoU
     * @return 修改结果
     */
    int deleteSecondSort(SortInfoU sortInfoU);
    /**
     * 查询分类详情
     * @param
     * @return sceondSortInfo
     */
    SortInfo getSecondSortInfo(SortInfoA sortInfoA);
    /**
     * 增加在一级分类表下二级分类个数
     * @param sortInfoA
     * @return
     * @author weiming
     * @date 2020-3-29
     */
    int transmitFirstSort(SortInfoA sortInfoA);
    /**
     * 删除二级分类时，减少一级分类下二级分类的个数
     */
    int transmitDFirstSort(SortInfoU sortInfoU);
    /**
     * 校验分类下是否有商品
     */
    int countGoodsNum(String secondSortId);
}