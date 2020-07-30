package jia.dong.Object;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    /*
    * Object类的equals方法 默认比较连个对象的地址值 没有意义
    * 所以我们要重写equals方法 比较两个对象的属性（name age）
    * 问题：隐含一个多态
    *       多态的弊端 无法使用子类特有方法 向下转型
    * */


  /*  @Override
    public boolean equals(Object obj){
        //增加一个判断 传递的参数obj如果是null
        if(obj==this) {return true;}
        if(obj==null) {return false;}
        if(obj instanceof Person) {
            Person p=(Person)obj;
            //比较两个对象的属性
            boolean b=this.name.equals(p.name)&&this.age==p.age;
            return b;
        }
        return false;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //getClass() != o.getClass()使用反射技术 判断o是否为Person类型 等效于 obj interfaceof Person
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
