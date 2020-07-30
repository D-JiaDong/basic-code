package jia.dong.demo02.Date;


import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo03();
    }
    /*
    * Long getTime() 把日期转换为毫秒值 （相当于 System.currentTimeMillis()方法）
    * 返回1970年1月1日 00:00:00 GMT以来此 Date对象表示的毫秒值*/
    public static void demo03(){
        Date date=new Date();
        Long time=date.getTime();
        System.out.println(time);
        System.out.println(System.currentTimeMillis());
    }
    public static void demo02(){
        //带参构造 Date（long Data）:传递毫秒值 将毫秒值转换为Data日期
        Date date=new Date(0L);
        System.out.println(date);

    }
    public static void demo01(){
        //无参构造
        Date date=new Date();
        //输出当前时间
        System.out.println(date);
    }

}
