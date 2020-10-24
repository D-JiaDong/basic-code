package demo01OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: basic-code
 * @description
 * @author: Jiadong Duan
 * @create: 2020-10-08 14:19
 **/
public class demo02 {
    public static void main(String[] args) throws IOException {
        //创建FileOutputStream 对象 构造方法中绑定要写入数据的目的地
        FileOutputStream fos=new FileOutputStream("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\09_IOAndProperties\\src\\demo01OutputStream\\a.txt");
        fos.write(49);
        fos.write(48);
        fos.write(48);


        byte[] btes={65,66,67,68,69};
        byte[] btes1={-65,66,-67,68,69};
        //fos.write(btes);
        //fos.write(btes1);
        //off 数组的开始索引
        //len 写几个字节
        //fos.write(btes1,1,2);

        byte[] bytes3 = "你好".getBytes();
        fos.write(bytes3);

        fos.close();
    }
    /*
    * 一次写多个字节 如果写的第一个字节是正数（0-127） 那么显示的时候会查询ascll表
    * 如果写的第一个字节为负数 那第一个字节会和第二个字节 两个字节组成一个中文显示 查询系统默认GBK
    * */
}
