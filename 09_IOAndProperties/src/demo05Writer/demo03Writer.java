package demo05Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @program: basic-code
 * @description: 字节输出流的其他方法
 * @author: Jiadong Duan
 * @create: 2020-10-19 21:08
 **/
public class demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\09_IOAndProperties\\src\\demo05Writer\\writer");
        char[] s={'a','b','c','d'};
        fileWriter.write(s);
        fileWriter.write(s,1,3);//从off开始写 长度为len
        fileWriter.write("你好");
        fileWriter.write("你好我是李华",1,2);
        fileWriter.close();
    }
}
