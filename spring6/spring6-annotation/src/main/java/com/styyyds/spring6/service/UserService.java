package com.styyyds.spring6.service;

import com.styyyds.spring6.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired//在属性上注入
    @Qualifier("userDaoForOracle")
    private UserDao userDao;

    public void save(){
        userDao.insert();
    }
}
