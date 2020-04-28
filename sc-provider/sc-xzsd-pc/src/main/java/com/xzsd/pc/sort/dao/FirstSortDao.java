package com.xzsd.pc.sort.dao;

import com.xzsd.pc.sort.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @className FirstSortDao
 * @author weiming
 * @date 2020-3-28
 */
@Mapper
public interface FirstSortDao {

    /**
     *统计是否有重复的类名
     * @param sortInfoA
     * @return
     */
    int countsFirstSort(SortInfoA sortInfoA);
    /**
     * 新增分类
     * @param sortInfoA
     * @return
     */
    int addFirstSort(SortInfoA sortInfoA);
    /**
     * 获取分类信息
     * @param firstSortInfo
     * @return 所有一级分类信息
     */
    List<FirstSortInfo> listFirstSort(FirstSortInfo firstSortInfo);
    /**
     * 修改分类信息
     * @param sortInfoU
     * @return 修改结果
     */
    int updateFirstSort(SortInfoU sortInfoU);
    /**
     * 删除分类信息
     * @param sortInfoU
     * @return 修改结果
     */
    int deleteFirstSort(SortInfoU sortInfoU);
    /**
     * 查询分类详情
     * @param sortInfoA
     * @return firstSortInfo
     */
    SortInfo getFirstSortInfo(SortInfoA sortInfoA);

    /**
     *查看有没有子类
     */
    CountSort countSort(@Param("sortId")String sortId);
    /**
     * 查询是一级分类否存在是否存在这个分类
     */
    int count(@Param("sortId")String sortId);
}
