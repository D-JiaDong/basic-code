package ThraadSave;

public class demo02piao {
    public static void main(String[] args) {
        RunableImpl_1 run=new RunableImpl_1();
//        创建Thread类对象 构造方法中传递 Runable接口的实现类对象
        Thread t0=new Thread(run);
        Thread t1=new Thread(run);
        Thread t2=new Thread(run);

        t0.start();
        t1.start();
        t2.start();

    }
}
