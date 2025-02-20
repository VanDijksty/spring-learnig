package com.styyyds.spring6.test;

import com.styyyds.spring6.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleTest {
    @Test
    public void testLifeCycle(){
        ApplicationContext applicationcontext = new ClassPathXmlApplicationContext("spring.xml");
        User userBean = applicationcontext.getBean("userBean", User.class);
        System.out.println("8.使用Bean");

        //只有正常关闭spring容器才会执行销毁方法
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationcontext;
        context.close();
    }
}
