package ThraadSave;

public class demo01piao {
    public static void main(String[] args) {
        RunableImpl run=new RunableImpl();
//        创建Thread类对象 构造方法中传递 Runable接口的实现类对象
        Thread t0=new Thread(run);
        Thread t1=new Thread(run);
        Thread t2=new Thread(run);

        t0.start();
        t1.start();
        t2.start();

    }
}
