package demo03过滤器;
import java.io.File;
/**
 * @program: basic-code
 * @description
 * @author: Jiadong Duan
 * @create: 2020-10-07 16:22
 **/
/*
可以使用过滤器实现 在File类中有两个 ListFiles重载的方法 方法的参数传递的是过滤器
 */
public class demo01过滤器 {
    public static void main(String[] args) {

        /*
        String[] list(FilenameFilter filter)
        返回一个字符串数组，命名由此抽象路径名表示的目录中满足指定过滤器的文件和目录。
        用来过滤的抽象方法 accept(File dir,Sting name)
        File[] listFiles(FileFilter filter)
        返回一个抽象路径名数组，表示由此抽象路径名表示的满足指定过滤器的目录中的文件和目录。

        */


    }
}
