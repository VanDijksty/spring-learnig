package com.styyyds.spring6.factory;

/**
 * 匕首（具体产品角色）
 */
public class Dagger extends Weapon{
    @Override
    public void attack() {
        System.out.println("砍他丫的!");
    }
}
