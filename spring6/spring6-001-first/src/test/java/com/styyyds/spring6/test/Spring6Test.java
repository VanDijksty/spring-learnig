package com.styyyds.spring6.test;

import com.styyyds.spring6.bean.User;
import com.styyyds.spring6.bean.Vip;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring6Test {
    @Test
    public void testFirst(){
        // 初始化Spring容器上下文（解析beans.xml文件，创建所有的bean对象）
        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
        Object userBean = app.getBean("userBean");
        Object vipBean = app.getBean("vipBean");
        Object dateBean = app.getBean("dateBean");
        User userBean1 = app.getBean("userBean", User.class);
        System.out.println(userBean);
        System.out.println(vipBean);
        System.out.println(dateBean);
        System.out.println(userBean1);
        Logger logger = LoggerFactory.getLogger(User.class);
        logger.info("我是一条日志消息");
    }
}
