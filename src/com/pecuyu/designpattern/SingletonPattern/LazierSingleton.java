package com.pecuyu.designpattern.SingletonPattern;

/**
 * author  pecuyu
 * date    2018/4/18
 * TODO   单例：懒汉模式。出于性能的考虑，可能会延迟创建，但相应的会引入多线程安全问题
 */

public class LazierSingleton {
    private static LazierSingleton sInstance = null;

    private LazierSingleton() {
        // no need to initialize
    }

    /**
     * get the static instance
     *
     * @return the only instance of LazierSingleton
     */
    public static LazierSingleton getInstance() {
        if (sInstance == null) {  // not safe under multi-thread
            sInstance = new LazierSingleton();
        }
        return sInstance;
    }
}
