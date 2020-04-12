package com.xzsd.pc.rotation.controller;

import com.xzsd.pc.rotation.entity.RotationInfoA;
import com.xzsd.pc.rotation.entity.RotationInfoU;
import com.xzsd.pc.rotation.service.RotationService;
import com.xzsd.pc.util.AppResponse;
import com.xzsd.pc.util.AuthorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author weiming
 * @date 2020-4-4
 */
@RestController
@RequestMapping("/rotation")
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
    @PostMapping("uploadMg")
    public AppResponse uploadMg(RotationInfoA rotationInfoA){
        try{
            //获取用户id
            String userId = AuthorUtil.getCurrentUserId();
            rotationInfoA.setCreatBy(userId);
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
    public AppResponse deleteMg(String rotationId){
        try {
            //获取用户id
            String userId = AuthorUtil.getCurrentUserId();
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
    public AppResponse updateState(RotationInfoU rotationInfoU){
        try{
            //获取用户id
            String userId = AuthorUtil.getCurrentUserId();
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
