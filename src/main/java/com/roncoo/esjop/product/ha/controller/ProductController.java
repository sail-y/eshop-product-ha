package com.roncoo.esjop.product.ha.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品服务接口
 *
 * @author yangfan
 * @date 2018/03/11
 */
@RestController
public class ProductController {

    @GetMapping("/getProductInfo")
    public String getProductInfo(Long productId) {

        return "{\"id\": " + productId + ", \"name\": \"iphone7手机\", \"price\": 5599, \"pictureList\":\"a.jpg,b.jpg\", \"specification\": \"iphone7的规格\", \"service\": \"iphone7的售后服务\", \"color\": \"红色,白色,黑色\", \"size\": \"5.5\", \"shopId\": 2, \"modifiedTime\": \"2018-02-21 21:11:34\", \"cityId\": 1}";
    }


    @GetMapping("/getProductInfos")
    public String getProductInfos(String productIds) {

        System.out.println("getProductInfos接收到一次请求，productIds=" + productIds);

        JSONArray jsonArray = new JSONArray();

        for (String productId : productIds.split(",")) {
            String json = "{\"id\": " + productId + ", \"name\": \"iphone7手机\", \"price\": 5599, \"pictureList\":\"a.jpg,b.jpg\", \"specification\": \"iphone7的规格\", \"service\": \"iphone7的售后服务\", \"color\": \"红色,白色,黑色\", \"size\": \"5.5\", \"shopId\": 2, \"modifiedTime\": \"2018-02-21 21:11:34\", \"cityId\": 1}";
            jsonArray.add(JSON.parse(json));
        }

        return jsonArray.toJSONString();

    }
}
