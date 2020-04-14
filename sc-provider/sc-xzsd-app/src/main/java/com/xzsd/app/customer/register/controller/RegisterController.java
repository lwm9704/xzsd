package com.xzsd.app.customer.register.controller;

import com.xzsd.app.customer.register.entity.RegisterInfo;
import com.xzsd.app.customer.register.service.RegisterService;
import com.xzsd.app.util.AppResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author weiming
 * @date 2020-4-13
 */
@RestController
@RequestMapping("/register")
public class RegisterController {

    private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);

    @Resource
    private RegisterService registerService;

    /**
     * 用户注册
     * @param registerInfo
     * @return AppResponse
     * @author weiming
     * @date 2020-4-13
     */
    @PostMapping("registerUser")
    public AppResponse register(RegisterInfo registerInfo){
        try{
            return registerService.register(registerInfo);
        }catch (Exception e){
            logger.error("注册用户异常",e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
