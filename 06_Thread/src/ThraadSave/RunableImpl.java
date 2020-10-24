package ThraadSave;

/*
* 同步代码块
* synchronized(锁对象){
* 可能会出现线程问题的代码 访问了共享数据的代码
* }
* 锁对象可以把同步代码块锁定 只让一个=线程在同步代码块中执行
* */
public class RunableImpl implements Runnable {
    private int piao=100;

    //创建一个锁对象
    Object obj=new Object();
    @Override
    public void run() {
       while(piao>0){
           synchronized (obj){
               if (piao>0){
                   //存在票 买票
                   try{
                       Thread.sleep(10);
                   }catch (InterruptedException e){
                       e.printStackTrace();
                   }
                   System.out.println(Thread.currentThread().getName()+"--->正在卖第"+piao--+"张票");
               }
           }
       }
    }
}
