package com.styyyds.spring6.test;

import com.styyyds.spring6.bean.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class BeanInstantiationTest {
    @Test
    public void testSimpleFactory(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Vip vip = applicationContext.getBean("vipBean", Vip.class);
        System.out.println(vip);
    }
    @Test
    public void testSelfFactoryBean(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Order orderBean = applicationContext.getBean("orderBean", Order.class);
        System.out.println(orderBean);
    }
    @Test
    public void testFactoryBean(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Person personBean = applicationContext.getBean("personBean", Person.class);
        System.out.println(personBean);

        Person personBean2 = applicationContext.getBean("personBean", Person.class);
        System.out.println(personBean2);
    }
    @Test
    public void testFactoryBean2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Date date = applicationContext.getBean("dateBean", Date.class);
        Student student = applicationContext.getBean("studentBean", Student.class);
        System.out.println(student);
    }
}
