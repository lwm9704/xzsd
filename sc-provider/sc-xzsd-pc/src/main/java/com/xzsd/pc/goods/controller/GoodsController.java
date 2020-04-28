package com.xzsd.pc.goods.controller;

import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.pc.cos.entity.MgInfo;
import com.xzsd.pc.goods.entity.GoodsInfoF;
import com.xzsd.pc.goods.entity.GoodsInfoU;
import com.xzsd.pc.goods.entity.GoodsState;
import com.xzsd.pc.goods.service.GoodsService;
import com.xzsd.pc.util.AppResponse;
import com.xzsd.pc.util.AuthorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品的增删查改
 * @author weiming
 * @date 2020-3-27
 */
@RestController
@RequestMapping("/user")
public class GoodsController {

    private static final Logger logger = LoggerFactory.getLogger(GoodsController.class);

    @Resource
    private GoodsService goodsService;

    /**
     * 新增商品
     * @param goodsInfoU
     * @return AppResponse
     * @author weimng
     * @date 2020-3-27
     */
    @PostMapping("addGoods")
    public AppResponse addGoods(GoodsInfoU goodsInfoU, MgInfo mgInfo){
        try{
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            goodsInfoU.setCreatBy(userId);
            goodsInfoU.setpKey(mgInfo.getpKey());
            goodsInfoU.setpUrl(mgInfo.getpUrl());
            AppResponse appResponse = goodsService.addGoods(goodsInfoU);
            return appResponse;
        }catch (Exception e){
            logger.error("新增用户失败",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 删除商品
     * @param goodsId
     * @return AppResponse
     * @author weiming
     * @date 2020-3-27
     */
    @PostMapping("deleteGoods")
    public AppResponse deleteGoods(String goodsId){
        try{
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            return goodsService.deleteGoods(goodsId,userId);
        }catch (Exception e){
            logger.error("商品删除错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 修改商品
     * @param goodsInfoU
     * @return AppResponse
     * @author weiming
     * @date 2020-3-27
     */
    @PostMapping("updateGoodsById")
    public AppResponse updateGoods(GoodsInfoU goodsInfoU,MgInfo mgInfo){
        try{
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            goodsInfoU.setLastModifyBy(userId);
            goodsInfoU.setpKey(mgInfo.getpKey());
            goodsInfoU.setpUrl(mgInfo.getpUrl());
            return goodsService.updateGoods(goodsInfoU);
        }catch (Exception e){
            logger.error("修改商品信息错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询商品列表
     * @param goodsInfoF
     * @return AppResponse
     * @author weiming
     * @date 2020-3-27
     */
    @RequestMapping("listGoods")
    public AppResponse listGoods(GoodsInfoF goodsInfoF){
        try{
            return goodsService.listGoods(goodsInfoF);
        }catch (Exception e){
            logger.error("查询商品信息错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 修改商品状态
     */
    @PostMapping("updateGoodsState")
    public AppResponse updateState(GoodsState goodsState){
        try{
            String userId = SecurityUtils.getCurrentUserId();
            goodsState.setLastModifyBy(userId);
            return goodsService.updateState(goodsState);
        }catch (Exception e){
            logger.error("修改商品状态失败",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询商品详情
     */
    @PostMapping("getGoodsInfo")
    public AppResponse getGoodsInfo(String goodsId){
        try{
            return goodsService.getGoodsInfo(goodsId);
        }catch (Exception e){
            logger.error("查询商品详情失败",e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
