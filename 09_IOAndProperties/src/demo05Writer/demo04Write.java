package demo05Writer;

/**
 * @program: basic-code
 * @description: 续写和换行
 * @author: Jiadong Duan
 * @create: 2020-10-19 21:27
 **/

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * FileWriter(File file, boolean append)
 * 给一个File对象构造一个FileWriter对象。
 * FileWriter(String fileName, boolean append)
 * 构造一个FileWriter对象，给出一个带有布尔值的文件名，表示是否附加写入的数据。
 *  append 续写开关
 *  window:\r\n
 *  linux:/n
 *  mac:/r
 *  **/
public class demo04Write {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\09_IOAndProperties\\src\\demo05Writer\\writer",true);
        for(int i=0;i<10;i++){
            fw.write("helloworld"+i);
            fw.write("\r");
        }

        fw.close();
    }
}
//p370
