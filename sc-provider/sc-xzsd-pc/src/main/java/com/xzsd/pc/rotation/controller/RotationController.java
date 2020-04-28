package com.xzsd.pc.rotation.controller;

import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.pc.cos.entity.MgInfo;
import com.xzsd.pc.rotation.entity.RotationInfoA;
import com.xzsd.pc.rotation.entity.RotationInfoU;
import com.xzsd.pc.rotation.service.RotationService;
import com.xzsd.pc.util.AppResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author weiming
 * @date 2020-4-4
 */
@RestController
@RequestMapping("/user")
public class RotationController {

    private static final Logger logger = LoggerFactory.getLogger(RotationController.class);

    @Resource
    private RotationService rotationService;


    /**
     * 新增轮播图
     * @param rotationInfoA
     * @return AppResponse
     * @author weiming
     * @date 2020-4-4
     */
    @PostMapping("addRotation")
    public AppResponse uploadMg(RotationInfoA rotationInfoA, MgInfo mgInfo){
        try{
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            rotationInfoA.setCreatBy(userId);
            rotationInfoA.setpKey(mgInfo.getpKey());
            rotationInfoA.setpUrl(mgInfo.getpUrl());
            AppResponse appResponse = rotationService.uploadMg(rotationInfoA);
            return appResponse;
        }catch (Exception e){
            logger.error("轮播图新增失败",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 删除轮播图
     * @param rotationId
     * @return AppResponse
     * @author weiming
     * @date 2020-4-4
     */
    @PostMapping("deleteRotation")
    public AppResponse deleteMg(String rotationId){
        try {
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            return rotationService.deleteMg(rotationId,userId);
        }catch (Exception e){
            logger.error("轮播图删除错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 修改轮播图状态
     * @param rotationInfoU
     * @return AppResponse
     * @author weiming
     * @date 2020-4-4
     */
    @PostMapping("updateRotation")
    public AppResponse updateState(RotationInfoU rotationInfoU){
        try{
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            rotationInfoU.setLastModifyBy(userId);
            return rotationService.updateState(rotationInfoU);
        }catch(Exception e){
            logger.error("修改轮播图状态错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询轮播图列表
     * @param rotationInfoU
     * @return AppResponse
     * @author weiming
     * @date 2020-4-4
     */
    @RequestMapping("listRotation")
    public AppResponse listRotation(RotationInfoU rotationInfoU){
        try{
            return rotationService.listRotation(rotationInfoU);
        }catch (Exception e){
            logger.error("查询轮播图列表异常",e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
