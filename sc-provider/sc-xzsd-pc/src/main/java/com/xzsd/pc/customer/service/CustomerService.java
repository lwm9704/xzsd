package com.xzsd.pc.customer.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xzsd.pc.customer.dao.CustomerDao;
import com.xzsd.pc.customer.entity.CustomerInfo;
import com.xzsd.pc.util.AppResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

/**
 * 实现类
 * @author weiming
 * @date 2020-4-1
 */
@Service
public class CustomerService {

    @Resource
    private CustomerDao customerDao;

    /**
     * 查询客户列表（分页）
     * @param customerInfo
     * @return AppResponse
     * @author weiming
     * @date 2020-4-1
     */
    public AppResponse listCustomer(CustomerInfo customerInfo){
        List<CustomerInfo> customerInfoList = customerDao.listCustomerByPage(customerInfo);
        return AppResponse.success("查询成功",getPageInfo(customerInfoList));
    }
    /**
     * 查询客户详情
     * @param customerId
     * @return
     * @author weiming
     * @date 2020-4-1
     */
    public AppResponse getCustomerById(String customerId){
        CustomerInfo customerInfo = customerDao.getCustomerById(customerId);
        return AppResponse.success("查询成功",customerInfo);
    }
}
