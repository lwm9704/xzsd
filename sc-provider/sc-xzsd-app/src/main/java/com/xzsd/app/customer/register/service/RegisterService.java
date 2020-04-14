package com.xzsd.app.customer.register.service;

import com.xzsd.app.customer.register.dao.RegisterDao;
import com.xzsd.app.customer.register.entity.RegisterInfo;
import com.xzsd.app.util.AppResponse;
import com.xzsd.app.util.AuthorUtil;
import com.xzsd.app.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author weiming
 * @date 2020-4-13
 */
@Service
public class RegisterService {
    @Resource
    private RegisterDao registerDao;
    /**
     * 用户注册
     * @param registerInfo
     * @return
     * @author weiming
     * @date 2020-4-13
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse register(RegisterInfo registerInfo){
        //校验用户名
        int countUserName = registerDao.countUser(registerInfo.getUserAcct());
        if(countUserName != 0){
            return AppResponse.bizError("用户名已存在，请重新输入");
        }
        //校验电话
        int countPhone = registerDao.countPhone(registerInfo.getPhone());
        if(countPhone != 0){
            return AppResponse.bizError("电话已注册，请重新输入");
        }
        //校验身份证
        int countIdCard = registerDao.countIdCard(registerInfo.getIdCard());
        if(countIdCard != 0){
            return AppResponse.bizError("身份证已注册，请重新输入");
        }
        //生成用户id
        registerInfo.setUserId(StringUtil.getCommonCode(2));
        int count = registerDao.register(registerInfo);
        if(count == 0){
            return AppResponse.bizError("注册失败，请重新输入");
        }
        return AppResponse.success("注册成功");
    }
}
