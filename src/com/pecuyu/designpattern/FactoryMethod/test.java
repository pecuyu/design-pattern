package com.pecuyu.designpattern.FactoryMethod;

/**
 * author  pecuyu
 * date    2018/4/21
 * TODO   测试工厂方法模式
 * <p>
 * Define an interface for creating an object,but let subclasses decide which class to instantiate.
 * Factory Method lets a class defer instantiation to subclasses.
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。
 */

public class test {
    public static void main(String[] args) {
        AbsFactory factory = new ConcreteFactory();
        ProductA productA = factory.createProduct(ProductA.class); // create A
        System.out.println(productA.toString());

        ProductB productB = factory.createProduct(ProductB.class);// create B
        System.out.println(productB.toString());
    }
}
