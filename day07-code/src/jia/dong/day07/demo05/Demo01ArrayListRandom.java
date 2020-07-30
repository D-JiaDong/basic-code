package jia.dong.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/*
* 题目：
* 生成六个1～33之间的随机数 添加到集合 并遍历集合
*
* 思路：
* 1，需要存储六个数字 创建一个集合 <Integer>
* 2，产生数字 需要Randon
* 3，用循环六次 来产生六个随机数字：for循环
* 4，循环内调用人r.nextInt(n),参数是33,0到23 整体加一
* 5，把数字添加到集合中 add
* 6，便理解和：for size get*/
public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 6; i++) {
            int num=r.nextInt(33)+1;
            list.add(num);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
