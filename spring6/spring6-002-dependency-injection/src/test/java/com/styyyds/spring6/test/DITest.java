package com.styyyds.spring6.test;

import com.styyyds.spring6.beans.User;
import com.styyyds.spring6.service.OrderService;
import com.styyyds.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 实现原理：
 * 通过property标签获取到属性名：userDao
 * 通过属性名推断出set方法名：setUserDao
 * 通过反射机制调用setUserDao()方法给属性赋值
 * property标签的name是属性名。
 * property标签的ref是要注入的bean对象的id。
 * (通过ref属性来完成bean的装配，这是bean最简单的一种装配方式。
 * 装配指的是：创建系统组件之间关联的动作)
 */
public class DITest {

    @Test
    public void testSetDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userServiceBean", UserService.class);
        userService.save();
    }

    @Test
    public void testConstructorDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        OrderService orderServiceBean = applicationContext.getBean("orderServiceBean", OrderService.class);
        orderServiceBean.delete();
    }
    @Test
    public void testInnerBean(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-inner-bean.xml");
        UserService userServiceBean = applicationContext.getBean("userServiceBean", UserService.class);
        userServiceBean.save();
    }
    @Test
    public void testSimpleType(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-simple-type.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        System.out.println(userBean);
    }
}
