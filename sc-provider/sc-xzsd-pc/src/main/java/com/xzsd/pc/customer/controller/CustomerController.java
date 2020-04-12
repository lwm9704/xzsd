package com.xzsd.pc.customer.controller;

import com.xzsd.pc.customer.entity.CustomerInfo;
import com.xzsd.pc.customer.service.CustomerService;
import com.xzsd.pc.util.AppResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 客户查询
 * @author weiming
 * @date 2020-4-1
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Resource
    private CustomerService customerService;

    /**
     * 查询客户列表
     * @param customerInfo
     * @return AppResponse
     * @author weiming
     * @date 2020-4-1
     */
    @PostMapping("listCustomer")
    public AppResponse listCustomer(CustomerInfo customerInfo){
        try{
            return customerService.listCustomer(customerInfo);
        }catch (Exception e){
            logger.error("查询客户列表异常",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询客户详情
     * @param customerId
     * @return AppResponse
     * @author weiming
     * @date 2020-4-1
     */
    @PostMapping("getCustomerById")
    public AppResponse getCustomerById(String customerId){
        try{
            return customerService.getCustomerById(customerId);
        }catch (Exception e){
            logger.error("查询客户错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
