package com.styyyds.spring6.test;

import com.styyyds.spring6.bean.Husband;
import com.styyyds.spring6.bean.Wife;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircularDependencyTest {
    @Test
    public void testSingletonAndSet(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Husband husbandBean = applicationContext.getBean("husbandBean", Husband.class);
        Wife wifeBean = applicationContext.getBean("wifeBean", Wife.class);
        System.out.println(husbandBean);
        System.out.println(wifeBean);
    }

    @Test
    public void testSingletonAndConstructor(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
        Husband hBean = applicationContext.getBean("hBean", Husband.class);
        Wife wBean = applicationContext.getBean("wBean", Wife.class);
        System.out.println(hBean);
        System.out.println(wBean);
    }
}
