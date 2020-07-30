package jia.dong.day06.demo02;

public class Demo01PhoneOne {
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

    }
}
