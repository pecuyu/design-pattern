package com.pecuyu.designpattern.TemplateMethod;

/**
 * author  pecuyu
 * date    2018/4/20
 * TODO   Base of the template
 */

public abstract class Base {
    // methods for sub class to override
    public abstract void first();

    public abstract void second();

    public abstract void third();

    // implement by itself
    public void fourth() {
        System.out.println(this.getClass().getSimpleName() + " fourth do something\n");
    }
    // ... more


    // this is template method
    public final void todo() {  // forbidden to override this method
        // make a rule to call methods above
        first();
        second();
        third();
        fourth();
        //... more
    }
}
