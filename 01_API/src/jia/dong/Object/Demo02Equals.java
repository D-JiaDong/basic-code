package jia.dong.Object;

import java.util.ArrayList;

public class Demo02Equals {
    public static void main(String[] args) {
        /*
        * Person类默认继承了Object类 所以可以使用Object类的equals方法
        * equals方法源码
        * public boolean equals(Object obj) {
        *          return (this == obj);
        * }
        * 参数：Object可以传递任意对象
        *               ==比较运算符 返回的是一个布尔值 true false
        *               基本数据类型：比较的是值
        *               引用数据类型：比较的是两个对象的地址值
        *       this是谁 那个对象调用的方法 方法中的this就是那个对象 */
        Person p1=new Person("张三",20);
        Person p2=new Person("李四",19);
        System.out.println(p1);
        System.out.println(p2);
        boolean b=p1.equals(p2);
        System.out.println(b);


        p1=p2;
        b=p1.equals(p2);
        System.out.println(b);

        ArrayList<String> list=new ArrayList<>();
        b=p1.equals(list);
        System.out.println(b);

    }
}
