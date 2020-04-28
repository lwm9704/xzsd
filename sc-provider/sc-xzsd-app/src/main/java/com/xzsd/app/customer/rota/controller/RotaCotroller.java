package com.xzsd.app.customer.rota.controller;

import com.xzsd.app.customer.rota.service.RotaService;
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
@RequestMapping("/custromer")
public class RotaCotroller {
   @Resource
   private RotaService rotaService;

   private static final Logger logger = LoggerFactory.getLogger(RotaCotroller.class);

    /**
     * 获取轮播图信息
     * @param
     * @return AppRsponse
     */
    @RequestMapping("findRotatPicture")
    public AppResponse getRotaList(){
        try{
            return rotaService.getRotaList();
        }catch (Exception e){
            logger.error("查询轮播图异常",e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
