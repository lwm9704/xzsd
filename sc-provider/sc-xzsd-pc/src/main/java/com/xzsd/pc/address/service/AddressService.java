package com.xzsd.pc.address.service;

import com.xzsd.pc.address.dao.AddressDao;
import com.xzsd.pc.address.entity.CityInfo;
import com.xzsd.pc.address.entity.CountyInfo;
import com.xzsd.pc.address.entity.ProvinceInfo;
import com.xzsd.pc.util.AppResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AddressService {
    @Resource
    private AddressDao addressDao;
    /**
     * 查询省列表
     * @author weiming
     * @date 2020-4-11
     */
    public AppResponse listProvince(){
        List<ProvinceInfo> provinceInfoList = addressDao.listProvince();
        return AppResponse.success("查询成功",provinceInfoList);
    }
    /**
     * 查询市列表
     * @param cityInfo
     * @author weiming
     * @date 2020-4-11
     */
    public AppResponse listCity(CityInfo cityInfo){
        List<CityInfo> cityInfoList = addressDao.listCity(cityInfo);
        return AppResponse.success("查询成功",cityInfoList);
    }
    /**
     * 查询区列表
     * @param countyInfo
     * @author weiming
     * @date 2020-4-11
     */
    public AppResponse listCounty(CountyInfo countyInfo){
        List<CountyInfo> countyInfoList = addressDao.listCounty(countyInfo);
        return AppResponse.success("查询成功",countyInfoList);
    }
}
