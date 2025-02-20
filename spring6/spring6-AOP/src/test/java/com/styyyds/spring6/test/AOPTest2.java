package com.styyyds.spring6.test;

import com.styyyds.spring6.biz.AccountService;
import com.styyyds.spring6.biz.OrderService;
import com.styyyds.spring6.biz.ProductService;
import com.styyyds.spring6.biz.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest2 {
    @Test
    public void test(){
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("spring.xml");
        OrderService orderService = applicationContext.getBean("orderService",OrderService.class);
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        orderService.generate();
        orderService.cancel();
        accountService.transfer();
        accountService.withdraw();
    }
    @Test
    public void testSecurity(){
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        ProductService productService = applicationContext.getBean("productService", ProductService.class);
        userService.getUser();
        userService.saveUser();
        userService.deleteUser();
        userService.modifyUser();
        productService.getProduct();
        productService.saveProduct();
        productService.deleteProduct();
        productService.modifyProduct();
    }
}
