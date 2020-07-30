package jia.dong.day11.demo08;

import red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list=new ArrayList<>();
        //随机分配 有可能多 有可能少
        //最少1分钱 最多不超过 剩下平均金额的二倍
        //第一次发红包 随机范围是0.01—6.66
        //第一次发完范围应该是0.01元-3.34元
        //此时还需要再发范围应该是0.01-3.34元

        //范围公式：1+random.nextInt(leftMoney/leftCount*2)
        Random r=new Random();//随机数生成器
        //额外定义两个变量 分别代表剩下多少钱 剩下多少份
        int leftMoney=totalMoney;
        int leftCount=totalCount;
        for (int i = 0; i < totalCount-1; i++) {
            int money=r.nextInt(leftMoney/leftCount*2)+1;
            list.add(money);
            leftCount--;
            leftMoney-=money;
        }
        list.add(leftMoney);
        return list;
    }
}
