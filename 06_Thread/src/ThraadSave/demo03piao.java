package ThraadSave;

public class demo03piao {
    public static void main(String[] args) {
        RunableImpl_2 run=new RunableImpl_2();
//        创建Thread类对象 构造方法中传递 Runable接口的实现类对象
        Thread t0=new Thread(run);
        Thread t1=new Thread(run);
        Thread t2=new Thread(run);

        t0.start();
        t1.start();
        t2.start();

    }
}
