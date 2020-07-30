package jia.dong.day11.demo08;

import red.OpenMode;

/*
* 场景说明：
*      红包发出去之后 所有人都有红包 大家抢完之后 最后一个红包留给自己
* 大多数代码都是自己的 我们需要做的就是填空题
*
* 我们要做的事情有：
* 1，设置一下程序标题 通过构造方法的字符串参数
* 2，设置群主名称
* 3，设置分发策略：平均 还是随机
*
* 红包分发的策略：
* 1，普通红包(平均)：totalMoney/totalCount 余数放在最后一个红包当中
* 2，手气红包(随机)：最少一分钱，最多不超过平均数的二倍，余额越发越少
* */
public class Bootstrap {
    public static void main(String[] args) {
        MyRed red=new MyRed("恭喜发财");
        //设置群主名称
        red.setOwnerName("张三");
//        //普通红包
//        OpenMode normal=new NormalMode();
//        red.setOpenWay(normal);
        //随机红包
        OpenMode random=new RandomMode();
        red.setOpenWay(random);
    }
}
