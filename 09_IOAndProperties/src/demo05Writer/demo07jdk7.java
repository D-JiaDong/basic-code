package demo05Writer;

/**
 * @program: basic-code
 * @description
 * @author: Jiadong Duan
 * @create: 2020-10-21 18:23
 **/

import java.io.FileWriter;
import java.io.IOException;

/**
 * jdk7的新特性
 * 在try的后边可以增加一个（）在括号中可以定义流对象
 * 那么这个流对象的作用域就在try中有效
 * try中的代码执行完毕后自动把流对象释放
 *
 * 格式：
 *      try(定义流对象){
 *
 *      }
 *      catch{
 *
 *      }**/
public class demo07jdk7 {
    public static void main(String[] args) {
        try (
            FileWriter fw = new FileWriter("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\09_IOAndProperties\\src\\demo05Writer\\writer");
        ){
            for (int i=0;i<10;i++){
                fw.write("hellow"+"\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
