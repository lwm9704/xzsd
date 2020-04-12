package com.xzsd.pc.sort.dao;

import com.xzsd.pc.sort.entity.FirstSortInfo;
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
     *统计是否有重复的类
     * @param firstSortInfo
     * @return
     */
    int countsFirstSort(FirstSortInfo firstSortInfo);
    /**
     * 新增分类
     * @param firstSortInfo
     * @return
     */
    int addFirstSort(FirstSortInfo firstSortInfo);
    /**
     * 获取分类信息
     * @param firstSortInfo
     * @return 所有一级分类信息
     */
    List<FirstSortInfo> listFirstSort(FirstSortInfo firstSortInfo);
    /**
     * 修改分类信息
     * @param firstSortInfo
     * @return 修改结果
     */
    int updateFirstSort(FirstSortInfo firstSortInfo);
    /**
     * 删除分类信息
     * @param firstSortId 选中的分类编号
     * @param userId 更新人
     * @return 修改结果
     */
    int deleteFirstSort(@Param("firstSortId") String firstSortId,@Param("userId") String userId);
    /**
     * 查询分类详情
     * @param firstSortId
     * @return firstSortInfo
     */
    FirstSortInfo getFirstSortInfo(@Param("firstSortId") String firstSortId);
}
