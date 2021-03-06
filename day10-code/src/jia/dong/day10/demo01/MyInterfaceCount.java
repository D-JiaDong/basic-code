package jia.dong.day10.demo01;
/*
* 接口当中可以定义成员变量 但是必须使用public static final三个关键字修饰
* 从效果上看 这其实就是接口的常量
* 格式：
* public static final 数据类型 常量名称 =数据值
*
* 一旦使用final关键字进行修饰 说明不可变
*
* 1，接口当中的常量可以省略public static final 不写也照样是这样
* 2，接口当中的常量 必须进行赋值 不能不赋值
* 3，接口中常量的名称使用完全大写的字母 用下换线进行分割（推荐命名规则）*/
public interface MyInterfaceCount {
    //这其实就是一个常量 一旦赋值 不可以修改
    public static final int NUM_OF_MY_CLASS=10;

}
