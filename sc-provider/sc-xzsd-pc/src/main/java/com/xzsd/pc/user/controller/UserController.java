package com.xzsd.pc.user.controller;

import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.pc.cos.entity.MgInfo;
import com.xzsd.pc.user.entity.UserInfo;
import com.xzsd.pc.user.service.UserService;
import com.xzsd.pc.util.AppResponse;
import com.xzsd.pc.util.AuthorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *用户管理
 *  @author  liangweiming
 * @time 2020-3-24
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService userService;

    /**
     * 新增用户
     * @author weiming
     * @param userInfo
     * @return AppResponse
     * @date 2020-3-25
     */
    @PostMapping("addUser")
    public AppResponse saveUser(UserInfo userInfo, MgInfo mgInfo){
        try{
            //获取用户Id
            String userId = SecurityUtils.getCurrentUserId();
            userInfo.setCreatBy(userId);
            userInfo.setpKey(mgInfo.getpKey());
            userInfo.setpUrl(mgInfo.getpUrl());
            AppResponse appResponse = userService.saveUser(userInfo);
            return appResponse;
        }catch (Exception e){
            logger.error("新增用户失败",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     *查询用户列表(分页)
     * @author weiming
     * @param  userInfo
     * @return AppResponse
     * @date 2020-3-25
     */
    @RequestMapping(value = "listUsers")
    public AppResponse listUsers(UserInfo userInfo){
        try{
            return userService.listUsers(userInfo);
        }catch (Exception e){
            logger.error("查询用户异常",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 删除用户
     * @param userId
     * @return AppResponse
     * @author weiming
     * @date 2020-3-26
     */
    @PostMapping("deleteUser")
    public AppResponse deleteUser(String userId){
        try{
            //获取用户Id
            String gUserId = SecurityUtils.getCurrentUserId();
            return userService.deleteUser(userId,gUserId);
        }catch (Exception e){
            logger.error("用户删除错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 修改用户
     * @param userInfo
     * @return AppResponse
     * @author weiming
     * @date 2020-3-26
     */
    @PostMapping("updateUserById")
    public AppResponse updateUser(UserInfo userInfo,MgInfo mgInfo){
        try{
            //获取用户Id
            String userId = SecurityUtils.getCurrentUserId();
            userInfo.setCreatBy(userId);
            userInfo.setLastModifyBy(userId);
            userInfo.setpKey(mgInfo.getpKey());
            userInfo.setpUrl(mgInfo.getpUrl());
            return userService.updateUser(userInfo);
        }catch (Exception e){
            logger.error("修改用户信息错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询用户详情
     * @param userId
     * @return AppResponse
     * @author weiming
     * @date 2020-3-27
     */
    @RequestMapping(value = "findUserById")
    public AppResponse getUserByUserId(String userId){
        try{
            return userService.getUserByUserId(userId);
        }catch (Exception e){
            logger.error("用户查询错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }
}

