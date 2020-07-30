package jia.dong.day07.demo03;

import java.util.Random;
import java.util.Scanner;

/*
* 用代码模拟猜数字小游戏
*
* 思路：
* 1，首先需要产生一个随机数字 并且一旦产生不再变化 用Randon的nexInt方法
* 2，需要键盘输入，所以用到了Scanner当中的nextInt方法
* 2，已经得到了两个数字，判断(if)一下
*      如果太大 提示太大 并且重试
*      如果太小了 提示太小 并且重试
*      如果猜中了 游戏结束
* 5，重试就是再来一次 循环次数不确定 用while(true)*/
public class Demo04RandomGame {
    public static void main(String[] args) {
        Random r=new Random();
        int randomNum=r.nextInt(100)+1;

        Scanner sc=new Scanner(System.in);
        while(true){
            int guessNum=sc.nextInt();
            if(guessNum>randomNum)
                System.out.println("猜大了");
            else if(guessNum<randomNum)
                System.out.println("猜小了");
            else {
                System.out.println("恭喜你 猜中了");
                break;
            }
        }
        System.out.println("游戏结束");
    }
}
