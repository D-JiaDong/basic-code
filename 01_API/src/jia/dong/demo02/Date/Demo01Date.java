package jia.dong.demo02.Date;
/*
* java.util.Date:表示日期和时间类
* 类：Date表示特定的瞬间 精确到毫秒
* 毫秒：千分之一秒
* 特定瞬间：一个时间点，一刹那时间
* 2020-05-06 17:06:33:333
* 毫秒值的作用 可以对时间和日期进行计算
* 2009-01-03到2088-01-01中间一共有多少天
*
* 可以日期转换为毫秒
*  当前的日期：2088-01-01
*  时间原点：1970年1月1日 00:00:000
*  就是计算当前日期到日期时间原点之间一共经历了多少毫秒
*
* 注意：中国属于东八区 会把时间增加八个小时
**/
public class Demo01Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
    }
}
