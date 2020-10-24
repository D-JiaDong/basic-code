package demo01_TreadRealize;
/*
创建Thread子类
重写run方法
创建子类对象
调用start方法 开启新的线程
 */

public class demo01Thread  {
    public static void main(String[] args) {
        MyThread mt =new MyThread();
        mt.start();
        new MyThread().start();
        System.out.println(Thread.currentThread().getName());
    }
}
