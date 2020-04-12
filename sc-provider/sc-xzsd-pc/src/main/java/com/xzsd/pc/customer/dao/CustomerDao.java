package com.xzsd.pc.customer.dao;

import com.xzsd.pc.customer.entity.CustomerInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CustomerDao {

    /**
     * 查询客户列表
     * @param customerInfo
     * @return
     * @author weiming
     * @date 2020-4-1
     */
    List<CustomerInfo> listCustomerByPage(CustomerInfo customerInfo);
    /**
     * 查询客户详情
     * @param customerId
     * @return
     * @author weiming
     * @date 2020-4-1
     */
    CustomerInfo getCustomerById(@Param("customerId") String customerId);
}
