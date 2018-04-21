package com.pecuyu.designpattern.FactoryMethod.multi;

import com.pecuyu.designpattern.FactoryMethod.AbsProduct;
import com.pecuyu.designpattern.FactoryMethod.ProductB;

/**
 * author  pecuyu
 * date    2018/4/21
 * TODO   FactoryB
 */

public class FactoryB extends AbsFactory {
    @Override
    public AbsProduct createProduct() {
        ProductB productB = new ProductB();
        productB.setId(this.hashCode());
        productB.setBrand("hw");
        return productB;
    }
}
