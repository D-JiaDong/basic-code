package jia.dong.day09.demo14;

import java.util.ArrayList;

public class MainRedPacked {
    public static void main(String[] args) {
        Manger manger=new Manger("群主",100);
        Member one=new Member("成员A",0);
        Member two=new Member("成员B",0);
        Member three=new Member("成员C",0);

        manger.show();
        one.show();
        two.show();
        three.show();
        System.out.println("==============");

        ArrayList<Integer> redList=manger.sent(20,3);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);
        System.out.println("==============");


        manger.show();
        one.show();
        two.show();
        three.show();

    }
}
