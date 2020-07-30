package jia.dong.day11.demo08;

import red.RedPacketFrame;

public class MyRed extends RedPacketFrame {
    public Object setopenway;

    /**
     * 构造方法：生成红包界面。
     *
     * @param title 界面的标题
     */
    public MyRed(String title) {
        super(title);
    }
}
