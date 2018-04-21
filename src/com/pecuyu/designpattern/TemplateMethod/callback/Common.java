package com.pecuyu.designpattern.TemplateMethod.callback;

/**
 * author  pecuyu
 * date    2018/4/21
 * TODO   使用回调。
 *        模板方法模式（Template Method）提取了公共代码，避免了代码冗余，封装了执行的步骤规则，子类只需关注相关方法的实现即可。
 *        但是，过多使用模板方法模式，可能会引起子类的泛滥，因此可以适时的使用回调来进行优化
 */

public class Common {
    private Utils utils;

    public Common() {
        utils = new Utils();
    }

    public void todo(Callback callback) {
        if (!utils.checkAccess()) {
            return;
        }

        // do your work
        System.out.println("working");
        utils.writeLog();

        callback.onCall();
    }
}
