package com.styyyds.spring6.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 封装用户信息
 */
public class User {
    //通过测试得知：spring是通过调用类的无参数构造方法来创建对象的，
    // 所以要想让spring给你创建对象，必须保证无参数构造方法是存在的。


    public User() {
        System.out.println("nihao");
    }
}
