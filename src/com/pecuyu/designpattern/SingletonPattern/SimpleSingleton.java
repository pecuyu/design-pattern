package com.pecuyu.designpattern.SingletonPattern;

/**
 * author  pecuyu
 * date    2018/4/18
 * TODO   简单单例：饿汉模式
 */

public class SimpleSingleton {
    private static SimpleSingleton sInstance = new SimpleSingleton();

    private SimpleSingleton() {
        // no need to initialize
    }

    /**
     * get the  static instance
     *
     * @return the only instance of SimpleSingleton
     */
    public static SimpleSingleton getInstance() {
        return sInstance;
    }
}
