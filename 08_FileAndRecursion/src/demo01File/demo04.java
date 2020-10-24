package demo01File;
import java.io.File;
/**
 * @program: basic-code
 * @description: File类中的判断方法
 * @author: Jiadong Duan
 * @create: 2020-10-06 17:32
 **/
public class demo04 {
    public static void main(String[] args) {
        show01();
        show02();
    }
    private static void show01(){
        File f1=new File("C:\\Users\\LIANG\\Pictures\\20200325");
        System.out.println(f1.exists()); //true

        File f2=new File("C:\\Users\\LIANG\\Pictures\\2020032");
        System.out.println(f2.exists());//False

        //相对路径
        File f3=new File("01_API");
        System.out.println(f3.exists()); //true

        File f4=new File("02_API");
        System.out.println(f4.exists()); //False

    }
    private static void show02(){
        /**
         * 用于判断构造方法中给定的路径是否为文件夹结尾 isDirectory()
         * 用于判断构造方法中给定的路径是否为文件结尾   isFile()
         * 使用前提：路径存在
         */
        File f1=new File("C:\\Users\\LIANG\\Pictures\\20200325");
        System.out.println(f1.isDirectory()); //true

        File f2=new File("C:\\Users\\LIANG\\Pictures\\20200325");
        System.out.println(f2.isFile());//False

    }
}
