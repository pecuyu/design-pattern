package com.pecuyu.designpattern.TemplateMethod;

/**
 * author  pecuyu
 * date    2018/4/20
 * TODO   SubA
 */

public class SubA extends Base {
    @Override
    public void first() {
        System.out.println(this.getClass().getSimpleName() + " first do something");
    }

    @Override
    public void second() {
        System.out.println(this.getClass().getSimpleName() + " second do something");
    }

    @Override
    public void third() {
        System.out.println(this.getClass().getSimpleName() + " third do something");
    }
}
