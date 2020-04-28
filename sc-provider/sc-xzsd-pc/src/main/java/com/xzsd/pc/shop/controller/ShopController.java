package com.xzsd.pc.shop.controller;

import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.pc.shop.entity.ShopInfoF;
import com.xzsd.pc.shop.entity.ShopInfoU;
import com.xzsd.pc.shop.service.ShopService;
import com.xzsd.pc.util.AppResponse;
import com.xzsd.pc.util.AuthorUtil;
import com.xzsd.pc.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.event.TransactionalEventListener;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Random;

/**
 * @author weiming
 * @date 2020-4-7
 */
@RestController
@RequestMapping("/user")
public class ShopController {

    private static final Logger logger = LoggerFactory.getLogger(ShopController.class);

    @Resource
    private ShopService shopService;

    /**
     * 新增门店
     *
     * @param shopInfoU
     * @return AppResponse
     * @author weiming
     * @date 2020-4-7
     */
    @PostMapping("addShop")
    public AppResponse addShop(ShopInfoU shopInfoU) {
        try {
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            shopInfoU.setByUserId(userId);
            String shopId = StringUtil.getCommonCode(2);
            shopInfoU.setShopId(shopId);
            Random random =new Random();
            String invitationCode = userId.substring(5,9)+random.nextInt(8);
            shopInfoU.setInvitationCode(invitationCode);
            AppResponse appResponse = shopService.addShopInfo(shopInfoU);
            return appResponse;
        } catch (Exception e) {
            logger.error("新增门店失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 删除门店信息
     *
     * @param shopId
     * @return
     * @author weiming
     * @date 2020-4-7
     */
    @PostMapping("deleteShopById")
    public AppResponse deleteShop(String shopId) {
        try {
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            return shopService.deleteShop(shopId, userId);
        } catch (Exception e) {
            logger.error("门店删除错误");
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 修改门迪信息
     * @param shopInfoU
     * @return
     * @author weiming
     * @date 2020-4-7
     */
    @PostMapping("updateShop")
    public AppResponse updateShop(ShopInfoU shopInfoU){
        try{
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            shopInfoU.setByUserId(userId);
            return shopService.updateShop(shopInfoU);
        }catch (Exception e){
            logger.error("修改门店信息错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询门店信息列表
     * @param shopInfoF
     * @return
     * @author weiming
     * @date 2020-4-7
     */
    @RequestMapping("listShop")
    public AppResponse listShop(ShopInfoF shopInfoF){
        try{
            return shopService.listShop(shopInfoF);
        }catch (Exception e){
            logger.error("查询门店列表异常",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询门店详情
     * @param shopId
     * @return
     * @author weiming
     * @date 2020-4-7
     */
    @RequestMapping("getShopById")
    public AppResponse getShopById(String shopId){
        try{
            return shopService.getShopInfoById(shopId);
        }catch (Exception e){
            logger.error("门店查询异常",e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
