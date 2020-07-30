package jia.dong.day10.demo01;

public class MyInterfacePrivateAImpl implements MyInterfacePrivateA {
    public void methodAnother(){
        //这样访问接口中的默认方法是错误的
        //methodCommon();
    }
}
