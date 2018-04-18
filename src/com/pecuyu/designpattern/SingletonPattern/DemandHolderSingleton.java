package com.pecuyu.designpattern.SingletonPattern;

/**
 * author  pecuyu
 * date    2018/4/18
 * TODO   单例: 使用静态Holder，保证lazy初始化，只加载一次
 */

public class DemandHolderSingleton {
    private DemandHolderSingleton() {
        // no need to initialize
    }

    public static DemandHolderSingleton getInstance() {
        return DemandHolder.sInstance;
    }

    private static class DemandHolder {  // static holder class
        private static final DemandHolderSingleton sInstance = new DemandHolderSingleton();
    }
}
