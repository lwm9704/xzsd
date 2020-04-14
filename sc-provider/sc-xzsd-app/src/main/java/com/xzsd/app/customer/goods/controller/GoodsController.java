package com.xzsd.app.customer.goods.controller;

import com.xzsd.app.customer.goods.service.GoodsService;
import com.xzsd.app.util.AppResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author weiming
 * @date 2020-4-14
 */
@RestController
@RequestMapping("customer")
public class GoodsController {
    @Resource
    private GoodsService goodsService;

    private static final Logger logger = LoggerFactory.getLogger(GoodsController.class);

    /**
     * 获取商品详情
     * @param goodsId
     * @AppResponse
     */
    public AppResponse getGoodsInfo(String goodsId){
        try{
            return goodsService.getGoodsInfo(goodsId);
        }catch (Exception e){
            logger.error("查询商品详情异常",e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
