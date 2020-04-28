package com.xzsd.pc.driver.dao;

import com.xzsd.pc.driver.entity.AcctRole;
import com.xzsd.pc.driver.entity.DriverInfoF;
import com.xzsd.pc.driver.entity.DriverInfoU;
import com.xzsd.pc.driver.entity.DriverInfoV;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DriverDao {
    /**
     * 新增司机
     * @parm driverInfoU
     * @return
     */
    int addDriver(DriverInfoU driverInfoU);
    /**
     * 修改司机信息
     * @param driverInfoU
     * @return
     */
    int updateDriver(DriverInfoU driverInfoU);
    /**
     * 删除司机信息
     * @param listId
     * @param userId
     * @return
     */
    int deleteDriver(@Param("listId") List<String> listId, @Param("userId") String userId);
    /**
     * 查询司机信息列表
     * @param driverInfoF
     * @return driverInfoV
     */
    List<DriverInfoV> listDriverByPage(DriverInfoF driverInfoF);
    /**
     * 查询司机详情
     * @param id
     * @return driverInfoV
     */
    DriverInfoV getDriverById(@Param("id") String id);
    /**
     * 获取司机详情
     */
    DriverInfoU getDriver(@Param("id") String id);
    /**
     * 校验司机信息是否已经存在
     * @param driverAcct
     * @return
     */
    int countDriver(String driverAcct);

    AcctRole countRole(String driverAcct);
}

