package jia.dong.day04.demo04;

/*
题目要求：
比较两个数据是否相同
参数类型分别为两个byte类型 两个short类型，两个int类型，两个long类型
并mian方法总进行测试。
*/
public class DemoMethodOverloadSame {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(isSame((short)a,(short)b));
        System.out.println(isSame(11,12));
        System.out.println(isSame(10L,20L));


    }
    public static boolean isSame(byte a,byte b){
        return a==b;
    }
    public static boolean isSame(short a,short b){
        return a==b ;
    }
    public static boolean isSame(long a,long b){
        return a==b;
    }

}
