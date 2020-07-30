package jia.dong.day09.demo02;
/*
* 在父子类的继承关系中 如果成员变量重名 访问有两种方式
*
* 直接通过子类对象访问成员变量
*   等号左边是谁 就优先用谁 没有则向上找
* 直接通过成员方法访问成员变量
*   该方法属于谁 就优先用谁 没有则向上找
*   */
public class Demo01ExtendsField {
    public static void main(String[] args) {
        Fu fu=new Fu();
        System.out.println(fu.numFu);

        Zi zi=new Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);

        //等号左边是谁 就优先用谁 没有则向上找
        System.out.println(zi.num);//优先用子类 200

//        System.out.println(zi.abc);//到处都没有 编译报错


        //这个方法是子类的
        zi.methodZi();//200
        //这个方法是在父类当中定义的
        zi.methodFu();//100

    }
}
