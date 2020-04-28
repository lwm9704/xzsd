package com.xzsd.app.userInfo.controller;

import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.app.userInfo.entity.UserInfoU;
import com.xzsd.app.userInfo.service.UserInfoService;
import com.xzsd.app.util.AppResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author weiming
 * @date 2020-4-26
 */
@RestController
@RequestMapping("userInfo")
public class UserInfoController {

    private static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);

    @Resource
    private UserInfoService userInfoService;

    /**
     * 获取用户信息
     */
    @RequestMapping("find")
    public AppResponse getUserInfo(){
        try{
            String userId = SecurityUtils.getCurrentUserId();
            return userInfoService.getUserInfo(userId);
        }catch (Exception e){
            logger.error("查询个人信息成功",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 修改密码
     */
    public AppResponse updateUserPassword(UserInfoU userInfoU){
        try{
            return userInfoService.updateUserPassword(userInfoU);
        }catch (Exception e){
            logger.error("修改密码失败",e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
