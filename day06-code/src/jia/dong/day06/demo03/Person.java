package jia.dong.day06.demo03;
/*
* 问题描述：定义Person的年龄时，无法阻止不合理的树枝被设置进来
* 解决方法：用private关键字将需要保护的成员变量进行修饰
*
* 一旦使用了private进行修饰，那么本类当中任然可以随意访问
* 但是 超出了本类范围之外就不能直接访问了
*
* 间接访问private成员变量 就是定义一对二Getter/Setter方法
*
* 必须叫setXxx或者getXxx命名规则
* 对于Getter来说，不能有参数 返回类型和成员变量对应
* 对于Setter来说，不能有返回值 参数数类型和成员变量对应*/
public class Person {
    String name;
    private int age;

    public void show(){
        System.out.println("我叫："+name+"，年龄："+age);
    }
    //设置数据  必须有参数 无返回
    public void setAge(int num){
        if(num<100&&num>=0)
            age=num;
        else
            System.out.println("数据不合理");
    }
    //这个成员方法 获取数据 必须没有参数 有返回
    public int getAge(){
        return age;
    }
}
