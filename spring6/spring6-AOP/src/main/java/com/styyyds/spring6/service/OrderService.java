package com.styyyds.spring6.service;


import org.springframework.stereotype.Component;

//目标类
@Component
public class OrderService {
    public void generate(){
        System.out.println("订单已生成！");

    }
}
