package jia.dong.Object;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
* Java.lang.Object
* 类Object是所有类的超（父）类
* 所有对象（包括数组）都实现这个类的方法*/
public class Demo01ToString {
    public static void main(String[] args) {
        /*
        * Person类默认继承了Object类 所以可以使用toString方法
        * */
        Person p=new Person("张三",20);
        String s=p.toString();
        System.out.println(s);

        //直接打印对象的名字 其实就是嗲用对象的toString
        System.out.println(p);
        //看一个类是否重写了toString
        //直接打印这个类的对象即可
        // 如果没有重写toString打印的是地址值
        Random r=new Random();
        System.out.println(r);

        Scanner sc=new Scanner(System.in);
        System.out.println(sc);

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.toString();
        System.out.println(list);

    }
}
