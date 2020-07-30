package jia.dong.demo04.Calendar;

import java.util.Calendar;
import java.util.Date;

/*
* int get(int field) 返回给定日历字段的值。
* void set(int field, int value) 将给定的日历字段设置为给定的值。
* abstract void add(int field, int amount) 根据日历的规则，将指定的时间量添加或减去给定的日历字段。
* Date getTime() 返回一个 Date表示此物体 Calendar的时间值（毫秒从偏移 Epoch “）。
*
* 成员方法的参数：
*       int field:日历类的字段，可以使用Calendar静态成员变量获取
*                   public static final int MONTH=2;月
*                   public static final int DATE=5;月中某一天
*                   public static final int DAY_0F_MONTH=5;月中某一天
*                   public static final int HOUR=10;时
*                   public static final int MINUTE=12;分
*                   public static final int SECOND=13;秒
* */
public class Demo02Calendar {
    public static void main(String[] args) {
        demo04();
    }

    /*int get(int field) 返回给定日历字段的值。
    * 参数：传递自定的日历字段（YEAR,MONTH...）
    * 返回值：日历字段代表具体的值*/
    private static void demo01(){
        Calendar c=Calendar.getInstance();
        int year=c.get(Calendar.YEAR);
        System.out.println(year);

        int month=c.get(Calendar.MONTH);//西方月份0-11 东方1-12；
        System.out.println(month+1);

        int date=c.get(Calendar.DATE);
        //int date=c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);
    }

    /*void set(int field, int value) 将给定的日历字段设置为给定的值。
    * 参数：
    *       field:传递自定的日历字段（YEAR,MONTH...）
    *       value:给指定字段设置的值
    * */
    private static void demo02(){
        Calendar c=Calendar.getInstance();

        //设置年为9999
        c.set(Calendar.YEAR,9999);
        //设置月为9
        c.set(Calendar.MONTH,9);
        //设置天为9
        c.set(Calendar.DATE,9);
        //同时设置年月日 可以使用set的重载方法
        c.set(8888,9,9);


        int year=c.get(Calendar.YEAR);
        System.out.println(year);

        int month=c.get(Calendar.MONTH);//西方月份0-11 东方1-12；
        System.out.println(month+1);

        int date=c.get(Calendar.DATE);
        //int date=c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);

    }

    /*
    * abstract void add(int field, int amount) 根据日历的规则，将指定的时间量添加或减去给定的日历字段。
    * 参数：
    *       field:传递自定的日历字段（YEAR,MONTH...）
    *       amount:增加/减少指定的值
    *               正数：增加
    *               负数：减少 */
    private static void demo03(){
        Calendar c=Calendar.getInstance();

        //把年增加两年
        c.add(Calendar.YEAR,2);
        //把月增加减少三个月
        c.add(Calendar.MONTH,-3);


        int year=c.get(Calendar.YEAR);
        System.out.println(year);

        int month=c.get(Calendar.MONTH);//西方月份0-11 东方1-12；
        System.out.println(month+1);

        int date=c.get(Calendar.DATE);
        //int date=c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);
    }

    /*
    *  Date getTime() 返回一个 Date表示此物体 Calendar的时间值（毫秒从偏移 Epoch “）。
    * 把日历对象转化为日期对象*/
    private static void demo04(){
        Calendar c=Calendar.getInstance();

        Date date=c.getTime();
        System.out.println(date);
    }

}
