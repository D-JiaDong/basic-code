package jia.dong.day04.demo02;

/*
题目要求：定义一个方法，用来求出两个数字之和。
题目变形：方法自己打印结果

ps:无返回值方法只能单独调用
*/
public class Demo04MethodReturn {
    public static void main(String[] args) {
        int num=getSum(10,20);
        System.out.println("返回值是："+num);
        System.out.println("============");
        printSum(100,200);
    }
    public static int getSum(int a,int b){
        int result=a+b;
        return result;
    }
    public static void printSum(int a,int b) {
        int result = a + b;
        System.out.println("结果是：" + result);
    }
}
