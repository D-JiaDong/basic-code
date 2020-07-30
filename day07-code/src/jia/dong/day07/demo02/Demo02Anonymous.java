package jia.dong.day07.demo02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
        //普通使用对象
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();

        //匿名使用对象
//        int num=new Scanner(System.in).nextInt();
//        System.out.println("输入的是："+num);

        //使用一般写法传入参数
//        Scanner sc =new Scanner(System.in);
//        methodParam(sc);

        //使用匿名对象传参
//        methodParam(new Scanner(System.in));


       Scanner sc =methodRetuen();
        int num=sc.nextInt();
        System.out.println("输入的是："+num);
    }

    public static void methodParam(Scanner sc){
        int num=sc.nextInt();
        System.out.println("输入的是："+num);
    }

    public static Scanner methodRetuen(){
        return new Scanner(System.in);
    }
}
