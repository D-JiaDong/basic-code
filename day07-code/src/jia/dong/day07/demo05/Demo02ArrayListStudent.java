package jia.dong.day07.demo05;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
* 题目：
* 自定义Student学生类 四个部分
*
* 1，自定义Student学生类 四个部分
* 2，创建一个集合 用来存储学生对象 泛型<Student>
* 3，根据类创建四个学生对象
* 4，将四个学生对象创建到集合当中：add
* 5，遍历集合 for size get
* */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list =new ArrayList<>();
        Student one =new Student("张三",20);
        Student two =new Student("李四",21);
        Student three =new Student("王五",22);
        Student four =new Student("赵六",23);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            System.out.println("姓名："+stu.getName()+" 年龄："+stu.getAge());
        }
    }
}
