package com.styyyds.mall;

import com.styyyds.mall.service.OrderService;
import com.styyyds.mall.service.TimerInvocationHandler;
import com.styyyds.mall.service.impl.OrderServiceImpl;
import com.styyyds.mall.util.ProxyUtil;

import java.lang.reflect.Proxy;


public class Client {
    public static void main(String[] args) {
        // 第一步：创建目标对象
        OrderService target = new OrderServiceImpl();
        // 第二步：创建代理对象
        OrderService orderServiceProxy = (OrderService) ProxyUtil.newProxyInstance(target);
        // 第三步：调用代理对象的代理方法
        orderServiceProxy.detail();
        orderServiceProxy.modify();
        orderServiceProxy.generate();
    }
}
