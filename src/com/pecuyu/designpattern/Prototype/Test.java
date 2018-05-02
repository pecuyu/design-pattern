package com.pecuyu.designpattern.Prototype;

import java.util.ArrayList;

/**
 * author  pecuyu
 * date    2018/5/2
 * TODO   原型模式
 */

public class Test {
    public static void main(String[] args) {
        ArrayList<String> imgs = new ArrayList<>();
        imgs.add("link1");
        imgs.add("link2");
        imgs.add("link3");
        Document doc = new Document("逐梦记",
                "梦想总是要有的，万一实现了呢？", imgs);

        try {   // copy
            Document newDoc = (Document) doc.clone();
            newDoc.getImgs().add("link4");
            System.out.println(doc.toString());
            System.out.println("-----------divider-----------");
            System.out.println(newDoc.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
