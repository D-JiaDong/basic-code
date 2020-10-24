package demo05Writer;

/**
 * @program: basic-code
 * @description
 * @author: Jiadong Duan
 * @create: 2020-10-21 18:33
 **/

import java.io.FileWriter;
import java.io.IOException;

/**
 * 在try前边定义流对象
 * 在try后边（）中可以以内流对象
 * 在try代码执行完毕后 流对象也可以释放掉 不用写finnally
 * **/
public class  demo08jdk9 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\09_IOAndProperties\\src\\demo05Writer\\writer");
        try (fw){
            for (int i=0;i<10;i++){
                fw.write("hellow"+"\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
//372

