package demo01OutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
/**
 * @program: basic-code
 * @description
 * @author: Jiadong Duan
 * @create: 2020-10-08 11:20
 **/

/*
* void close()
关闭此输出流并释放与此流相关联的任何系统资源。
void flush()
刷新此输出流并强制任何缓冲的输出字节被写出。
void write(byte[] b)
将 b.length字节从指定的字节数组写入此输出流。
void write(byte[] b, int off, int len)
从指定的字节数组写入 len个字节，从偏移 off开始输出到此输出流。
abstract void write(int b)
将指定的字节写入此输出流。
*/
    //FileOutputStream extend OutStream
    //文件字节输出流             字节输出流
    //构造方法 :
    /*      FileOutputStream(File file)
            创建文件输出流以写入由指定的 File对象表示的文件。
            FileOutputStream(File file, boolean append)
            创建文件输出流以写入指定的文件描述符，表示与文件系统中实际文件的现有连接。
            FileOutputStream(String name)
            创建文件输出流以指定的名称写入文件。
            FileOutputStream(String name, boolean append)
            创建文件输出流以指定的名称写入文件。

            创建一个FileOutputStream对象
            会根据构造方法中传递的文件/文件路径 创建一个空的文件
            会把FileOutStream对象指向创建好的文件
            把数据从内存写入硬盘
            java程序--》jvm--》os操作系统--》os调用写数据方法--》把数据写入到文件中

            使用步骤：创建对象 传递参数
                    调用对象中的方法write 把数据写入文件
                    释放资源 流使用会占用一定的内存
     */
public class demo01OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\09_IOAndProperties\\src\\demo01\\a.txt");
        //写数据时 会把十进制整数 转化为二进制数
        //任意的文本编辑器 都会查询编码表 八字节转化为字符表示
        fos.write(48);
        fos.close();
    }
}
