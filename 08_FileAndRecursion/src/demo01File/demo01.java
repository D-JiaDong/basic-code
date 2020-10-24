package demo01File;

import java.io.File;
/**
 * @program: basic-code
 * @description
 * @author: Jiadong Duan
 * @create: 2020-10-06 15:29
 **/
public class demo01 {
    public static void main(String[] args) {
        //路径分隔符 window; linux:
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);

        //文件名称分隔符 window\  linux /
        String separator = File.separator;
        System.out.println(separator);

    }
}
