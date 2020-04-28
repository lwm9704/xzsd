package com.xzsd.app.userInfo.service;

import com.xzsd.app.userInfo.dao.UserInfoDao;
import com.xzsd.app.userInfo.entity.UserInfoU;
import com.xzsd.app.userInfo.entity.UserInfoV;
import com.xzsd.app.util.AppResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author weiming
 * @date 2020-4-26
 */
@Service
public class UserInfoService {

    @Resource
    private UserInfoDao userInfoDao;

    /**
     * 获取个人信息
     */
    public AppResponse getUserInfo(String userId){
        UserInfoV userInfoV = userInfoDao.getUserInfo(userId);
        return AppResponse.success("查询个人信息成功",userInfoV);
    }
    /**
     * 修改密码
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateUserPassword(UserInfoU userInfoU){
        int count = userInfoDao.updateUserPassword(userInfoU);
        if(count == 0){
            return AppResponse.bizError("修改密码失败，请重新输入");
        }
        return AppResponse.success("修改密码成功");
    }
    /**
     * 修改邀请码
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateUserCode(UserInfoU userInfoU){
        int count = userInfoDao.updateUserCode(userInfoU);
        if(count == 0){
            return AppResponse.bizError("修改邀请码失败，请重新输入");
        }
        return AppResponse.success("修改邀请码成功");
    }
}
