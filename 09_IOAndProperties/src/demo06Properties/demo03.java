package demo06Properties;

/**
 * @program: basic-code
 * @description： store方法
 * @author: Jiadong Duan
 * @create: 2020-10-24 14:44
 **/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * 创建Properties集合对象 添加数据
 * 创建字节输出流/字符输出流 构造方法中包含路径*/
public class demo03 {
    public static void main(String[] args) throws IOException {

        //创建对象
        Properties prop = new Properties();

        FileReader fileReader = new FileReader("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\09_IOAndProperties\\src\\demo06Properties\\writer.txt");

        prop.load(fileReader);
        Set<String> set=prop.stringPropertyNames();
        for(String key:set){
            String value=prop.getProperty(key);
            System.out.println(key+value);
        }
        fileReader.close();

    }
}

