package com.xzsd.pc.sort.service;


import com.xzsd.pc.address.entity.CountyInfo;
import com.xzsd.pc.sort.dao.FirstSortDao;
import com.xzsd.pc.sort.dao.SecondSortDao;
import com.xzsd.pc.sort.entity.*;
import com.xzsd.pc.util.AppResponse;
import com.xzsd.pc.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

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
     * 查询分类列表
     * @param firstSortInfo
     * @return
     * @author weiming
     * @date 2020-3-28
     */
    public AppResponse listFirstSort(FirstSortInfo firstSortInfo){
        List<FirstSortInfo> firstSortInfoList = firstSortDao.listFirstSort(firstSortInfo);
        return AppResponse.success("查询成功",firstSortInfoList);
    }


    /**
     * 查询分类详情
     */
    @Resource
    private SecondSortDao secondSortDao;

    public AppResponse getSortInfo(String sortId){
        SortInfoA sortInfoA = new SortInfoA();
        sortInfoA.setSortId(sortId);
        //校验是该分类编号是否是一级分类
        int countSort = firstSortDao.count(sortId);
        if(countSort == 1){
            SortInfo firstSortInfo = firstSortDao.getFirstSortInfo(sortInfoA);
            return AppResponse.success("查询成功",firstSortInfo);
        }
        else{
            SortInfo secondSortInfo = secondSortDao.getSecondSortInfo(sortInfoA);
            System.out.println(secondSortInfo);
            return AppResponse.success("查询成功",secondSortInfo);
        }
    }

    /**
     * 修改分类详情
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateSort(SortInfoU sortInfoU){

        AppResponse appResponse = AppResponse.success("修改成功");
        //修改分类信息
        if(sortInfoU.getFatherSortId() == null){
            int count = firstSortDao.updateFirstSort(sortInfoU);
            if(count == 0){
                appResponse = AppResponse.versionError("数据有变化，请刷新!");
                return appResponse;
            }
        }
        else{
            int count = secondSortDao.updateSecondSort(sortInfoU);
            if(count == 0){
                appResponse = AppResponse.versionError("数据有变化，请刷新!");
                return appResponse;
            }
        }
        return appResponse;
    }

    /**
     *删除分类
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteSort(SortInfoU sortInfoU){
        System.out.println(sortInfoU.getSortId());
        AppResponse appResponse = AppResponse.success("删除成功!");
        if(sortInfoU.getFatherSortId() == null){
            //判断是否有子类
            CountSort sub = firstSortDao.countSort(sortInfoU.getSortId());
            int countSub = sub.getCountSort();
            int count = firstSortDao.deleteFirstSort(sortInfoU);
            if(count == 0 || countSub != 0){
                appResponse = AppResponse.versionError("删除一级分类失败，请重试!");
                return appResponse;
            }
            return appResponse;
        }
        else{
            int countGoods = secondSortDao.countGoodsNum(sortInfoU.getSortId());
            int countDe = secondSortDao.transmitDFirstSort(sortInfoU);
            int count = secondSortDao.deleteSecondSort(sortInfoU);
            if(count == 0 || countDe == 0 || countGoods != 0){
                appResponse = AppResponse.versionError("删除二级分类失败，请重试!");
                return appResponse;
            }
            return appResponse;
        }
    }
    /**
     * 新增分类
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addFirstSort(SortInfoA sortInfoA){
        sortInfoA.setSortId(StringUtil.getCommonCode(3));
        if(sortInfoA.getFatherSortId() == null) {
            int countFirstSort = firstSortDao.countsFirstSort(sortInfoA);
            if (countFirstSort != 0) {
                return AppResponse.bizError("该一级分类已存在，请重新输入！");
            }
            int count = firstSortDao.addFirstSort(sortInfoA);
            if (count == 0) {
                return AppResponse.bizError("新增失败，请重试");
            }
        }
        else {
            int countSecondSort = secondSortDao.countSecondSort(sortInfoA);
            if (countSecondSort != 0) {
                return AppResponse.bizError("该二级分类已存在，请重新输入！");
            }
            int count1 = secondSortDao.addSecondSort(sortInfoA);
            int count2 = secondSortDao.transmitFirstSort(sortInfoA);
            if ((count1 == 0) || (count2 == 0)) {
                return AppResponse.bizError("新增失败，请重试!");
            }
        }
            return AppResponse.success("新增成功");
        }
    }
