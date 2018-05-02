package com.pecuyu.designpattern.Prototype;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * author  pecuyu
 * date    2018/5/2
 * TODO
 */

public class Document implements Cloneable{  // 需要实现Cloneable接口
    private String mName;
    private String mText;
    private ArrayList<String> imgs;

    public Document(String mName, String mText, ArrayList<String> imgs) {
        this.mName = mName;
        this.mText = mText;
        this.imgs = imgs;
    }

    public String getmName() {
        return mName;
    }

    public String getmText() {
        return mText;
    }

    public ArrayList<String> getImgs() {
        return imgs;
    }

    @Override
    public String toString() {
        return "Document{" +
                "mName='" + mName + '\'' +
                ", mText='" + mText + '\'' +
                ", imgs=" + Arrays.toString(getImgsLinks()) +
                '}';
    }

    private String[] getImgsLinks() {
        String[] links = new String[imgs.size()];
        for (int i = 0; i < imgs.size(); i++) {
            links[i] = imgs.get(i);
        }

        return links;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  /// 浅拷贝
    }
}
