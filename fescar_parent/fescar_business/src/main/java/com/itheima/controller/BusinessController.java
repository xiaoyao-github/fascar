package com.itheima.controller;

import com.itheima.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/business")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    /***
     * 购买商品分布式事务测试
     * @return
     */
    @RequestMapping(value = "/addorder")
    public String order(){
        String username="zhangsan";  //用户名
        int id=1; //商品id
        int count=5; //购物数量
        //下单
        businessService.add(username,id,count);
        return "success";
    }
}