package jia.dong.day09.demo14;

import java.util.ArrayList;
//群主类
public class Manger extends User {
    public Manger(){
    }

    public Manger(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> sent(int totalMoney,int count){
        ArrayList<Integer> redList=new ArrayList<>();
        int leftMoney=super.getMoney();//群主当前余额
        if (leftMoney<totalMoney){
            System.out.println("余额不足");
            return redList;
        }
        //扣钱
        super.setMoney(leftMoney-totalMoney);
        //发红包 需要平均拆分为count份
        int avg=totalMoney/count;
        int mod=totalMoney%count;
        //剩下的零头抱在最后的红包当中
        //下面把这个红包一个一个放在集合当中
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }
        //最后一个红包
        int last=avg+mod;
        redList.add(last);
        return redList;
    }
}
