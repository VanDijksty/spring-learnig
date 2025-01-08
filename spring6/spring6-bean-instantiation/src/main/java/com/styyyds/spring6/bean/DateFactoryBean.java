package com.styyyds.spring6.bean;

import org.springframework.beans.factory.FactoryBean;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFactoryBean implements FactoryBean<Date> {
    private String date;

    public DateFactoryBean(String date) {
        this.date = date;
    }

    @Override
    public Date getObject() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(this.date);
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
