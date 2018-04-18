package com.pecuyu.designpattern.SingletonPattern;

/**
 * author  pecuyu
 * date    2018/4/18
 * TODO   单例：对懒汉模式进一步加强，增加同步。此synchronized加在方法上，会导致性能损失
 */

public class SyncSingleton {
    private static SyncSingleton sInstance = null;

    private SyncSingleton() {
        // no need to initialize
    }

    /**
     * get the static instance
     *
     * @return the only instance of SyncSingleton
     */
    public static synchronized SyncSingleton getInstance() {   // low efficiency
        if (sInstance == null) {  // not safe under multi-thread
            sInstance = new SyncSingleton();
        }
        return sInstance;
    }

}
