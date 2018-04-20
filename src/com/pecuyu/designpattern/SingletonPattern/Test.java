package com.pecuyu.designpattern.SingletonPattern;

/**
 * author  pecuyu
 * date    2018/4/20
 * TODO   测试。单例模式：保证某个类在应用中全局仅存唯一实例
 *
 * 单例类一般实现：
 *      1、私有化构造 ： 确保外部无法直接创建实例
 *      2、创建并私有化类的静态实例 ： 外部无法直接访问该静态实例
 *      3、对外部提供共有方法来获取该类的静态实例 ： 只能通过公有方法来获取类的实例
 */

public class Test {
    public static void main(String[] args) {
        DemandHolderSingleton singleton = DemandHolderSingleton.getInstance();
        System.out.println(singleton.getClass().getSimpleName());
        singleton.doSomeThing();
    }
}
