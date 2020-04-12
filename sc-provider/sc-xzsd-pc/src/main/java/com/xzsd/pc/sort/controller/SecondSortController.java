package com.xzsd.pc.sort.controller;

import com.xzsd.pc.sort.entity.SecondSortInfo;
import com.xzsd.pc.sort.service.SecondSortService;
import com.xzsd.pc.util.AppResponse;
import com.xzsd.pc.util.AuthorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.rmi.server.ExportException;

/**
 * 二级分类增删改查
 * @author weiming
 * @date 2020-3-28
 */
@RestController
@RequestMapping("/secondSort")
public class SecondSortController {

    private static final Logger logger = LoggerFactory.getLogger(SecondSortController.class);

    @Resource
    private SecondSortService secondSortService;

    /**
     * 新增二级分类
     * @param secondSortInfo
     * @return AppResponse
     * @author weiming
     * @date 2020-3-28
     */
    @PostMapping("addSecondSort")
    public AppResponse addSecondSort(SecondSortInfo secondSortInfo){
        try{
            //获取用户id
            String userId = AuthorUtil.getCurrentUserId();
            secondSortInfo.setCreatBy(userId);
            AppResponse appResponse = secondSortService.addSecondSort(secondSortInfo);
            return  appResponse;
        }catch (Exception e){
            logger.error("新增二级分类失败",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 二级分类列表
     * @param secondSortInfo
     * @return AppResponse
     * @author weiming
     * @date 2020-3-28
     */
    @RequestMapping(value = "listSecondSort")
    public AppResponse listSecondSort(SecondSortInfo secondSortInfo){
        try{
            return secondSortService.listSecondSort(secondSortInfo);
        }catch (Exception e){
            logger.error("查询二级分类列表异常",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 删除二级分类
     * @param secondSortId
     * @return AppResponse
     * @author weiming
     * @date 2020-3-28
     */
    @PostMapping("deleteSecondSort")
    public AppResponse deleteSecondSort(String secondSortId){
        try{
            //获取用户id
            String userId = AuthorUtil.getCurrentUserId();
            return secondSortService.deleteSecondSort(secondSortId,userId);
        }catch (Exception e){
            logger.error("二级分类删除错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 修改二级分类
     * @param secondSortInfo
     * @return AppResponse
     * @author weiming
     * @date 2020-3-28
     */
    @PostMapping("updateSecondSort")
    public AppResponse updateSecondSort(SecondSortInfo secondSortInfo){
        try{
            //获取用户id
            String userId = AuthorUtil.getCurrentUserId();
            secondSortInfo.setCreatBy(userId);
            secondSortInfo.setLastModifyBy(userId);
            return secondSortService.updateSecondSort(secondSortInfo);
        }catch (Exception e){
            logger.error("修改二级分类信息错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询二级分类详情
     * @param secondSortId
     * @return AppResponse
     * @author weiming
     * @date 2020-3-28
     */
    @RequestMapping(value = "getSecondSort")
    public AppResponse getSecondSort(String secondSortId){
        try{
            return secondSortService.getSecondSortInfo(secondSortId);
        }catch (Exception e){
            logger.error("查询二级分类错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
