package com.pecuyu.designpattern.SingletonPattern;

/**
 * author  pecuyu
 * date    2018/4/18
 * TODO   单例：两次检查。将同步加在合适的位置上，由于Java平台的内存模式容许out-of-order writes，因此需要在此check
 */

public class DoubleCheckSingleton {
    //使用volatile，保证其他线程可以同步获取最新值
    private static volatile DoubleCheckSingleton sInstance = null;

    private DoubleCheckSingleton() {
        // no need to initialize
    }

    public static DoubleCheckSingleton getInstance() {
        if (sInstance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (sInstance == null) {   // need check again
                    sInstance = new DoubleCheckSingleton();
                }
            }
        }
        return sInstance;
    }
}
