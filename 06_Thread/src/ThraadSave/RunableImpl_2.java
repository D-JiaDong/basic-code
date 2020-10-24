package ThraadSave;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
* 使用lock锁
* lock接口中的方法 lock() unlock()
*
* 使用步骤
* Reentrantlock 实现lock接口
*
* 使用步骤：
*   1，在成员位置创建一个Reenrantlock对象
*   2，在可能会出现的代码前调用lock接口中的方法lock获取锁
*   3，在代码后调用unlock()*/
public class RunableImpl_2 implements Runnable {
    private static int piao=100;
    Lock l=new ReentrantLock();

    @Override
    public void run() {
       payPiao();
    }

    //静态方法 优先于对象 静态方法的锁对象是本类的class属性 -->class文件对象
    public void payPiao() {
        while(piao>0){
            l.lock();
            if (piao>0){
                //存在票 买票
                try{
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName()+"--->正在卖第"+piao--+"张票");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    l.unlock();
                }
            }
        }
    }
}
