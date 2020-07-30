package jia.dong.day10.demo02;

public interface MyInterfaceB {
    //错误写法
//    static{
//
//    }
    //错误写法
//    public MyInterface(){
//
//    }
    public abstract void methodB();
    public abstract void methodAbs();
    public default  void methodDefault(){
        System.out.println("默认方法AAA");
    }

}
