package com.pecuyu.designpattern.TemplateMethod;

import com.pecuyu.designpattern.TemplateMethod.callback.Callback;
import com.pecuyu.designpattern.TemplateMethod.callback.Common;

/**
 * author  pecuyu
 * date    2018/4/20
 * TODO   模板方法。
 *        在基类中，模板方法定义了一系列算法封装或执行步骤，子类可以去复写其中某些方法，
 *        但不能改变这些方法的执行顺序(规则)
 *
 * Define the skeleton of an algorithm in an operation, deferring some steps to subclasses.
 * Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
 * 定义在一个操作中的一个算法框架，把一些步骤推迟到子类去实现。
 * 模板方法模式让子类不需要改变算法结构而重新定义特定的算法步骤。
 */

public class test {
    public static void main(String[] args) {
        SubA a = new SubA(); // create sub class
        a.todo();

        SubB b = new SubB();
        b.todo();

        useCallback();
    }

    public static void useCallback() {
        Common common = new Common();
        common.todo(new Callback() {
            @Override
            public void onCall() {
                System.out.println("some work when call back");
            }
        });
    }
}
