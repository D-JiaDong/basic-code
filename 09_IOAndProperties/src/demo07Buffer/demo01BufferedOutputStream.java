package demo07Buffer;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: basic-code
 * @description
 * @author: Jiadong Duan
 * @create: 2020-10-24 15:16
 **/
public class demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        //创建基本的字节输出流
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\09_IOAndProperties\\src\\demo06Properties\\writer.txt");
        //创建缓冲流对象
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write("数据".getBytes());
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }
}
