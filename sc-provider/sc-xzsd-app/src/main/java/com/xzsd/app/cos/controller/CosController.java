package com.xzsd.app.cos.controller;

import com.xzsd.app.cos.entity.MgInfo;
import com.xzsd.app.cos.service.CosService;
import com.xzsd.app.util.AppResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/Mg")
public class CosController {

    private static final Logger logger = LoggerFactory.getLogger(CosController.class);

    @Resource
    private CosService cosService;
    /**
     * 上传图片
     * @param file
     * @param
     * @return
     * @author weiming
     * @date 2020-4-13
     */
    @PostMapping("upload")
    AppResponse uploadMg(@RequestParam(value = "file") MultipartFile file, HttpSession session){
        try{
//            if(mgInfo.getFlag() == 1){
//                mgInfo.setTableName("t_sys_user");
//                mgInfo.setMainId("user_id");
//            }
//            else {
//                mgInfo.setTableName("t_comment");
//                mgInfo.setMainId("comment_id");
//            }
            return cosService.upLoadMigc(file,session);
        }catch (Exception e){
            logger.error("上传图片失败",e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 删除图片
     * @param mgInfo
     * @return
     * @author weiming
     * @date 2020-4-13
     */
}