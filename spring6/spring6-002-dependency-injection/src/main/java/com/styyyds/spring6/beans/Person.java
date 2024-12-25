package com.styyyds.spring6.beans;

import java.util.Arrays;

public class Person {
    private String[] favariteFoods;

    @Override
    public String toString() {
        return "Person{" +
                "favariteFoods=" + Arrays.toString(favariteFoods) +
                '}';
    }

    public void setFavariteFoods(String[] favariteFoods) {
        this.favariteFoods = favariteFoods;
    }
}
