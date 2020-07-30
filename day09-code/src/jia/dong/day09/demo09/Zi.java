package jia.dong.day09.demo09;
/*
* this关键字用来访问本类内容
* 1，在本类成员方法中 访问本类的成员变量
* 2，在本类的成员方法中 访问本类的另一个成员方法
* 3，在本类的构造方法中 访问本类的另一个构造方法
* 在第三种用法当中 this()调用也必须是构造方法的第一个语句
* super和this两种构造调用 不能同时使用*/
public class Zi extends Fu {
    int num =20;
    public Zi(){
        //super();//不在赠送
        this(123);//super()方法会在有参方法中调用
       // this(1,2)//错误写法
    }
    public Zi(int n){

    }
    public Zi(int n,int m){

    }
    public void showNum(){
        int num=30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
    public void methodA(){
        System.out.println("aaa");
    }
    public void methodB(){
        this.methodA();
        System.out.println("bbb");
    }
}
