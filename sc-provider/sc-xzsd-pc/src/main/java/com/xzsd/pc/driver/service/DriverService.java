package com.xzsd.pc.driver.service;

import com.neusoft.util.StringUtil;
import com.xzsd.pc.driver.dao.DriverDao;
import com.xzsd.pc.driver.entity.DriverInfoF;
import com.xzsd.pc.driver.entity.DriverInfoU;
import com.xzsd.pc.driver.entity.DriverInfoV;
import com.xzsd.pc.util.AppResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

/**
 * 实现类
 * @author weiming
 * @date 2020-4-8
 */
@Service
public class DriverService {

    @Resource
    private DriverDao driverDao;

    /**
     * 新增司机
     * @param driverInfoU
     * @return
     * @author weiming
     * @date 2020-4-8
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addDriver(DriverInfoU driverInfoU){
        //校验该司机是否已经存在（BY Acct）
        int countDriver = driverDao.countDriver(driverInfoU.getDriverAcct());
        if(countDriver != 0){
            return AppResponse.bizError("该司机信息已经存在，请重新输入");
        }
        driverInfoU.setCreatBy(StringUtil.getCommonCode(2));
        driverInfoU.setId(StringUtil.getCommonCode(1));
        //新增司机
        int count = driverDao.addDriver(driverInfoU);
        if(count == 0){
            return AppResponse.bizError("新增失败，请重试");
        }
        return AppResponse.success("新增成功");
    }
    /**
     * 删除司机信息
     * @param id
     * @param userId
     * @author weiming
     * @date 2020-4-8
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteDriver(String id,String userId){
        List<String> listId = Arrays.asList(id.split(","));
        AppResponse appResponse = AppResponse.success("删除成功");
        //删除司机信息
        int count = driverDao.deletedriver(listId,userId);
        if(count == 0){
            appResponse = AppResponse.bizError("删除失败，请重试");
        }
        return appResponse;
    }
    /**
     * 修改司机信息
     * @param driverInfoU
     * @return
     * @author weiming
     * @date 2020-4-8
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateDriver(DriverInfoU driverInfoU){
        AppResponse appResponse = AppResponse.success("修改成功");
        int count = driverDao.updateDriver(driverInfoU);
        if(count == 0){
            return appResponse = AppResponse.versionError("数据有变化，请刷新");
        }
        return appResponse;
    }
    /**
     * 查询司机信息列表
     * @param driverInfoF
     * @return
     * @author weiming
     * @date 2020-4-8
     */
    public AppResponse listDriver(DriverInfoF driverInfoF){
        List<DriverInfoV> driverInfoVList = driverDao.listDriverByPage(driverInfoF);
        return AppResponse.success("查询成功",getPageInfo(driverInfoVList));
    }
    /**
     * 查询司机详情
     * @param driverId
     * @return
     * @author weiming
     * @date 2020-4-8
     */
    public AppResponse getDriverById(String driverId){
        DriverInfoV driverInfoV = driverDao.getDriverById(driverId);
        return AppResponse.success("查询成功",driverInfoV);
    }
}
