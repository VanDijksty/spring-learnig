package com.styyyds.spring6.test;

import com.styyyds.spring6.bean.User;
import com.styyyds.spring6.bean.Vip;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class RegisterBeanTest {
    @Test
    public void testBeanRegister(){
        Vip vip = new Vip();
        System.out.println(vip);

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        factory.registerSingleton("vipBean", vip);
        Vip vipBean = factory.getBean("vipBean", Vip.class);
        System.out.println(vipBean);
    }
}
