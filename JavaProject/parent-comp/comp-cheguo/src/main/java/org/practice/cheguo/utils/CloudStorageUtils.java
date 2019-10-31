package org.practice.cheguo.utils;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.ObjectListing;

import java.util.List;

/**
 * @author yoong
 * @version 1.0
 * @description 云存储客户端
 * @date 2018年3月30日
 */
public class CloudStorageUtils {

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        try {
            getBucket();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * GetBucket
     * https://helpcdn.aliyun.com/document_detail/31965.html?spm=a2c4g.11186623.6.1449.7c87f339oqRre6
     */
    public static void getBucket() {
        //ZHONGAN_IMAGE_DOMAIN=http://img.fincs.net/
        //CHEGUO_IMAGE_DOMAIN=http://img.fincs.net/
        //NODE_HANGZHOU=.oss-cn-hangzhou.aliyuncs.com
        //NODE_HANGZHOU_INTERNAL=.oss-cn-hzjbp-b-internal.aliyuncs.com
        //Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "http://img.fincs.net";
        // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
        String accessKeyId = "LTAIKfZeGPS1105h";
        String accessKeySecret = "IYfUXTbwn8HEoa8ad23ixhUxfTFaT5";
        String bucketName = "test-za";
        String KeyPrefix = "00e4a38d-8d7d-f20d-4cbb-0b93bf1ed936image";

        //创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        //列举文件。 如果不设置KeyPrefix，则列举存储空间下所有的文件。KeyPrefix，则列举包含指定前缀的文件。
        ObjectListing objectListing = ossClient.listObjects(bucketName, KeyPrefix);
        List<com.aliyun.oss.model.OSSObjectSummary> sums = objectListing.getObjectSummaries();
        for (com.aliyun.oss.model.OSSObjectSummary s : sums) {
            System.out.println("\t" + s.getKey());
        }
        //关闭OSSClient。
        ossClient.shutdown();
    }
}