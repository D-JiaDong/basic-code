package jia.dong.day06.demo02;
/*
* 属性：品牌、价格、颜色
* 行为：带电话、发信息
* 对应到类当中：
* 成员变量（属性）：
*   String brand;
*   double Price
*   String color
* 成员方法
*   public void call(String who){}
*   public void sendMessage(){}*/
public class Phone {
    //成员变量
    String brand;
    double price;
    String color;

    //成员方法
    public void call(String who){
        System.out.println("给"+who+"打电话");
    }
    public void sendMessage(){
        System.out.println("群发信息");
    }
}
