package com.xzsd.app.userInfo.dao;

import com.xzsd.app.userInfo.entity.UserInfoU;
import com.xzsd.app.userInfo.entity.UserInfoV;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author weiming
 * @date 2020-4-26
 */
@Mapper
public interface UserInfoDao {
    /**
     * 获取用户信息
     */
    UserInfoV getUserInfo(@Param("userId") String userId);
    /**
     * 修改用户密码
     */
    int updateUserPassword(UserInfoU userInfoU);
    /**
     * 修改邀请码
     */
    int updateUserCode(UserInfoU userInfoU);
}
