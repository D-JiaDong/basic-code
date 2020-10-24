package demo02_TreadRealize;

public class demo01Runable {
    public static void main(String[] args) {
        MyThreadImple run=new MyThreadImple();
        Thread thread=new Thread(run);
        thread.start();
        for (int i = 0; i <20 ; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
