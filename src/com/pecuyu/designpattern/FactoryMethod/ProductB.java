package com.pecuyu.designpattern.FactoryMethod;

/**
 * author  pecuyu
 * date    2018/4/21
 * TODO   concrete product : ProductB
 */

public class ProductB extends AbsProduct {
    @Override
    public String whereFrom() {
        return "hubei";
    }

    @Override
    public String description() {
        return "this is " + this.getClass().getSimpleName();
    }
}
