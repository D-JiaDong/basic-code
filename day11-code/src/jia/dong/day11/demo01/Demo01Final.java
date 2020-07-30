package jia.dong.day11.demo01;
/*
* final关键字代表最终的 不可改变的
* 常见的四种用法
* 1，可以用来修饰一个类
* 2，可以用来修饰一个方法
* 3，还可以用来修饰一个局部变量
* 4，还可以用来修饰一个成员变量*/
public class Demo01Final {
    public static void main(String[] args) {
        int num1=10;
        System.out.println(num1);
        num1=20;
        System.out.println(num1);

        //使用final用来修饰局部变量 那么这个变量就不能更改
        final int num2=10;
        System.out.println(num2);
//        num2=20;
//        System.out.println(num2);

//        num2=200;

        final int num3;
        num3=30;

        //对于基本类型来说 不可变说的是变量当中的数据不可改变

        //对用引用类型来说 不可变说的是变量当中的地址不可改变

        Student stu1=new Student("张三");
        System.out.println(stu1);
        System.out.println(stu1.getName());

        stu1=new Student("李四");
        System.out.println(stu1);
        System.out.println(stu1.getName());

        System.out.println("==================");

        final Student stu2=new Student("王五");
        System.out.println(stu2.getName());
//        stu2=new Student();
        stu2.setName("赵六");
        System.out.println(stu2.getName());
    }

}