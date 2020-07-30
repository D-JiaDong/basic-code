package jia.dong.day10.demo03;
/*
* 这个字接口当中有几个方法：四个
* methodA methodB methodCommon method*/
public interface MyInterface extends MyInterfaceA,MyInterfaceB {
    public abstract void method();

    @Override
    default void methodDefault() {
        System.out.println("CCC");
    }
}
