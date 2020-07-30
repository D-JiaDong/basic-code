package jia.dong.day07.demo03;
/*
* Random类用来生成随机数字
* 导包
* 创建
* 使用
* 获取一个随机的int数字(范围是int所有的范围 由正负两种);int num=r,nextInt()
* 获取一个随机的int数字(参数代表了范围 左闭右开区间)：int num=r.nexInt(3)
* 实际上代表的含义是[0,3) 也就是0到2*/
import java.util.Random;
public class Demo01Random {
    public static void main(String[] args) {
        Random r =new Random();

        int num=r.nextInt();
        System.out.println("随机数是："+num);
    }
}
