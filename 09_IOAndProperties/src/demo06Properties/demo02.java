package demo06Properties;

/**
 * @program: basic-code
 * @description： store方法
 * @author: Jiadong Duan
 * @create: 2020-10-24 14:44
 **/

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * 创建Properties集合对象 添加数据
 * 创建字节输出流/字符输出流 构造方法中包含路径*/
public class demo02 {
    public static void main(String[] args) throws IOException {
        //创建对象
        Properties prop = new Properties();

        //都是字符串
        prop.setProperty("小明","1");
        prop.setProperty("小红","2");

        FileWriter fileWriter = new FileWriter("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\09_IOAndProperties\\src\\demo06Properties\\writer.txt");

        prop.store(fileWriter,"save date");
        fileWriter.close();

    }
}

