package com.styyyds.spring6.service;

import com.styyyds.spring6.dao.OrderDao;
import com.styyyds.spring6.dao.UserDao;

public class OrderService {
    private OrderDao orderDao;
    private UserDao userDao;

    public OrderService(OrderDao orderDao, UserDao userDao) {
        this.orderDao = orderDao;
        this.userDao = userDao;
    }


    public void delete(){
        orderDao.deleteById();
        userDao.insert();
    }
}
