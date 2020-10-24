package demo04Reader;

/**
 * @program: basic-code
 * @description
 * @author: Jiadong Duan
 * @create: 2020-10-19 20:14
 **/

/**
JAVA.io.Reader //字符输入流 是字符输入流最顶层的父类 定义了一些共性的成员方法
    int read()
    int read(char[] cbuf)//读取多个字符
    close()
 **/

import jdk.swing.interop.SwingInterOpUtils;

import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader文件字符输入流：把硬盘文件中的数据以字符的方式读取到内容中
 *
 * 构造方法：
 *      FileReader(String fileName)
 *      FileReader(File file)
 *      创建一个FileReader对象
 *      把该对象指向指定文件
 *  字符输入流使用步骤
 *      创建FileReader对象
 *      使用对象读取文件
 *      释放资源
 *      **/
public class demo01Reader {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileReader fileReader = new FileReader("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\09_IOAndProperties\\src\\demo04\\Reader\\reader");
       /* //读取文件
        int len=0;
        while((len=fileReader.read())!=-1){
            System.out.print((char)len);
        }
        //释放资源
        fileReader.close();*/

        char[] cs=new char[1024];
        int len=0;
        while((len=fileReader.read(cs))!=-1){
            System.out.println(new String(cs,0,len));

        }
    }
}
