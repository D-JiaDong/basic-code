package jia.dong.day07.demo04;
/*
* 题目：
* 定义一个数组 用来存储三个Person对象
*
* 数组有一个缺点：一旦创建 程序运行期间长度不可能发生改变*/
public class Demo01Array {
    public static void main(String[] args) {
        //首先创建一个长度为三的数组 里边用来Person类型的对象
        Person[] array=new Person[3];

        Person one=new Person("张三",20);
        Person two=new Person("李四",30);
        Person three=new Person("王五",40);

        array[0]=one;
        array[1]=two;
        array[2]=three;

        System.out.println(array[1].getName());
    }
}
