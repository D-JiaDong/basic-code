package jia.dong.day09.demo07;

public class Zi extends Fu{
    public Zi(){
        super();//调用父类无参构造方法 编译器赠送
        //super(10);//调用父类重载的构造方法
        System.out.println("子类构造方法");
    }
    public void method(){
      //  super();//错误写法：只有子类构造方法 才能调用服了构造方法
    }
}
