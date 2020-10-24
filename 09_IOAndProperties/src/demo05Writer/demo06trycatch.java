package demo05Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @program: basic-code
 * @description
 * @author: Jiadong Duan
 * @create: 2020-10-21 17:47
 **/
public class demo06trycatch {
    public static void main(String[] args) {
        //提高filewrite作用域 //必须赋值
        FileWriter fileWriter=null;
        try {
            fileWriter = new FileWriter("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\09_IOAndProperties\\src\\demo05Writer\\writer",true);
            for (int i=0;i<10;i++){
                fileWriter.write("hellow"+"\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            //如果创建对象失败 filewriter默认值为null
            //filewriter.close()声明抛出io异常
            if (fileWriter!=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
