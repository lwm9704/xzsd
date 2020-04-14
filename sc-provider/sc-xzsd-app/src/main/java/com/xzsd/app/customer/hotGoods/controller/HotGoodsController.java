package com.xzsd.app.customer.hotGoods.controller;

import com.xzsd.app.customer.hotGoods.service.HotGoodsService;
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
public class HotGoodsController {
    @Resource
    private HotGoodsService hotGoodsService;

    private static final Logger logger = LoggerFactory.getLogger(HotGoodsController.class);

    /**
     * 获取热门商品信息列表
     */
    @RequestMapping("listHotGoods")
    public AppResponse getHostGoods(){
        try{
            return hotGoodsService.getHotGoodsList();
        }catch (Exception e){
            logger.error("查询异常",e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
