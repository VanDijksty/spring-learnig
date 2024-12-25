package com.styyyds.spring6.beans;

public class Student {
    private String name;
    private Clazz clazz;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", clazz=" + clazz +
                '}';
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Student(Clazz clazz, String name) {
        this.clazz = clazz;
        this.name = name;
    }

    public Student() {
    }
}
