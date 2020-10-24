package demo03过滤器;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * @program: basic-code
 * @description
 * @author: Jiadong Duan
 * @create: 2020-10-07 16:04
 **/
public class demo03递归打印多级目录 {
    public static void main(String[] args) {
        df(new File("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\08_FileAndRecursion"));

    }
    private static void df(File f){
        /*File[] files=f.listFiles(new FileFilter(){

            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory()||pathname.getAbsolutePath().toLowerCase().endsWith(".java");
            }
        });//传递过滤器对象*/

        /*File[] files=f.listFiles(new FilenameFilter(){
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory()||name.toLowerCase().endsWith(".java");
            }
        });//传递过滤器对象*/

        //使用lambda表达式
        File[] files=f.listFiles((File dir, String name)->{
                return new File(dir,name).isDirectory()||name.toLowerCase().endsWith(".java");
        });//传递过滤器对象


        /*
        * listFiles会做三件事情
        * 1，对构造方法中的传递的目录进行遍历 获取目录中的每一个文件/文件夹-->封装个File对象
        * 2，调用参数传递过程中的过滤器中的方法accept
        * 3,遍历得到的每一个File对象 传递过accept方法的参数pathnamef
        * 4,如果 accept返回ture listFiles就会保存该对象*/
        for(File f0:files){
            if (f0.isDirectory()){
                df(f0);
            }
            else{
                    System.out.println(f0);
            }
        }
    }
}
