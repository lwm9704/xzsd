package com.xzsd.pc.driver.controller;

import com.xzsd.pc.driver.entity.DriverInfoF;
import com.xzsd.pc.driver.entity.DriverInfoU;
import com.xzsd.pc.driver.service.DriverService;
import com.xzsd.pc.util.AppResponse;
import com.xzsd.pc.util.AuthorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.rmi.server.ExportException;

/**
 * @author weiming
 * @date 2020-4-8
 */
@RestController
@RequestMapping("/driver")
public class DriverController {

    private static final Logger logger = LoggerFactory.getLogger(DriverController.class);

    @Resource
    private DriverService driverService;

    /**
     * 新增司机
     * @param driverInfoU
     * @return AppResponse
     * @author weiming
     * @date 2020-4-8
     */
    @RequestMapping("addDriver")
    public AppResponse addDriver(DriverInfoU driverInfoU){
        try{
            //获取用户id
            String userId = AuthorUtil.getCurrentUserId();
            driverInfoU.setCreatBy(userId);
            AppResponse appResponse = driverService.addDriver(driverInfoU);
            return appResponse;
        }catch (Exception e){
            logger.error("新增司机失败",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 修改司机信息
     * @param driverInfoU
     * @return AppResponse
     * @author weiming
     * @date 2020-4-8
     */
    @PostMapping("updateDriver")
    public AppResponse updateDriver(DriverInfoU driverInfoU){
        try{
            //获取用户id
            String userId = AuthorUtil.getCurrentUserId();
            driverInfoU.setCreatBy(userId);
            driverInfoU.setLastModifyBy(userId);
            return driverService.updateDriver(driverInfoU);
        }catch (Exception e){
            logger.error("修改司机信息错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 删除司机信息
     * @param id
     * @return
     * @author weiming
     * @date 2020-4-8
     */
    @PostMapping("deleteDriver")
    public AppResponse deleteDriver(String id){
        try{
            //获取用户id
            String userId = AuthorUtil.getCurrentUserId();
            return driverService.deleteDriver(id,userId);
        }catch (Exception e){
            logger.error("司机信息删除错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询司机信息列表
     * @param driverInfoF
     * @return AppResponse
     * @author weiming
     * @date 2020-4-8
     */
    @RequestMapping("listDriver")
    public AppResponse listDriver(DriverInfoF driverInfoF){
        try{
            return driverService.listDriver(driverInfoF);
        }catch (Exception e){
            logger.error("查询司机信息列表异常",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询司机详情
     * @param driverId
     * @return
     * @author weiming
     * @date 2020-4-8
     */
    @RequestMapping("getDriverById")
    public AppResponse getDriverById(String driverId){
        try{
            return driverService.getDriverById(driverId);
        }catch (Exception e){
            logger.error("司机信息查询错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
