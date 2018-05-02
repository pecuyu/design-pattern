package com.pecuyu.designpattern.Prototype;

import java.util.ArrayList;

/**
 * author  pecuyu
 * date    2018/5/2
 * TODO   原型模式（Prototype Pattern）
 *
 * Specify the kinds of objects to create using a prototypical instance,
 * and create new objects by copying this prototype.
 * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 *
 *
 * 使用Java的java.lang.Object方法里提供的克隆方法clone（）方法需满足以下条件及注意事项：
 * 1.要实现克隆，必须实现java.lang.Cloneable接口，否则在运行时调用 clone（）方法，会抛出CloneNotSupportedException异常。
 * 2.返回的是Object类型的对象，所以使用时可能需要强制类型转换。
 * 3.该方法是protected的，如果想让外部对象使用它，必须在子类重写该方法。
 * 4.Object的clone（）方法的复制是采用逐字节的方式从内存复制数据，复制了属性的引用，而属性所指向的对象本身没有被复制，
 *   因此所复制的引用指向了相同的对象。即，默认为浅拷贝
 *
 *原型模式的优点
    ●  性能优良
         原型模式是在内存二进制流的拷贝，要比直接new一个对象性能好很多，特别是要在一个循环体内产生大量的对象时，
        原型模式可以更好地体现其优点。
    ● 逃避构造函数的约束
        这既是它的优点也是缺点，直接在内存中拷贝，构造函数是不会执行的。
        优点就是减少了约束，缺点也是减少了约束。
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
            newDoc.getImgs().add("link4"); // 修改imgs
            System.out.println(doc.toString());
            System.out.println("-----------divider-----------");
            System.out.println(newDoc.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
