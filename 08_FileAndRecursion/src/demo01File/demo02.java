package demo01File;
import java.io.File;
/**
 * @program: basic-code
 * @description
 * @author: Jiadong Duan
 * @create: 2020-10-06 16:05
 **/

/**绝对路径
 * 相对路径：当前项目的根目录路径可以简化书写 可以省略羡慕的根目录
 * 路径不区分大小写*/

public class demo02 {
    public static void main(String[] args) {
        show01("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\","a.txt");
    }
    /**路径可以是以文件结尾  也可以是以文件夹结尾
     * 路径可以是相对路径 也可以是绝对路径
     * 路径可以存在 也可以不存在
     * 创建File对象 只是把字符串的路径封装成File对象 不考虑路径是否正确
     * */
    private static void show01(String parent,String child){
        //构造方法
        File f1=new File("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\a.txt");
        System.out.println(f1);

        File f2=new File("D:\\JetBrains_2020\\IdeaProjects\\basic-code");
        System.out.println(f2);

        File f3=new File("a.txt");
        System.out.println(f3);

        /**构造方法2
         * 比较灵活
         * File(String pathname,String child)
        */
        File f4=new File(parent,child);
        System.out.println(f4);

    }
}
