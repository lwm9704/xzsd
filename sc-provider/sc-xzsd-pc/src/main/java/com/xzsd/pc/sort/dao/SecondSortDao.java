package com.xzsd.pc.sort.dao;

import com.xzsd.pc.sort.entity.SecondSortInfo;
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
     * @param secondSortInfo
     * @return
     */
    int countSecondSort(SecondSortInfo secondSortInfo);
    /**
     * 新增分类
     * @param secondSortInfo
     * @return
     */
    int addSecondSort(SecondSortInfo secondSortInfo);
    /**
     * 获取分类信息
     * @param secondSortInfo
     * @return 所有二级分类信息
     */
    List<SecondSortInfo> listSecondSort(SecondSortInfo secondSortInfo);
    /**
     * 修改分类信息
     * @param secondSortInfo
     * @return 修改结果
     */
    int updateSecondSort(SecondSortInfo secondSortInfo);
    /**
     * 删除分类信息
     * @param secondSortId 选中的分类编号
     * @param userId 更新人
     * @return 修改结果
     */
    int deleteSecondSort(@Param("secondSortId") String secondSortId, @Param("userId") String userId);
    /**
     * 查询分类详情
     * @param secondSortId
     * @return sceondSortInfo
     */
    SecondSortInfo getSecondSortInfo(@Param("secondSortId") String secondSortId);
    /**
     * 传递二级分类个数参数
     * @param secondSortInfo
     * @return
     * @author weiming
     * @date 2020-3-29
     */
    int transmitFirstSort(SecondSortInfo secondSortInfo);
}