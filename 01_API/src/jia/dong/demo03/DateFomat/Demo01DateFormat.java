package jia.dong.demo03.DateFomat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* java.text.DateFormat:是日期/时间格式化子类的抽象类
* 成员方法：
* 1，String format(Date date) 按照指定的模式 把Date日期，格式化为符合模式的字符串
* 2，Date parse(String source)：从给定字符串的开始解析文本以生成日期
*
*
* 注意：parse 方法声明了一个异常
* public Date parse(String source) throws ParseException
* 如果字符串构造方法的模式不一样 那么程序就会抛出异常
* 调用一个抛出了异常的方法 我们就必须处理这个异常
*   1，继续抛出这个异常
*   2，try catch 自己处理异常
*
* DateFormat类是一个抽象类 无法直接使用 可以使用他的子类
*
* java.text.SimpleDateFormat extends DateFormat
* 构造方法：
* SimpleDateFormat(String pattern) :使用给定模式 SimpleDateFormat并使用默认的 FORMAT语言环境的默认日期格式符号
* y 年
* M 月
* d 日
* H 时
* m 分
* s 秒
* "yyyy-MM-dd HH:mm:ss"
* 注意：模式中的字母不能更改 连接模式的符号可以改变
 */
public class Demo01DateFormat {
    public static void main(String[] args) throws ParseException {
     demo02();
    }
    /*format() 把日期格式化为文本*/
    public static void demo01(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date=new Date();
        String d=sdf.format(date);
        System.out.println(date);//Wed May 06 21:05:23 GMT+08:00 2020
        System.out.println(d);//2020年05月06日 21时05分23秒
    }
    /*parse()解析文本为data日期*/
    public static void demo02() throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = sdf.parse("2088年08月08日 15时51分54秒");
        System.out.println(date);//Sun Aug 08 15:51:54 GMT+08:00 2088
    }
}
