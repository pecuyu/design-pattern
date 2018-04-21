package com.pecuyu.designpattern.FactoryMethod;

/**
 * author  pecuyu
 * date    2018/4/21
 * TODO   抽象的产品
 */

public abstract class AbsProduct {
    public abstract String whereFrom();

    public abstract String description();

    @Override
    public String toString() {
        return "where:" + whereFrom() + ", description" + description();
    }
}
