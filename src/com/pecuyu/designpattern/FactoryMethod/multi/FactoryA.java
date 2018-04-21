package com.pecuyu.designpattern.FactoryMethod.multi;

import com.pecuyu.designpattern.FactoryMethod.AbsProduct;
import com.pecuyu.designpattern.FactoryMethod.ProductA;
import com.pecuyu.designpattern.FactoryMethod.ProductB;

/**
 * author  pecuyu
 * date    2018/4/21
 * TODO   FactoryA
 */

public class FactoryA extends AbsFactory {
    @Override
    public AbsProduct createProduct() {
        ProductA productA = new ProductA();
        productA.setId(this.hashCode());
        productA.setBrand("mi");
        return productA;
    }
}
