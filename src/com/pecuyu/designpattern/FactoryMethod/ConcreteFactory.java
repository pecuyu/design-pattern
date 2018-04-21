package com.pecuyu.designpattern.FactoryMethod;

/**
 * author  pecuyu
 * date    2018/4/21
 * TODO   concrete factory
 */

public class ConcreteFactory extends AbsFactory {
    @Override
    public <T extends AbsProduct> T createProduct(Class<T> clazz) {
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
