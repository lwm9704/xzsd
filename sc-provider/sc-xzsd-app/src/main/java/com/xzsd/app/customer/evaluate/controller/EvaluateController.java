package com.xzsd.app.customer.evaluate.controller;

import com.xzsd.app.customer.evaluate.entity.EvaluateInfoAU;
import com.xzsd.app.customer.evaluate.service.EvaluateService;
import com.xzsd.app.util.AppResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @weiming
 * @date 2020-4-26
 */
@RestController
@RequestMapping("customer")
public class EvaluateController {

    private static final Logger logger = LoggerFactory.getLogger(EvaluateController.class);

    @Resource
    private EvaluateService evaluateService;
    /**
     * 商品评价列表
     */
    @RequestMapping("goodsEvaluateList")
    public AppResponse listEvaluate(String goodsId){
        try{
            return evaluateService.listEvaluate(goodsId);
        }catch (Exception e){
            logger.error("查询商品评价列表失败",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 新增商品评价
     */
    @RequestMapping("addGoodsEvaluate")
    public AppResponse creatEvaluate(EvaluateInfoAU evaluateInfoAU){
        try{
            return evaluateService.creatEvaluate(evaluateInfoAU);
        }catch (Exception e){
            logger.error("新增商品评价成功",e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
