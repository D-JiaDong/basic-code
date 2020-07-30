package jia.dong.day06.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person=new Person();
        person.show();
        person.name="张三";
       // person.age=-20; //直接访问错误写法
        person.setAge(-20);
        person.show();

    }

}
