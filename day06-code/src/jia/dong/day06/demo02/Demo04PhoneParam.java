package jia.dong.day06.demo02;

public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one=new Phone();
        one.brand="苹果";
        one.price=8388.0;
        one.color="土豪金";
        method(one);
    }
    public static void method(Phone Param){
        System.out.println(Param.brand);
        System.out.println(Param.price);
        System.out.println(Param.color);
    }
}
