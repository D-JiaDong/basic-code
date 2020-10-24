package demo02InputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: basic-code
 * @description: 复制文件
 * @author: Jiadong Duan
 * @create: 2020-10-19 18:49
 **/
public class demo03copy {
    public static void main(String[] args) throws IOException {
        long start=System.currentTimeMillis();
        FileInputStream fis=new FileInputStream("C:\\Users\\LIANG\\Pictures\\20200325\\BAGE.JPG");
        FileOutputStream fos=new FileOutputStream("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\09_IOAndProperties\\src\\demo02InputStream\\BAGE.JPG");

        //使用数组缓冲 读取多个字节 写入多个字节
        byte[] bytes=new byte[1024];
        int len=0;
        while((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        long end=System.currentTimeMillis();
        System.out.println("复制文件耗时："+(start-end)+"毫秒");




//        int len=0;
//        while((len=fis.read())!=-1){
//            fos.write(len);
//        }
//        fos.close();
//        fis.close();
    }
}
