package com.pecuyu.designpattern.FactoryMethod;

/**
 * author  pecuyu
 * date    2018/4/21
 * TODO   抽象的产品
 */

public abstract class AbsProduct {
    private int id;
    private String brand;

    public abstract String whereFrom();

    public abstract String description();

    @Override
    public String toString() {
        return "id:" + this.id + " , brand:" + this.brand +
                "where:" + whereFrom() + ", description" + description();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
