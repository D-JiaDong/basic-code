package demo07Buffer;

import java.io.*;

/**
 * @program: basic-code
 * @description
 * @author: Jiadong Duan
 * @create: 2020-10-24 15:16
 **/
public class demo02BufferedInputStream {
    public static void main(String[] args) throws IOException {
        //创建基本的字节输出流
        FileInputStream fileInputStream = new FileInputStream("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\09_IOAndProperties\\src\\demo06Properties\\writer.txt");
        //创建缓冲流对象
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        byte[] bytes = new byte[1024];
        int len;
        while((len = bufferedInputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        bufferedInputStream.close();
    }
}
