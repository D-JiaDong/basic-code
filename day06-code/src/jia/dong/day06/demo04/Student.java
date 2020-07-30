package jia.dong.day06.demo04;
/*
* 构造方法是专门用来创建对象的方法 当我们通过new来创建对象是 其实就是在调用构造方法
* 格式
* public 类名称(参数类型 参数名称){
*       方法体
* }
*
* 注意事项
* 1，构造方法的名称必须和所在诶的名称完全一样 大小写也一致
* 2，构造方法不要写返回值类型 连void都不用写
* 3，构造方法不能return一个具体数值作为返回值
* 4，如果没有编写任何构造方法 那么编译器将会默认一个构造方法 没有参数 方法体什么都不做
* public Student() {}
* 5，一旦编写了至少一个构造方法 那么编译器将不再赠送
* 6，构造犯法也是可以重载的*/
public class Student {
    private String name;
    private int age;
    //无参构造方法
    public Student(){
        System.out.println("无参构造方法执行了");
    }
    //有参构造方法
    public Student(String name,int age){
       System.out.println("有参构造方法执行了");
       this.name=name;
       this.age=age;
    }


    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }


    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

}