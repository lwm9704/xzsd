package com.xzsd.pc.user.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.util.StringUtil;
import com.xzsd.pc.user.dao.UserDao;
import com.xzsd.pc.user.entity.UserInfo;
import com.xzsd.pc.util.AppResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding;
import java.applet.AppletStub;
import java.util.Arrays;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

/**
 * @实现类
 * @author weiming
 * @date 2020-3-25
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;

    /**
     * user 新增用户
     * @param userInfo
     * @return
     * @author weiming
     * @date 2020-3-25
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveUser(UserInfo userInfo){
        //校验账号是否存在
        int countUserAccount = userDao.countUserAcct(userInfo);
        if(countUserAccount != 0){
            return AppResponse.bizError("用户已存在");
        }
        userInfo.setUserId(StringUtil.getCommonCode(2));
        userInfo.setIsDelete(0);
        //新增用户
        int count = userDao.saveUser(userInfo);
        if(count == 0){
            return AppResponse.bizError("新增失败，请重新输入！");
        }
        return AppResponse.bizError("新增成功");
    }
    /**
     * 查询用户列表（分页）
     * @param userInfo
     * @return
     * @author weilming
     * @date 2020-3-25
     */
    public AppResponse listUsers(UserInfo userInfo){
        List<UserInfo> userInfoList = userDao.listUsersByPage(userInfo);
        return AppResponse.success("查询成功！",getPageInfo(userInfoList));
    }
    /**
     * 删除用户
     * @param  userId
     * @param gUserId
     * @return
     * @author weiming
     * @date 2020-3-26
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteUser(String userId,String gUserId){
        List<String> listId = Arrays.asList(userId.split(","));
        AppResponse appResponse = AppResponse.success("删除成功!");
        //删除用户
        int count = userDao.deleteUser(listId,gUserId);
        if(count == 0){
            appResponse = AppResponse.bizError("删除失败，请重试！");
        }
        return appResponse;
    }
    /**
     * 修改用户
     * @param userInfo
     * @return
     * @author weiming
     * @date 2020-3-26
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateUser(UserInfo userInfo){
        AppResponse appResponse = AppResponse.success("修改成功");
        //校验账号是否存在
        int countUserAcct = userDao.countUserAcct(userInfo);
        if(countUserAcct != 0){
            return AppResponse.bizError("用户账号已存在，请重新输入！");
        }
        //修改用户信息
        int count = userDao.updateUser(userInfo);
        if(count == 0){
            appResponse = AppResponse.versionError("数据有变化，请刷新");
            return appResponse;
        }
        return appResponse;
    }
    /**
     * 查询用户
     * @param userId
     * @return
     * @author weimng
     * @date 2020-3-27
     */
    public AppResponse getUserByUserId(String userId){
        UserInfo userInfo = userDao.getUserByUserId(userId);
        return AppResponse.success("插叙成功",userInfo);
    }
}



