package demo05Writer;

/**
 * @program: basic-code
 * @description
 * @author: Jiadong Duan
 * @create: 2020-10-19 20:38
 **/

/**
 * java.io.Writer 字符输入流 是所有字符输入流的最顶层的父类 是一个抽象类
 *
 * 共性的成员方法
 * Writer append(char c)
 * 将指定的字符附加到此作者。
 * Writer append(CharSequence csq)
 * 将指定的字符序列附加到此作者。
 * Writer append(CharSequence csq, int start, int end)
 * 将指定字符序列的子序列附加到此作者。
 * abstract void close()
 * 关闭流，先刷新。
 * abstract void flush()
 * 刷新流。
 * void write(char[] cbuf)
 * 写入一个字符数组。
 * abstract void write(char[] cbuf, int off, int len)
 * 写入字符数组的一部分。
 * void write(int c)
 * 写一个字符
 * void write(String str)
 * 写一个字符串
 * void write(String str, int off, int len)
 * 写一个字符串的一部分。
 **/

import java.io.FileWriter;
import java.io.IOException;

/**FileWriter extends Writer:文件字符输出流 把内存中字符数据写入到文件中
 * 构造方法：
 * FileWriter(File file)
 * 给一个File对象构造一个FileWriter对象。
 * FileWriter(String fileName)
 * 构造一个给定文件名的FileWriter对象。
 *      作用：创建对象
 *           创建指定路径的文件
 *           对象指向文件
 *      字符输出流使用步骤
 *          1.创建FileWriter对象 构造方法中给明路径
 *          2，使用Writer方法 把数据写入到内存缓冲区中（字符转换为字节的过程）
 *          3，使用FileWriter中的fluse,把内存缓冲区的数据，刷新到文件中
 *          4，释放资源（先把内存缓冲区中的数据刷新到文件中）*/

public class demo01Writer {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileWriter fileWriter = new FileWriter("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\09_IOAndProperties\\src\\demo05Writer\\writer");
        //
//        char[] s=new char[1024];
        fileWriter.write("97");
        fileWriter.flush();
        fileWriter.close();
    }
}
