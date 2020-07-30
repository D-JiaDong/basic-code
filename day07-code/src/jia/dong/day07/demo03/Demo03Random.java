package jia.dong.day07.demo03;

import java.util.Random;
/*
* 根据int 变量n的值 来获取随机数字 范围是[1，n],可以取到1，也可以取到n
* 1,定义一个int变量n 随意赋值
* 2，使用Randon 导包 创建 使用
* 3，如果写10 那么就是0,9 然而想要的是1到10 可以发现整体加一即可*/
public class Demo03Random {
    public static void main(String[] args) {
        int n=5;
        Random r=new Random();


        for (int i = 0; i < 100; i++) {
            int result=r.nextInt(n)+1;
            System.out.print(result+" ");
        }
    }
}
