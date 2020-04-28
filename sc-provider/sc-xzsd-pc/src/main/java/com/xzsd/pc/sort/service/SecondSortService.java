package com.xzsd.pc.sort.service;

import com.neusoft.util.StringUtil;
import com.xzsd.pc.sort.dao.SecondSortDao;
import com.xzsd.pc.sort.entity.SecondSortInfo;
import com.xzsd.pc.sort.entity.SortInfo;
import com.xzsd.pc.util.AppResponse;
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
public class SecondSortService {

    @Resource
    private SecondSortDao secondSortDao;

//    /**
//     * 新增二级分类
//     * @param secondSortInfo
//     * @return
//     * @author weiming
//     * @date 2020-3-28
//     */
//    @Transactional(rollbackFor = Exception.class)
//    public AppResponse addSecondSort(SecondSortInfo secondSortInfo){
//        //校验分类是否存在
//        int countSecondSort = secondSortDao.countSecondSort(secondSortInfo);
//        if(countSecondSort != 0){
//            return AppResponse.bizError("该分类已存在，请重新输入!");
//        }
//        secondSortInfo.setSecondSortId(StringUtil.getCommonCode(2));
//        secondSortInfo.setIsDelete(0);
//        //新增分类
//        int count1 = secondSortDao.addSecondSort(secondSortInfo);
//        int count2 = secondSortDao.transmitFirstSort(secondSortInfo);
//        if((count1 == 0) || (count2 == 0)){
//            return AppResponse.bizError("新增失败，请重试!");
//        }
//        return AppResponse.success("新增成功");
//    }
    /**
     * 查询二级分类列表
     * @param secondSortInfo
     * @return
     * @author weiming
     * @date 2020-3-28
     */
    public AppResponse listSecondSort(SecondSortInfo secondSortInfo){
        List<SecondSortInfo> secondSortInfoList = secondSortDao.listSecondSortByPage(secondSortInfo);
        return AppResponse.success("查询成功！",secondSortInfoList);
    }
//    /**
//     * 删除二级分类
//     * @param secondSortId
//     * @param userId
//     * @return
//     * @author weiming
//     * @date 2020-3-28
//     */
//    @Transactional(rollbackFor = Exception.class)
//    public AppResponse deleteSecondSort(String secondSortId,String userId){
//        AppResponse appResponse = AppResponse.success("删除成功");
//        int countGoodsNum = secondSortDao.countGoodsNum(secondSortId);
//        if(countGoodsNum != 0){
//            appResponse.bizError("该分类下有商品，不能删除");
//            return appResponse;
//        }
//        //删除二级分类
//        int count = secondSortDao.deleteSecondSort(secondSortId,userId);
//        if(count == 0){
//            appResponse = AppResponse.bizError("删除失败，请重试!");
//        }
//        return appResponse;
//    }
//    /**
//     * 修改二级分类
//     * @param secondSortInfo
//     * @return
//     * @author weiming
//     * @date 2020-3-28
//     */
//    @Transactional(rollbackFor = Exception.class)
//    public AppResponse updateSecondSort(SecondSortInfo secondSortInfo){
//        AppResponse appResponse = AppResponse.success("修改成功");
//        //修改二级分类信息
//        int count = secondSortDao.updateSecondSort(secondSortInfo);
//        if(count == 0){
//            appResponse = AppResponse.versionError("数据有变化，请刷新!");
//            return appResponse;
//        }
//        return appResponse;
//    }
//    /**
//     * 查询二级分类详情
//     * @param secondSortId
//     * @return
//     * @author weiming
//     * @date 2020-3-28
//     */
//    public AppResponse getSecondSortInfo(String secondSortId){
//        SecondSortInfo secondSortInfo = secondSortDao.getSecondSortInfo(secondSortId);
//        return AppResponse.success("查询成功",secondSortInfo);
//    }
}
