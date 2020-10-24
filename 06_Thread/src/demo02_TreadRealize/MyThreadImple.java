package demo02_TreadRealize;

public class MyThreadImple implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
