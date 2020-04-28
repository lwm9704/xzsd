package com.xzsd.app.customer.evaluate.service;

import com.xzsd.app.customer.evaluate.dao.EvaluateDao;
import com.xzsd.app.customer.evaluate.entity.EvaluateInfoAU;
import com.xzsd.app.customer.evaluate.entity.EvaluateList;
import com.xzsd.app.util.AppResponse;
import com.xzsd.app.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author weiming
 * @date 2020-4-26
 */
@Service
public class EvaluateService {

    private EvaluateDao evaluateDao;

    /**
     * 查询商品评价详情
     */
    public AppResponse listEvaluate(String goodsId){
        EvaluateList evaluateList = evaluateDao.listEvaluate(goodsId);
        return AppResponse.success("查询商品评价列表成功",evaluateList);
    }

    /**
     * 新增商品评价
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse creatEvaluate(EvaluateInfoAU evaluateInfoAU){
        String evaluateId = StringUtil.getCommonCode(1);
        evaluateInfoAU.setEvaluateId(evaluateId);
        int count = evaluateDao.creatEvaluate(evaluateInfoAU);
        if(count == 0){
            return AppResponse.bizError("新增商品评价失败");
        }
        return AppResponse.success("新增商品评价失败");
    }
}
