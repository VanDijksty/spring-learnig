package com.styyyds.mall;

import com.styyyds.mall.service.OrderService;
import com.styyyds.mall.service.OrderServiceProxy;
import com.styyyds.mall.service.impl.OrderServiceImpl;

public class Client {
    public static void main(String[] args) {
        //创建目标对象
        OrderService target = new OrderServiceImpl();
        //创建代理对象
        OrderService proxy= new OrderServiceProxy(target);
        //调用代理对象的代理方法
        proxy.generate();
        proxy.detail();
        proxy.modify();
    }
}
