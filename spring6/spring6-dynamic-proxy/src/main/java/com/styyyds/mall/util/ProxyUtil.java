package com.styyyds.mall.util;

import com.styyyds.mall.service.TimerInvocationHandler;

import java.lang.reflect.Proxy;


public class ProxyUtil {
    public static Object newProxyInstance(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),new TimerInvocationHandler(target));
    }
}
