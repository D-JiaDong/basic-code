package demo03Lambda;

/*
*Lamdba表达式 无参数 无返回值
* 由三部分组成 一些参数 一个箭头 一段代码
* 格式：
*       （参数列表）->{一些重写方法的代码}
* 解释说明格式：
*       （）:接口中抽象方法的参数列表，没有参数空着，多个参数 逗号隔开
*       ->:传递参数
*       {}：重写方法代码*/


public class Demo02Lamdba {
    public static void main(String[] args) {
        //使用lambda表达式，实现多线程
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"新线程创建");
        }).start();
    }
}
