package com.pecuyu.designpattern.FactoryMethod;

/**
 * author  pecuyu
 * date    2018/4/21
 * TODO   抽象工厂
 */

public abstract class AbsFactory {
    public abstract <T extends AbsProduct> T createProduct(Class<T> clazz);
}
