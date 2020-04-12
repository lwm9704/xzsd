package com.xzsd.pc.util;


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

import java.io.File;
import java.net.URL;
import java.util.Date;
import java.util.Random;

public class CosClientUtil {

    private static final String SECRETID = "AKIDiCSO4ZxjQs30wcxNRFm9Rs9AiHdiY3j9";
    private static final String SECRETKEY = "IJ4aqomUxCA6D4f7MN8dm6Bzd1g5qLZX";
    private static final String REGIONID = "ap-guangzhou";
    private static final String BUCKETNAME = "xzsdservice-1301653447";
    private static final String APPID = "1301653447";

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
     * 上传文件
     */
    public String upLoadMigc(String localFilePath) {

        File localFile = new File(localFilePath);
        COSClient cosClient = getCosClient();
        String[] file = localFilePath.split("\\\\");
        String fileName = file[file.length - 1];
        int i = file.length-1;
        System.out.println(file[i]);
        Random random = new Random();
        String key = random.nextInt(100) + System.currentTimeMillis() + fileName;
        PutObjectRequest putObjectRequest = new PutObjectRequest(BUCKETNAME, key, localFile);

        try {
            PutObjectResult putObjectResult = cosClient.putObject(putObjectRequest);
        } catch (CosServiceException e) {
            e.printStackTrace();
        } catch (CosClientException e) {
            e.printStackTrace();
        }
        cosClient.shutdown();
        return key;
    }

    /**
     *获取URL
     * @param
     */
    public String getMgUrl(String key){

        COSClient cosClient = getCosClient();
        GeneratePresignedUrlRequest req = new GeneratePresignedUrlRequest(BUCKETNAME, key, HttpMethodName.GET);

        Date expirationDate = new Date(System.currentTimeMillis() + 30L * 60L * 1000L);
        req.setExpiration(expirationDate);

        URL url = cosClient.generatePresignedUrl(req);
        cosClient.shutdown();

        return url.toString();
    }

    /**
     * 删除对象
     */
    public void deleteObject(String key){
        COSClient cosClient = getCosClient();
        cosClient.deleteObject(BUCKETNAME, key);
    }
}