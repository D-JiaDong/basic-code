package jia.dong.day10.demo01;
/*
* 1,接口的默认方法 可以通过接口实现类对象 直接调用
* 2，接口的默认的方法 也可以被接口实现类进行覆盖重写*/
public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a=new MyInterfaceDefaultA();
        a.methodAbs();
        //调用默认方法 如果实现类没有会向上找默认方法
        a.methodDefault();

        MyInterfaceDefaultB b=new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();
    }
}
