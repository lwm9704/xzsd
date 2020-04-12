package com.xzsd.pc.sort.service;


import com.neusoft.util.StringUtil;
import com.xzsd.pc.sort.dao.FirstSortDao;
import com.xzsd.pc.sort.entity.FirstSortInfo;
import com.xzsd.pc.util.AppResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 实现类
 * @author weiming
 * @date 2020-3-28
 */
@Service
public class FirstSortService {

    @Resource
    private FirstSortDao firstSortDao;

    /**
     * 新增分类
     * @param firstSortInfo
     * @return
     * @author weiming
     * @date 2020-3-28
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addFirstSort(FirstSortInfo firstSortInfo){
        //校验该分类是否存在
        int countFirstSort = firstSortDao.countsFirstSort(firstSortInfo);
        if(countFirstSort != 0){
            return AppResponse.bizError("该分类已存在，请重新输入！");
        }
        firstSortInfo.setFirstSortId(StringUtil.getCommonCode(2));
        firstSortInfo.setIsDelete(0);
        //新增一级分类
        int count = firstSortDao.addFirstSort(firstSortInfo);
        if(count == 0){
            return AppResponse.bizError("新增失败，请重试");
        }
        return AppResponse.success("新增成功");
    }
    /**
     * 查询分类列表
     * @param firstSortInfo
     * @return
     * @author weiming
     * @date 2020-3-28
     */
    public AppResponse listFirstSort(FirstSortInfo firstSortInfo){
        List<FirstSortInfo> firstSortInfoList = firstSortDao.listFirstSort(firstSortInfo);
        return AppResponse.success("插叙成功",firstSortInfoList);
    }
    /**
     * 删除一级分类
     * @param firstSortId
     * @param userId
     * @return
     * @author weiming
     * @date 2020-3-28
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteFirstSort(String firstSortId,String userId){
        AppResponse appResponse = AppResponse.success("删除成功!");
        int count = firstSortDao.deleteFirstSort(firstSortId,userId);
        if(count == 0){
            appResponse = AppResponse.bizError("删除失败，请重试！");
        }
        return appResponse;
    }
    /**
     *修改一级分类
     * @param firstSortInfo
     * @return
     * @author weiming
     * @date 2020-3-28
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateFirstSort(FirstSortInfo firstSortInfo){
        AppResponse appResponse = AppResponse.success("修改成功");
        //修改一级分类信息
        int count = firstSortDao.updateFirstSort(firstSortInfo);
        if(count == 0){
            appResponse = AppResponse.versionError("数据有变化，请刷新!");
            return appResponse;
        }
        return appResponse;
    }
    /**
     * 查询一级分类详情
     * @param firstSortId
     * @return
     * @author weiming
     * @date 2020-3-28
     */
    public AppResponse getFirstSortInfo(String firstSortId){
        FirstSortInfo firstSortInfo = firstSortDao.getFirstSortInfo(firstSortId);
        return AppResponse.success("查询成功",firstSortInfo);
    }
}
