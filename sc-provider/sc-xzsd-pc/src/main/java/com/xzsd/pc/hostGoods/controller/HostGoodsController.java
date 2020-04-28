package com.xzsd.pc.hostGoods.controller;

import com.neusoft.security.client.utils.SecurityUtils;
import com.sun.jersey.core.impl.provider.entity.XMLRootObjectProvider;
import com.xzsd.pc.hostGoods.entity.HostGoodsInfoF;
import com.xzsd.pc.hostGoods.entity.HostGoodsInfoU;
import com.xzsd.pc.hostGoods.entity.ShowNumInfo;
import com.xzsd.pc.hostGoods.service.HostGoodsService;
import com.xzsd.pc.util.AppResponse;
import com.xzsd.pc.util.AuthorUtil;
import com.xzsd.pc.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author weiming
 * @date 2020-4-6
 */
@RestController
@RequestMapping("/user")
public class HostGoodsController {

    private static final Logger logger = LoggerFactory.getLogger(HostGoodsController.class);

    @Resource
    private HostGoodsService hostGoodsService;

    /**
     * 新增热门位商品
     * @param hostGoodsInfoU
     * @return AppResponse
     * @author weiming
     * @date 2020-4-6
     */
    @PostMapping("addHotGoods")
    public AppResponse addHostGoods(HostGoodsInfoU hostGoodsInfoU){
        try{
            String userId = SecurityUtils.getCurrentUserId();
            hostGoodsInfoU.setCreatBy(userId);
            String hostId = StringUtil.getCommonCode(1);
            hostGoodsInfoU.setHostId(hostId);
            AppResponse appResponse = hostGoodsService.addHostGoods(hostGoodsInfoU);
            return appResponse;
        }catch (Exception e){
            logger.error("新增热门位商品失败");
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询热门位商品列表
     * @param hostGoodsInfoF
     * @return AppResponse
     * @author weiming
     * @date 2020-4-6
     */
    @RequestMapping("listHotGoods")
    public AppResponse listHostGoolistHotGoods(HostGoodsInfoF hostGoodsInfoF){
        try{
            return hostGoodsService.listHostGoods(hostGoodsInfoF);
        }catch (Exception e){
            logger.error("查询热门位商品异常",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 删除热门位商品
     * @param hostId
     * @return AppResponse
     * @author weiming
     * @date 2020-4-6
     */
    @PostMapping("deleteHotGoods")
    public AppResponse deleteHostGoods(String hostId){
        try{
            String userId = SecurityUtils.getCurrentUserId();
            return hostGoodsService.deleteHostGoods(hostId,userId);
        }catch (Exception e){
            logger.error("热门位商品删除错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 修改热门位商品
     * @param hostGoodsInfoU
     * @return AppResponse
     * @author weiming
     * @date 2020-4-6
     */
    @PostMapping("updateHotGoodsById")
    public AppResponse updateHostGoods(HostGoodsInfoU hostGoodsInfoU){
        try{
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            hostGoodsInfoU.setCreatBy(userId);
            hostGoodsInfoU.setLastModifyBy(userId);
            return hostGoodsService.updateHostGoods(hostGoodsInfoU);
        }catch (Exception e){
            logger.error("修改热门位商品信息错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 修改展示数量
     */
    @PostMapping("updateHotGoodsNum")
    public AppResponse setShowNum(int showNum){
        ShowNumInfo showNumInfo = new ShowNumInfo();
        String userId = SecurityUtils.getCurrentUserId();
        showNumInfo.setShowNum(showNum);
        showNumInfo.setUserId(userId);
        try{
            return hostGoodsService.setShowNum(showNumInfo);
        }catch (Exception e){
            logger.error("修改展示数量失败",e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     *热门详情
     */
    @RequestMapping("getHostInfo")
    public AppResponse getHostInfo(String hostId){
        try{
            return hostGoodsService.getHostInfo(hostId);
        }catch (Exception e){
            logger.error("查询详情失败",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 获取数量
     */
    @RequestMapping("listHotGoodsNum")
    public AppResponse getHotNum(){
        try{
            return hostGoodsService.getHotNum();
        }catch (Exception e){
            logger.error("查询展示数量失败",e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
