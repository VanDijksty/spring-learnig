package com.styyyds.factory;

/**
 * 具体工厂角色
 */
public class FighterFactroy implements WeaponFactory{
    @Override
    public Weapon get() {
        return new Fighter();
    }
}
