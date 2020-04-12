package com.xzsd.pc.address.dao;

import com.xzsd.pc.address.entity.CityInfo;
import com.xzsd.pc.address.entity.CountyInfo;
import com.xzsd.pc.address.entity.ProvinceInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressDao {

    /**
     * 查询省列表
     */
    List<ProvinceInfo> listProvince();
    /**
     * 查询市列表
     * @param cityInfo
     */
    List<CityInfo> listCity(CityInfo cityInfo);
    /**
     * 查询区列表
     * @param countyInfo
     */
    List<CountyInfo> listCounty(CountyInfo countyInfo);

}
