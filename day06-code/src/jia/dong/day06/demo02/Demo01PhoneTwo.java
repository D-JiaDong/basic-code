package jia.dong.day06.demo02;

public class Demo01PhoneTwo {
    public static void main(String[] args) {
        //创建Pheone类对象   堆中出现成员变量 和成员方法的地址值
        Phone one =new Phone();
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        System.out.println("====================");
        one.brand="苹果";
        one.price=8388.0;
        one.color="黑色";
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        System.out.println("====================");
        one.call("乔布斯");
        one.sendMessage();

        System.out.println("====================");

        Phone Two =new Phone();
        System.out.println(Two.brand);
        System.out.println(Two.color);
        System.out.println(Two.price);
        System.out.println("====================");
        Two.brand="三星";
        Two.price=5999.0;
        Two.color="蓝色";
        System.out.println(Two.brand);
        System.out.println(Two.color);
        System.out.println(Two.price);
        System.out.println("====================");
        Two.call("欧巴");
        Two.sendMessage();

    }
}
