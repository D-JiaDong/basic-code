package demo01OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: basic-code
 * @description
 * @author: Jiadong Duan
 * @create: 2020-10-08 15:53
 **/

/*
* 追加/续写 使用两个参数的构造方法
*   FileOutStream(String name,boolean append) 创建一个向具有指定 name的文件中写入数据的输出文件流
*   FileOutStream(File file,boolean append) 创建一个指向File对象的文件中写入数据的文件输出流
*       参数： Boolean append 追加写开关
*               true: 创建对象 不会覆盖原文件 继续在文件末尾追加写数据
*               false: 创建一个新文件 覆盖原文件 在新文件中重新写数据
*
*       混行：写换行符号
*               window:\r\n
*               linux:n/*/
public class demo03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\09_IOAndProperties\\src\\demo01OutputStream\\a.txt",true);
        //换行
        fos.write("\r\n".getBytes());
        fos.write("niahao".getBytes());

        fos.close();
    }
}
