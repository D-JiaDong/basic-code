package demo3_WaitAndNotify;


/*
* 进入TimeWaiting(计时等待)有两种方式
* 1，sleep（long m）方法 在毫秒值结束之后 线程睡醒进入Runable/Blocked状态
* 2，使用wait(long m)方法 wait方法如果在毫秒值结束之后 还没有被notify唤醒 就会自动醒来 线程睡醒进入到Runanle/Blocked状态
* 3.notify() 随机唤醒一个线程 唤醒全部线程*/

public class demo02_WN {
    public static void main(String[] args) {
        Object obj=new Object();
        new Thread(){
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("告知老板包子的种类和数量");
                    //调用wait方法
                    try{
                        obj.wait(5000);
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
                synchronized (obj){
                    System.out.println("告知老板包子的种类和数量");
                    //调用wait方法
                    try{
                        obj.wait(5000);
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
                    obj.notifyAll();
                }
            }
        }.start();
    }
}
