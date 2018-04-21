package com.pecuyu.designpattern.TemplateMethod.callback;

/**
 * author  pecuyu
 * date    2018/4/21
 * TODO
 */

public class Utils {

    public boolean checkAccess() {
        System.out.println("check access");
        return true;
    }

    public void writeLog() {
        System.out.println("write log");
    }
}
