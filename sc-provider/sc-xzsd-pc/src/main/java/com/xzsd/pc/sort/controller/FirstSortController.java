package com.xzsd.pc.sort.controller;

import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.pc.sort.entity.FirstSortInfo;
import com.xzsd.pc.sort.entity.SortInfoA;
import com.xzsd.pc.sort.entity.SortInfoU;
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
@RequestMapping("/user")
public class FirstSortController {

    private static final Logger logger = LoggerFactory.getLogger(FirstSortController.class);

    @Resource
    private FirstSortService firstSortService;

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
     *查询详情
     */
    @RequestMapping(value = "findGoodsSort")
    public AppResponse getFirstSortInfo(String sortId){
        try{
            return firstSortService.getSortInfo(sortId);
        }catch (Exception e){
            logger.error("分类查询错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     *修改分类信息
     */
    @PostMapping("updateGoodsSort")
    public AppResponse updateFirstSort(SortInfoU sortInfoU){
        try{
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            sortInfoU.setLastModifyBy(userId);
            return firstSortService.updateSort(sortInfoU);
        }catch (Exception e){
            logger.error("修改分类信息错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     *删除分类
     */
    @PostMapping("deleteGoodsSort")
    public AppResponse deleteFirstSort(SortInfoU sortInfoU){
        try{
            String userId = SecurityUtils.getCurrentUserId();
            sortInfoU.setLastModifyBy(userId);
            return firstSortService.deleteSort(sortInfoU);
        }catch (Exception e){
            logger.error("分类删除错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 新增分类
     */
    @PostMapping("addGoodsSort")
    public AppResponse addFirstSort(SortInfoA sortInfoA){
        try{
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            sortInfoA.setCreatBy(userId);
            AppResponse appResponse = firstSortService.addFirstSort(sortInfoA);
            return appResponse;
        }catch (Exception e){
            logger.error("分类新增失败",e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
