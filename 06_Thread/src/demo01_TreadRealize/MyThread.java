package demo01_TreadRealize;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            //获取线程名称
            String str=getName();
            System.out.println(str);
            //设置线程名称 setName()
        }
    }
}
