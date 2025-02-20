package com.styyyds.spring6.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoForMySQL implements UserDao{
    @Override
    public void insert() {
        System.out.println("正在向mysql数据库中插入user数据");
    }
}
