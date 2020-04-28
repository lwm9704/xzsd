package com.xzsd.app.customer.rota.service;

import com.xzsd.app.customer.rota.dao.RotaDao;
import com.xzsd.app.customer.rota.entity.RotaInfoV;
import com.xzsd.app.util.AppResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author weiming
 * @date 2020-4-14
 */
@Service
public class RotaService {
    @Resource
    private RotaDao rotaDao;

    /**
     * 获取轮播图信息
     * @param
     * @return AppResponse
     */
    public AppResponse getRotaList(){
        List<RotaInfoV> rotaInfoVList = rotaDao.getRotaList();
        return AppResponse.success("查询成功",rotaInfoVList);
    }
}
