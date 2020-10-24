package demo01File;
import java.io.File;
/**
 * @program: basic-code
 * @description
 * @author: Jiadong Duan
 * @create: 2020-10-07 15:32
 **/

/*
* 注意：
*       list方法和listFiles方法遍历的是构造方法中给出的目录
*       如果路径不存在 不抛出异常
*       如果给出的不是一个目录 也会抛出异常
* */
public class demo06 {
    public static void main(String[] args) {
        show01();
        show02();
    }
    private static void show01(){
        /*String[] list() 返回一个String数组 表示该 File目录中的所有子文件或目录
        * 遍历构造方法中给出的目录 会获取目录中所有文件/文件夹名称 把获取到的多个名称存储到一个String类型的数组中
        * 注:
        *       路径不存在 空指针异常*/
        File f1=new File("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\08_FileAndRecursion\\src\\demo01File");
        String[] arr=f1.list();
        for(String fileName:arr){
            System.out.println(fileName);
        }
    }
    private static void show02(){
        /*String[] listFile() 返回一个String数组 表示该 File目录中的所有子文件或目录
         * 遍历构造方法中给出的目录 会获取目录中所有文件/文件夹名称 把获取到的多个名称存储到一个File类型的数组中
         * 注:
         *       路径不存在 空指针异常*/
        File f1=new File("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\08_FileAndRecursion\\src\\demo01File");
        File[] arr=f1.listFiles();
            for(File f:arr){
            System.out.println(f);
        }
    }
}
