package com.pecuyu.designpattern.FactoryMethod;

/**
 * author  pecuyu
 * date    2018/4/21
 * TODO   concrete product : ProductA
 */

public class ProductA extends AbsProduct {
    @Override
    public String whereFrom() {
        return "guangdong";
    }

    @Override
    public String description() {
        return "this is " + this.getClass().getSimpleName();
    }
}
