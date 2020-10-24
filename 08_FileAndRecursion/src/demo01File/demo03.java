package demo01File;
import java.io.File;
/**
 * @program: basic-code
 * @description
 * @author: Jiadong Duan
 * @create: 2020-10-06 16:50
 **/
public class demo03 {
    public static void main(String[] args) {
        show01();
        show02();
    }
    private static void show01(){
        /**
         * getAbsolutePath() 返回绝对路径
         * getPath()  返回File类对象传递的参数字符串
         * getName()  返回对象表示的文件或目录的名称

         * */
        //获取路径
        File f1=new File("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\a.txt");
        String absolutePath = f1.getAbsolutePath();
        String absolutePath1 = f1.getPath();
        String absolutePath2 = f1.getName();

        System.out.println(absolutePath);
        System.out.println(absolutePath1);
        System.out.println(absolutePath2);

        File f2=new File("a.txt");
        String absolutePath3 = f2.getAbsolutePath();
        String absolutePath4 = f2.getPath();
        String absolutePath5 = f2.getName();

        System.out.println(absolutePath3);
        System.out.println(absolutePath4);
        System.out.println(absolutePath5);

    }
    private static void show02(){
        /**
         * length() 返回文件大小 以字节为单位 不能获取文件夹大小
         * */
        //获取路径
        File f1=new File("C:\\Users\\LIANG\\Pictures\\20200325\\IMG_0010.JPG");
        Long l1=f1.length();
        System.out.println(l1);

        File f2=new File("C:\\Users\\LIANG\\Pictures\\20200325\\IMG_001.JPG");
        Long l2=f2.length();        //没有该文件 返回0
        System.out.println(l2);

        File f3=new File("C:\\Users\\LIANG\\Pictures\\20200325");
        Long l3=f3.length();        //文件夹 不确定 没有大小概念
        System.out.println();
    }
}
