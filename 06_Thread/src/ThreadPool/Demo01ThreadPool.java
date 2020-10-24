package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
* Executors 类中的静态方法
* static ExecutorService newFixedThreadPool(int nThread)
* 参数：就是创建线程池的线程数量
* 返回值：ExectorService 接口 ，返回是 ExecutorService 接口的实现类对象 ，我们可以使用 ExecutorSerivce接口接收（面向接口编程）
* import java.util.concurrent.Executors; //线程池接口 从线程池中获取线程 调用start方法 执行线程任务
* submit(Runable task)提交一个Runable任务用于执行
* 关闭/销毁线程池的方法void shutdown()
*
* 线程池使用步骤
* 1，生成一个指定数量的线程池
* 2，创建一个Runable的实现类 重写run方法 设置线程任务
* 3，调用 executorService中的submit（）方法 ，传递线程任务 开启线程 执行run方法
* 4，调用shutdown方法 销毁线程池（不建议执行）*/
public class Demo01ThreadPool {
    public static void main(String[] args) {
        //获取线程池
        ExecutorService es = Executors.newFixedThreadPool(2);
        //线程池会一直开启 使用完线程 会自动把线程归还给线程池 线程可以继续使用
        es.submit(new RunableImpl());
        es.submit(new RunableImpl());
        es.submit(new RunableImpl());
        es.submit(new RunableImpl());
        //调用sutdown销毁线程池（不建议执行）
        es.shutdown();
    }

}
