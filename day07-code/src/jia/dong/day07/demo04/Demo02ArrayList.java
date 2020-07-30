package jia.dong.day07.demo04;

import java.util.ArrayList;

/*
* 数组长度不可以改变
* 但是ArrayList可以随意变化
*
* 对于ArrayList来说 有一个尖括号<E>代表泛型
* 泛型：也就是装在集合当中的所有元素，全都是统一的什么类型
* 注意：泛型只能是引用类型，不能是基本类型
*
* 注意事项：
* 对于ArrayList集合来说 直接打印得到的不是地址值 而是内容
* 如果内容为空 得到的是空的中括号：[]*/
public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建了一个ArrayList集合 集合的名称是List 里边装的全都是String字符串类型的数据
        //备注：从jdk1.7开始 右侧的尖括号内部可以不写内容 但是<>本身还是要写的
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);

        //向集合当中添加一些数据 需要add方法
        list.add("张三");
        System.out.println(list);

        list.add("李四");
        list.add("王五");
        list.add("赵六");
        System.out.println(list);


//        list.add(100);//错误写法 因为创建的时候尖括号担心已经说了是字符 添加进去的元素必须都是字符串才可以
    }
}
