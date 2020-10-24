package demo01File;
import java.io.File;
import java.io.IOException;

/**
 * @program: basic-code
 * @description
 * @author: Jiadong Duan
 * @create: 2020-10-06 17:46
 **/
public class demo05 {
    public static void main(String[] args) throws IOException {
        show03();
    }
    private static void show01() throws IOException {
        /*
         * Boolean createNewFile();
         * 当路径中文件不存在时 创建一个新的文件
         * 创建文件的路径和名称在构造方法中给出（构造方法的参数）
         * true：文件不存在 创建文件 返回true
         * false:文件存在 不会创建
         * 注意：
         * 此方法只能创建文件 不能创建文件夹
         * 创建文件的路径必须存在 否则会抛出异常
         */
        //路径相对绝对都可
        File f1=new File("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\08_FileAndRecursion\\src\\demo01File\\a.txt");
        boolean bo1=f1.createNewFile();
         System.out.println(bo1);
    }
    private static void show02() {
        /**
         * 创建单级空文件夹 boolean mkdir();
         * 创建文件的路径和名称在构造方法中给出（构造方法的参数）
         * true：文件夹不存在 创建文件 返回true
         * false:文件存在 不会创建 构造方法中给出的文件不存在 返回false
         * 注意：
         * 此方法只能创建文件夹 不能创建文件
         *
         * 创建多级空文件夹 boolean mkdirs();
         * 创建文件的路径和名称在构造方法中给出（构造方法的参数）
         * true：文件夹不存在 创建文件 返回true
         * false:文件存在 不会创建
         * 注意：
         * 此方法只能创建文件夹 不能创建文件
         *
         * */

//        File f1 = new File("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\08_FileAndRecursion\\src\\demo01File\\新建文件夹");
//        boolean bo = f1.mkdir();
//        System.out.println(bo);

        File f2 = new File("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\08_FileAndRecursion\\src\\demo01File\\1\\2\\3");
        f2.mkdirs();
    }

    private static void show03(){
        /**
         * boolean delete() 删除由此File表示的文件或者目录
         * 此方法可以删除构造方法路径中给出的文件/文件夹
         * 返回值 true: 文件夹删除成功 返回true
         *       false: 文件中有内容 不会删除返回false 构造方法中路径不存在false
         * 注：
         *      delete方法是直接在硬盘删除文件/文件夹 不走回收站
         *      */
        File f1=new File("D:\\JetBrains_2020\\IdeaProjects\\basic-code\\08_FileAndRecursion\\src\\demo01File\\a.txt");
        f1.delete();
    }
}
