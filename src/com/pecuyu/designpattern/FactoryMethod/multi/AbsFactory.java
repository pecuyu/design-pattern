package com.pecuyu.designpattern.FactoryMethod.multi;

import com.pecuyu.designpattern.FactoryMethod.AbsProduct;

/**
 * author  pecuyu
 * date    2018/4/21
 * TODO   抽象工厂。
 */

public abstract class AbsFactory {
    // no arg,sub class needs to override it
    public abstract AbsProduct createProduct();
}
