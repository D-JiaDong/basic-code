package jia.dong.day08.demo03;

import javax.sound.midi.Soundbank;

public class MyClass {
    int num;//成员变量
    static int numStatic;
    public void method(){
        System.out.println("这是一个普通的成员方法");
        System.out.println(num);
        System.out.println(numStatic);
    }

    public static void methodStatic(){
        System.out.println("这是一个静态方法");
        System.out.println(numStatic);
        //System.out.println(num);//静态不能访问非静态
    }
}
