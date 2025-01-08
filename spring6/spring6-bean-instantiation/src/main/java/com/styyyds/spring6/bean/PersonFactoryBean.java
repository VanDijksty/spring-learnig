package com.styyyds.spring6.bean;

import org.springframework.beans.factory.FactoryBean;

public class PersonFactoryBean implements FactoryBean<Person> {
    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public Person getObject() throws Exception {
        return new Person();
    }
}
