package com.styyyds.spring6.factory;

/**
 * 坦克（具体产品角色）
 */
public class Tank extends Weapon{

    @Override
    public void attack() {
        System.out.println("坦克开炮！");
    }
}
