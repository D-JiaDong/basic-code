package jia.dong.day06.demo01;
/*
* 通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用
*
* 1，导包，也就是指出需要使用的类，在什么位置
* import 包名称. 类名称;
* import jia.dong.day06.demo01.Student
*
* 2,创建格式：
* 类名称 对象名 =new 类名称()
* Student stu=new Student();
*
* 3,使用，分为两种情况
* 使用成员变量：对象名.成员变量名
* 使用成员方法：对姓名.成员方法名(参数)
* （也就是想用谁就用对象名点儿谁）
*
* 注意事项：
* 若果成员变量没有进行赋值，那么将会有一个默认值 规则和数组一样
*                  整数：　　０
　　　　　　浮点数：　０.０
　　　　　　布尔：　　false
　　　　　　引用类型：null*/
public class Demo02Student {
    public static void main(String[] args) {
        //同意包下 省略导包

        //创建
        Student stu=new Student();

        //访问成员变量
        System.out.println(stu.name);//应用类型 默认null
        System.out.println(stu.age);

        //成员变量赋值
        System.out.println("====================");
        stu.name="张三";
        stu.age=20;
        System.out.println(stu.name);//应用类型 默认null
        System.out.println(stu.age);

        //调用成员方法
        stu.eat();
        stu.sleep();
        stu.study();
    }
}
