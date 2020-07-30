package jia.dong.demo04.Calendar;

import java.util.Calendar;

/*
* java.util.Calendar类：日历类
* Calendar类是一个抽象类 里边提供了很多操作日历字段的方法
* Calendar类无法直接创建对象使用，里边有一个静态方法叫getInstance()
* static Calendar getInstance()使用默认时区和区域设置获取日历。
*   */
public class Demo01Calendar {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c);
    }

}
