package demo03过滤器;

import java.io.File;
import java.io.FileFilter;

/**
 * @program: basic-code
 * @description: 实现FileFilter接口
 * @author: Jiadong Duan
 * @create: 2020-10-07 16:46
 **/

public class FileFilterImpl  implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if(pathname.isDirectory())
            return true;
        return pathname.getAbsolutePath().toLowerCase().endsWith(".java");
    }
}
