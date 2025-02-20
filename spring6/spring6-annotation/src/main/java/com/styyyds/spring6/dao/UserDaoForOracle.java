package com.styyyds.spring6.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoForOracle implements UserDao{
    @Override
    public void insert() {
        System.out.println("正在向Oracle数据库插入User数据");
    }
}
