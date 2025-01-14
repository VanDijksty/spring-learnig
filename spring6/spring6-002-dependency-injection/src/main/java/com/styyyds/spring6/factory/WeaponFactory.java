package com.styyyds.spring6.factory;

/**
 * 工厂类角色
 */
public class WeaponFactory {
    /**
     * 根据不同的武器类型生产武器
     * @param weaponType
     * @return 武器对象
     */
    public static Weapon get(String weaponType){
        if(weaponType == null || weaponType.trim().length() == 0){
            return null;
        }
        Weapon weapon = null;
        if ("TANK".equals(weaponType)) {
            weapon = new Tank();
        }else if("FIGHTER".equals(weaponType)){
            weapon = new Fighter();
        }else if("DAGGER".equals(weaponType)){
            weapon = new Dagger();
        }else {
            throw new RuntimeException("不支持该武器！");
        }
        return weapon;
    }
}
