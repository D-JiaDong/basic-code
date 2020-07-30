package jia.dong.day10.demo05;
/*
 * 在多态的代码中 成员方法的访问规则是
 * 看 new的是谁 就优先用谁 没有则向上找
 *
 * 口诀：编译看左边 运行看右边*/
public class Demo02MultiMethod {
    public static void main(String[] args) {
        Fu obj=new Zi();

        obj.method();
        obj.methodFu();
        //编译看左 左边是Fu Fu当中没有methodZi方法 所以编译报错
        //obj.methodZi();错误写法
    }
}
