package com.xzsd.pc.rotation.service;

import com.xzsd.pc.goodsSelect.dao.GoodsSelectDao;
import com.xzsd.pc.goodsSelect.entity.GoodsSelectInfoF;
import com.xzsd.pc.rotation.dao.RotationDao;
import com.xzsd.pc.rotation.entity.*;
import com.xzsd.pc.util.AppResponse;
import com.xzsd.pc.util.AuthorUtil;
import com.xzsd.pc.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

/**
 * @author weiming
 * @date 2020-4-4
 */
@Service
public class RotationService {

    @Resource
    private RotationDao rotationDao;
    @Resource
    private GoodsSelectDao goodsSelectDao;

    /**
     * 新增轮播图
     * @param rotationInfoA
     * @return
     * @author weiming
     * @date 2020-4-4
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse uploadMg(RotationInfoA rotationInfoA) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date starDate = simpleDateFormat.parse(rotationInfoA.getStarTime());
            Date endDate = simpleDateFormat.parse(rotationInfoA.getEndTime());
            rotationInfoA.setStarDate(starDate);
            rotationInfoA.setEndDate(endDate);
        }catch (ParseException e){
            e.printStackTrace();
        }
        //校验排序
        int countSort = rotationDao.addCountSort(rotationInfoA.getRotaSort());
        if(countSort != 0){
            return AppResponse.bizError("新增失败，该排序已存在，请重新输入");
        }
        rotationInfoA.setRotaId(StringUtil.getCommonCode(2));
        rotationInfoA.setCreatBy(AuthorUtil.getCurrentUserId());
        //存进数据库
        int count = rotationDao.uploadMg(rotationInfoA);
        if(count == 0){
            return AppResponse.bizError("新增失败，请重新输入");
        }
        return AppResponse.success("新增成功");
    }
    /**
     * 删除轮播图
     * @param rotationId
     * @param userId
     * @return
     * @author weiming
     * @date 2020-4-4
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteMg(String rotationId,String userId){
        List<String> listId = Arrays.asList(rotationId);
        AppResponse appResponse = AppResponse.success("删除成功");
        //删除轮播图
        int count = rotationDao.deleteMg(listId,userId);
        if(count == 0){
            appResponse = AppResponse.bizError("删除失败，请重试");
        }
        return appResponse;
    }
    /**
     * 修改轮播图状态
     * @param
     * @return
     * @author weiming
     * @date 2020-4-4
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateState(RotationInfoU rotationInfoU){
        AppResponse appResponse = AppResponse.success("修改状态成功");
        //校验轮播图是否存在
        int countRotation = rotationDao.countRotation(rotationInfoU.getRotaId());
        if(countRotation == 0){
            return AppResponse.bizError("找不到该轮播图,请重新输入");
        }
        //修改状态
        int count = rotationDao.updateMgState(rotationInfoU);
        if(count == 0){
            appResponse = AppResponse.versionError("数据有变化，请刷新");
            return appResponse;
        }
        return appResponse;
    }
    /**
     * 查询轮播图列表
     * @param rotationInfoU
     * @author weiming
     * @date 2020-4-4
     */
    public AppResponse listRotation(RotationInfoU rotationInfoU){
        List<RotationInfoV> rotationInfoVList = rotationDao.listRotationByPage(rotationInfoU);
        return AppResponse.success("查询成功",getPageInfo(rotationInfoVList));
    }
}
