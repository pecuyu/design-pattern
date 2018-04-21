package com.pecuyu.designpattern.FactoryMethod.simple;

import com.pecuyu.designpattern.FactoryMethod.AbsFactory;
import com.pecuyu.designpattern.FactoryMethod.AbsProduct;

/**
 * author  pecuyu
 * date    2018/4/21
 * TODO   退化为简单工厂。功能简单时，可以使用静态方法来替代
 */

public class ProductFactory {

    public static <T extends AbsProduct> T createProduct(Class<T> clazz) {
        if (clazz == null) {
            throw new NullPointerException("class should not be null");
        }
        try {
            return (T) Class.forName(clazz.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
