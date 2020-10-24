package demo3_WaitAndNotify;

//顾客和老板线程必须使用同步代码块包裹起来 保证线程和唤醒只能有一个在执行
//同步使用的锁对象必须保证唯一
//只有锁对象才能调用wait和 notify方法

public class demo01_WN {
    public static void main(String[] args) {
        Object obj=new Object();
        new Thread(){
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("告知老板包子的种类和数量");
                    //调用wait方法
                    try{
                        obj.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    //被唤醒之后 执行的代码
                    System.out.println("吃包子");
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (obj){
                    System.out.println("老板五秒钟做好包子，告知顾客可以吃包子了");
                    obj.notify();
                }
            }
        }.start();
    }
}
