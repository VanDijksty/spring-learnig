package com.styyyds.spring6.beans;

public class User {
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }
}
