package com.xzsd.pc.rotation.dao;

import com.xzsd.pc.rotation.entity.RotationInfoA;
import com.xzsd.pc.rotation.entity.RotationInfoU;
import com.xzsd.pc.rotation.entity.RotationInfoV;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 */
@Mapper
public interface RotationDao {

    /**
     * 新增轮播图
     * @param rotationInfoA
     * @return
     */
    int uploadMg(RotationInfoA rotationInfoA);
    /**
     * 删除轮播图
     * @param listId
     * @param userId
     * @return
     */
    int deleteMg(List<String> listId,@Param("userId") String userId);
    /**
     * 修改轮播图状态
     * @param rotationInfoU
     * @return
     */
    int updateMgState(RotationInfoU rotationInfoU);
    /**
     * 校验轮播图是否存在
     * @param rotationId
     * @return
     */
    int countRotation(String rotationId);
    /**
     * 查询轮播图列表
     * @param roatationInfoU
     * @return
     */
    List<RotationInfoV> listRotationByPage(RotationInfoU roatationInfoU);
    /**
     * 排序校验
     * @param sort
     */
    int countSort(int sort);
}
