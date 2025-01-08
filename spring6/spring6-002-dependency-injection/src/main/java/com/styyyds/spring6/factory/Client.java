package com.styyyds.spring6.factory;

public class Client {
    public static void main(String[] args) {
        //通过武器工厂来生产武器
        Weapon weapon1 = WeaponFactory.get("TANK");
        weapon1.attack();

        Weapon weapon2 = WeaponFactory.get("FIGHTER");
        weapon2.attack();

        Weapon weapon3 = WeaponFactory.get("DAGGER");
        weapon3.attack();
    }
    /**
     * 简单工厂模式的优点：
     *      客户端程序不需要关心对象的创建细节，
     *      需要哪个对象时，只需要向工厂索要即可，初步实现了责任的分离。
     *      客户端只负责“消费”，工厂负责“生产”。
     *      生产和消费是分离的。
     * 简单工厂模式的缺点：
     *      缺点1：工厂类集中了所有产品的创造逻辑，形成一个无所不知的全能类，有人把它叫做上帝类。
     *      显然工厂类非常关键，不能出问题，一旦出问题，整个系统瘫痪。
     *      缺点2：不符合OCP开闭原则，在进行系统扩展时，需要修改工厂类
     *
     * Spring中的BeanFactory就使用了简单工厂模式
     */
}
