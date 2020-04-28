package com.xzsd.app.cos.service;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.exception.CosClientException;
import com.qcloud.cos.exception.CosServiceException;
import com.qcloud.cos.http.HttpMethodName;
import com.qcloud.cos.model.GeneratePresignedUrlRequest;
import com.qcloud.cos.model.PutObjectRequest;
import com.qcloud.cos.model.PutObjectResult;
import com.qcloud.cos.region.Region;
//import com.xzsd.app.cos.dao.CosDao;
import com.xzsd.app.cos.entity.MgInfo;
import com.xzsd.app.util.AppResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
@Service
public class CosService {

    private static final String SECRETID = "AKIDiCSO4ZxjQs30wcxNRFm9Rs9AiHdiY3j9";
    private static final String SECRETKEY = "IJ4aqomUxCA6D4f7MN8dm6Bzd1g5qLZX";
    private static final String REGIONID = "ap-guangzhou";
    private static final String BUCKETNAME = "xzsdservice-1301653447";
    private static final String APPID = "1301653447";

//    @Resource
//    private CosDao cosDao;

    /**
     * 初始化CosClient
     */
    public  COSClient getCosClient() {

        // 1 初始化用户身份信息（secretId, secretKey）。
        COSCredentials cred = new BasicCOSCredentials(SECRETID, SECRETKEY);
        // 2 设置 bucket 的区域, COS 地域的简称请参照 https://cloud.tencent.com/document/product/436/6224
        // clientConfig 中包含了设置 region, https(默认 http), 超时, 代理等 set 方法, 使用可参见源码或者常见问题 Java SDK 部分。
        Region region = new Region(REGIONID);
        ClientConfig clientConfig = new ClientConfig(region);
        // 3 生成 cos 客户端。
        COSClient cosClient = new COSClient(cred, clientConfig);
        return cosClient;
    }

    /**
     * 上传文件并获取url
     */
    public AppResponse upLoadMigc(@RequestParam(value = "file") MultipartFile file, HttpSession session) {
        if(file == null){
            return AppResponse.bizError("文件为空");
        }
        //获得上传时的key
        String oldFileName = file.getOriginalFilename();
        String eName = oldFileName.substring(oldFileName.lastIndexOf("."));
        //String fileName = UUIDUtils.getUUID()+eName;
        Random random = new Random();
        String fileName = random.nextInt(1000)+eName;
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month=cal.get(Calendar.MONTH);
        int day=cal.get(Calendar.DATE);
        String key = year+"/"+month+"/"+day+"/"+ fileName ;
        //连接腾讯云
        COSClient cosClient = getCosClient();
        File localFile = null;
        try{
            localFile = File.createTempFile("temp",null);
            file.transferTo(localFile);
        }catch (Exception e){
            return AppResponse.bizError("转换异常");
        }
        //上传
        PutObjectRequest putObjectRequest = new PutObjectRequest(BUCKETNAME, key, localFile);
        try {
            PutObjectResult putObjectResult = cosClient.putObject(putObjectRequest);
        } catch (CosServiceException e) {
            e.printStackTrace();
        } catch (CosClientException e) {
            e.printStackTrace();
        }
//        mgInfo.setpKey(key);

        //获取url
        GeneratePresignedUrlRequest req = new GeneratePresignedUrlRequest(BUCKETNAME, key, HttpMethodName.GET);

        Date expirationDate = new Date(System.currentTimeMillis() + 30L * 60L * 1000L);
        req.setExpiration(expirationDate);

        URL url = cosClient.generatePresignedUrl(req);

        cosClient.shutdown();
        MgInfo mgInfo =new MgInfo();
        mgInfo.setpKey(key);
        String pUrl = url.toString();
        mgInfo.setpUrl(pUrl);
//        //更新数据库
//        int count = cosDao.uploadMg(mgInfo);
        if(pUrl == null){
            return AppResponse.bizError("上传失败");
        }
        return AppResponse.success("上传成功",mgInfo);
    }


//    /**
//     * 删除对象
//     */
//    public AppResponse deleteObject(MgInfo mgInfo){
//        //连接数据库
//        COSClient cosClient = getCosClient();
//        String key = mgInfo.getpKey();
//        //删除
//        cosClient.deleteObject(BUCKETNAME, key);
//        //修改数据库
//        int count = cosDao.deleteMg(mgInfo);
//        if(count == 0){
//            return AppResponse.bizError("更新数据库失败");
//        }
//        return AppResponse.success("图片删除成功");
//    }
}
