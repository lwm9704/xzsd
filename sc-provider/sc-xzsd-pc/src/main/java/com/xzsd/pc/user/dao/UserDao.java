package com.xzsd.pc.user.dao;

import com.xzsd.pc.user.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {
    /**
     * 统计数据库里是否有该账号
     * @param userInfo
     * @return
     */
    int countUserAcct(UserInfo userInfo);
    /**
     * 新增用户
     * @param userInfo
     * @return
     */
    int saveUser(UserInfo userInfo);
    /**
     * 获取所有用户信息
     * @param userInfo 用户信息
     * @return 所用用户信息
     */
    List<UserInfo> listUsersByPage(UserInfo userInfo);
    /**
     * 删除用户信息
     * @param  listId 选中的用户编号集合
     * @param gUserId 更新人
     * @return
     */
    int deleteUser(List<String> listId, @Param("gUserId") String gUserId);
    /**
     * 修改用户信息
     * @param userInfo 用户信息
     * @return 修改结果
     */
    int updateUser(UserInfo userInfo);
    /**
     * 查询用户信息
     * @param userId 用户编号
     * @return 修改结果
     */
    UserInfo getUserByUserId(@Param("userId") String userId);
}
