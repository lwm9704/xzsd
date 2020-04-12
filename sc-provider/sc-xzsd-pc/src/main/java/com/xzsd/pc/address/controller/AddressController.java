package com.xzsd.pc.address.controller;

import com.xzsd.pc.address.entity.CityInfo;
import com.xzsd.pc.address.entity.CountyInfo;
import com.xzsd.pc.address.service.AddressService;
import com.xzsd.pc.util.AppResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Resource
    private AddressService addressService;

    private static final Logger logger = LoggerFactory.getLogger(AddressController.class);

    /**
     * 查询省列表
     * @author weiming
     * @date 2020-4-11
     */
    @RequestMapping("province")
    public AppResponse listProvince(){
        try{
            return addressService.listProvince();
        }catch (Exception e){
            logger.error("查询省列表异常",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询市列表
     * @author weiming
     * @date 2020-4-11
     */
    @RequestMapping("city")
    public AppResponse listCity(CityInfo cityInfo){
        try{
            return addressService.listCity(cityInfo);
        }catch (Exception e){
            logger.error("查询市列表异常",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询区列表
     * @author weiming
     * @date 2020-4-11
     */
    @RequestMapping("county")
    public AppResponse listCounty(CountyInfo countyInfo){
        try{
            return addressService.listCounty(countyInfo);
        }catch (Exception e){
            logger.error("查询区列表",e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
