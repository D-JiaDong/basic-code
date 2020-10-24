package demo02Recursion;
import java.io.File;

/**
 * @program: basic-code
 * @description
 * @author: Jiadong Duan
 * @create: 2020-10-07 16:04
 **/
public class demo05递归打印多级目录 {
    public static void main(String[] args) {
        df(new File("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\08_FileAndRecursion"));

    }
    private static void df(File f){
        File[] files=f.listFiles();
        for(File f0:files){
            if (f0.isDirectory()){
                df(f0);
            }
            else{
                if(f0.getAbsolutePath().toLowerCase().endsWith("java"))
                    System.out.println(f0);
            }
        }
    }
}
