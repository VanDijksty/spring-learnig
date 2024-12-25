package com.styyyds.spring6.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class People {
    // 一个人有多个名字
    private List<String> names;
    private Set<String> phones;
    private Map<Integer, String> addrs;
    private Properties properties;


    @Override
    public String toString() {
        return "People{" +
                "names=" + names +
                ", phones=" + phones +
                ", addrs=" + addrs +
                ", properties=" + properties +
                '}';
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setAddrs(Map<Integer, String> addrs) {
        this.addrs = addrs;
    }


    public void setPhones(Set<String> phones) {
        this.phones = phones;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

}
