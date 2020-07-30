package jia.dong.day07.demo05;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.util.ArrayList;
import java.util.Random;

/*
* 题目：
* 用一个大集合存入20个随机数字 然后筛选其中的偶数元素 放到小集合当中
* 要求使用自定义的方法来实现筛选
*
* 分析：
* 1，创建一个大集合 用来存储int数字 <Integer>
* 2，随机数字就用Randon nextInt
* 3，循环二十次 把随机数放在大集合中
* 4，定义一个方法 用来筛选*/
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 20; i++) {
            int num=r.nextInt(100)+1;
            bigList.add(num);
        }
        ArrayList<Integer> samllList=getSamllList(bigList);
        System.out.println("偶数总共有多少个"+samllList.size());
        for (int i = 0; i < samllList.size(); i++) {
            System.out.println(samllList.get(i));
        }
    }
    public static ArrayList<Integer> getSamllList(ArrayList<Integer> bigList) {
        ArrayList<Integer> samllList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if (num % 2 == 0) {
                samllList.add(num);
            }
        }
        return samllList;
    }
}
