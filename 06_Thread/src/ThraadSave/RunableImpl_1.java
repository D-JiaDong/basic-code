package ThraadSave;

/*
* 同步代码块
* synchronized(锁对象){
* 可能会出现线程问题的代码 访问了共享数据的代码
* }
* 锁对象可以把同步代码块锁定 只让一个=线程在同步代码块中执行
* */
public class RunableImpl_1 implements Runnable {
    private static int piao=100;

    //创建一个锁对象
    Object obj=new Object();
    @Override
    public void run() {
       payPiao();
    }

    //静态方法 优先于对象 静态方法的锁对象是本类的class属性 -->class文件对象
    public static /*synchronized*/ void payPiao(){
        synchronized (RunableImpl_1.class){
            while(piao>0){
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
