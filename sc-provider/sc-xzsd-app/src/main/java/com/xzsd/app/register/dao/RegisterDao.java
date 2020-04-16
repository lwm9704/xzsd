package com.xzsd.app.register.dao;

import com.xzsd.app.register.entity.RegisterInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegisterDao {
    /**
     * 用户注册
     * @param registerInfo
     * @return
     * @author weiming
     * @date 2020-4-13
     */
    int register(RegisterInfo registerInfo);
    /**
     * 校验用户名是否存在
     * @param userAcct
     */
    int countUser(String userAcct);
    /**
     * 检验身份证是否已经注册
     * @param idCard
     */
    int countIdCard(String idCard);
    /**
     * 校验电话是否已经注册
     * @param phone
     */
    int countPhone(String phone);
}
