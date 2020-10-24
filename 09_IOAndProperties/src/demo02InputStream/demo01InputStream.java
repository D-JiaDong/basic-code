package demo02InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @program: basic-code
 * @description
 * @author: Jiadong Duan
 * @create: 2020-10-08 19:53
 **/

/*
* java。io.InputStream：字节输入流
*   此抽象类是标识字节输入流的所有类的超类
*   int read() 从输入流中读取数据的下一个字节
*   int read(byte[] b) 从输入流中读取一定数量的字节 并将其存储在缓冲数组b中
*   关闭子输入流并释放与该关联的所有资源
*
*   FileInputStream 为其子类
*   把硬盘文件数据 读取到内存中使用
*
*       构造方法：
*               FileInputStream(File file)
                通过打开与实际文件的连接创建一个 FileInputStream ，该文件由文件系统中的 File对象 file命名。
                FileInputStream(String name)
                通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的路径名 name命名。
       读取数据原理：
       * java程序--》jvm-->os-->os读取数据方法--》读取文件
*/
public class demo01InputStream {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileInputStream fis=new FileInputStream("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\09_IOAndProperties\\src\\demo01OutputStream\\a.txt");
        //调用方法
        //int read() 读取文件中的一个字节并返回 读取到文件末尾 返回-1
        int len=0;
        while((len=fis.read())!=-1){
            System.out.print((char)len);
        }
        /*int len=fis.read();
        System.out.println(len);

        len=fis.read();
        System.out.println(len);
*/
        //释放资源
        fis.close();
    }
}
