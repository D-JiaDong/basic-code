package demo03Lambda;

public class RunableIMPL implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"新的线程创建");
    }
}
