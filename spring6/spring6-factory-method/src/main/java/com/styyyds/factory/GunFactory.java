package com.styyyds.factory;

/**
 * 具体工厂角色
 */
public class GunFactory implements WeaponFactory{
    @Override
    public Weapon get() {
        return new Gun();
    }
}
