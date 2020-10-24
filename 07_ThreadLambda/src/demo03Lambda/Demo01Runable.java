package demo03Lambda;
/*
* 使用实现Runable接口的方式实现多线程程序*/
public class Demo01Runable {
    public static void main(String[] args) {
        RunableIMPL Run=new RunableIMPL();
        Thread t=new Thread(Run);
        t.start();
        //简化代码 使用匿名内部类
        Runnable run=new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新的线程创建");
            }
        };
        new Thread(run).start();

        //继续简化
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新的线程创建");
            }
        }).start();


    }
}
