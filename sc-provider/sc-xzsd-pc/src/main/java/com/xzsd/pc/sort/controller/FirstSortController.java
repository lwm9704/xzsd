package com.xzsd.pc.sort.controller;

import com.xzsd.pc.sort.entity.FirstSortInfo;
import com.xzsd.pc.sort.service.FirstSortService;
import com.xzsd.pc.util.AppResponse;
import com.xzsd.pc.util.AuthorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 一级分类的增删改查
 * @author weiming
 * @date 2020-3-29
 */
@RestController
@RequestMapping("/firstSort")
public class FirstSortController {

    private static final Logger logger = LoggerFactory.getLogger(FirstSortController.class);

    @Resource
    private FirstSortService firstSortService;

    /**
     * 新增一级分类
     * @param firstSortInfo
     * @return AppResponse
     * @author weiming
     * @date 2020-3-29
     */
    @PostMapping("addFirstSort")
    public AppResponse addFirstSort(FirstSortInfo firstSortInfo){
        try{
            //获取用户id
            String userId = AuthorUtil.getCurrentUserId();
            firstSortInfo.setCreatBy(userId);
            AppResponse appResponse = firstSortService.addFirstSort(firstSortInfo);
            return appResponse;
        }catch (Exception e){
            logger.error("分类新增失败",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 分类列表
     * @param firstSortInfo
     * @return AppResponse
     * @author weiming
     * @date 2020-3-29
     */
    @RequestMapping(value = "listFirstSort")
    public AppResponse listFirstSort(FirstSortInfo firstSortInfo){
        try{
            return firstSortService.listFirstSort(firstSortInfo);
        }catch (Exception e){
            logger.error("查询一级分类列表异常",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 删除一级分类
     * @param firstSortId
     * @return AppResponse
     * @author weiming
     * @date 2020-3-29
     */
    @PostMapping("deleteFirstSort")
    public AppResponse deleteFirstSort(String firstSortId){
        try{
            String userId = AuthorUtil.getCurrentUserId();
            return firstSortService.deleteFirstSort(firstSortId,userId);
        }catch (Exception e){
            logger.error("分类删除错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 修改一级分类
     * @param firstSortInfo
     * @return AppResponse
     * @author weiming
     * @date 2020-3-29
     */
    @PostMapping("updateFirstSort")
    public AppResponse updateFirstSort(FirstSortInfo firstSortInfo){
        try{
            //获取用户id
            String userId = AuthorUtil.getCurrentUserId();
            firstSortInfo.setCreatBy(userId);
            firstSortInfo.setLastModifyBy(userId);
            return firstSortService.updateFirstSort(firstSortInfo);
        }catch (Exception e){
            logger.error("修改分类信息错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询一级分类详情
     * @param firstSortId
     * @return AppResponse
     * @author weiming
     * @date 2020-3-29
     */
    @RequestMapping(value = "getFirstSortInfo")
    public AppResponse getFirstSortInfo(String firstSortId){
        try{
            return firstSortService.getFirstSortInfo(firstSortId);
        }catch (Exception e){
            logger.error("分类查询错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
