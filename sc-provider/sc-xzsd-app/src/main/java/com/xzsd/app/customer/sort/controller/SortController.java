package com.xzsd.app.customer.sort.controller;

import com.xzsd.app.customer.sort.service.SortService;
import com.xzsd.app.util.AppResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author weiming
 * @date 2020-4-15
 */
@RestController
@RequestMapping("/customer")
public class SortController {

    private static final Logger logger = LoggerFactory.getLogger(SortController.class);

    @Resource
    private SortService sortService;

    /**
     * 获取一级分类信息
     */
    @RequestMapping("firstSortList")
    public AppResponse getFirtSort(){
        try{
            return sortService.getFirstSort();
        }catch (Exception e){
            logger.error("查询一级分类异常",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 获取二级分类
     * @param firstSortId
     * @return
     */
    @RequestMapping("secondeSortList")
    public AppResponse getSecondSort(String firstSortId){
        try{
            return sortService.getSecondSort(firstSortId);
        }catch (Exception e){
            logger.error("查询二级分类异常",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询商品
     * @param firstSortId
     * @param secondSortId
     * @return
     */
    @RequestMapping("sortGoodsList")
    public AppResponse getSortGoodsList(String firstSortId,String secondSortId){
        try{
            return sortService.getSortGoodsList(firstSortId,secondSortId);
        }catch (Exception e){
            logger.error("查询商品异常",e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
