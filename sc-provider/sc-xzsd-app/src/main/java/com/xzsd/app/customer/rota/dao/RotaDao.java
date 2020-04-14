package com.xzsd.app.customer.rota.dao;

import com.xzsd.app.customer.rota.entity.RotaInfoV;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author weiming
 * @date 2020-4-14
 */
@Mapper
public interface RotaDao {
    /**
     * 获取轮播图信息
     * @param num 展示轮播图数量
     * @return listRota
     */
    List<RotaInfoV> getRotaList(int num);
}
