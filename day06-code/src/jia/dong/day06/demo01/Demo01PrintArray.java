package jia.dong.day06.demo01;

import com.sun.deploy.security.SelectableSecurityManager;
import sun.font.DelegatingShape;

import java.util.Arrays;

/*
* 面向过程，当需要实现一个功能的时候 为一个具体的步骤都要亲力亲为 详细处理每一个细节
* 面向对象 当需要实现一个功能的时候 不关心具体的步骤 而是找一个已经具有该功能的人 来帮我做事
* 类是对一类事物的描述，是抽象的
* 对象是一类事物的实例 ，是具体的
* 类是对象的模板，对象是类的实体
* */
public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
        //要求打印格式：[10,20,30,40,50]
        //使用面向过程
        //每一个步骤都要亲力亲为
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1) {
                System.out.print(array[i]);
            }
            else{
                System.out.print(array[i]+", ");
            }
        }
        System.out.println("]");
        System.out.println("==========================");
        //使用面向对象
        //找一个jdk给我们提供好的Arrays类
        //其中有一个toString方法

        System.out.println(Arrays.toString(array));
    }
}
