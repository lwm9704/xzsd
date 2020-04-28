package com.xzsd.pc.sort.controller;

import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.pc.sort.entity.SecondSortInfo;
import com.xzsd.pc.sort.service.SecondSortService;
import com.xzsd.pc.util.AppResponse;
import com.xzsd.pc.util.AuthorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.rmi.server.ExportException;

/**
 * 二级分类增删改查
 * @author weiming
 * @date 2020-3-28
 */
@RestController
@RequestMapping("/user")
public class SecondSortController {

    private static final Logger logger = LoggerFactory.getLogger(SecondSortController.class);

    @Resource
    private SecondSortService secondSortService;

    /**
     * 二级分类列表
     * @param
     * @return AppResponse
     * @author weiming
     * @date 2020-3-28
     */
    @RequestMapping(value = "listSecondSort")
    public AppResponse listSecondSort(SecondSortInfo secondSortInfo){
        try{
            return secondSortService.listSecondSort(secondSortInfo);
        }catch (Exception e){
            logger.error("查询二级分类列表异常",e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
