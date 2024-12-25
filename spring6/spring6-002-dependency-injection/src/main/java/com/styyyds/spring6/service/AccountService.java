package com.styyyds.spring6.service;

import com.styyyds.spring6.dao.AccountDao;

public class AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void save(){
        accountDao.insert();
    }
}
