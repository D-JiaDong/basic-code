package demo02InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @program: basic-code
 * @description
 * @author: Jiadong Duan
 * @create: 2020-10-08 21:40
 **/
/*
* 字节输入流一次读取多个字节的方法
*           int read(btye[] b)从输入中读取一定数量的字节 并将其存储在缓冲区数组b中
*           明确两件事情
*                   1，byte[]作用： 起到缓冲作用 存储每次读取到的多个字节
*                   数组的长度一般定义为1024 或者1024的整数倍
*                   2，返回值int
*
*
*           String类的构造方法
*           String(byte[] bytes)
*           String(byte[] bytes,int offset,int length)
*           offset是开始索引 length是长度*/
public class demo02InputStream {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileInputStream fis=new FileInputStream("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\09_IOAndProperties\\src\\demo01OutputStream\\a.txt");

        byte[] bytes=new byte[2];

        //把字节数组转换为字符串
        //int len=fis.read(bytes);

       /* System.out.println(len);
        System.out.println(Arrays.toString(bytes));
        //把字节数组转化为字符串
        System.out.println(new String(bytes));*/
        int len=0;
        while((len=fis.read(bytes))!=-1){
            System.out.print(new String(bytes,0,len));
        }
        fis.close();
    }
}
