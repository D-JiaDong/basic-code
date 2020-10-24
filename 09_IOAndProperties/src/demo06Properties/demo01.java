package demo06Properties;

/**
 * @program: basic-code
 * @description :
 * @author: Jiadong Duan
 * @create: 2020-10-24 14:30
 **/

//类表示了一个持久的属性集 properties可保存在流中或从流中加载

import java.util.Properties;
import java.util.Set;

/**
 *store()把集合中的临时数据 持久华写入到硬盘中存储
 *load()从硬盘中保存的文件（键值对） 读取到集合中使用
 */
public class demo01 {
    public static void main(String[] args) {
        show01();
    }

    private static void show01(){
        //创建对象
        Properties prop = new Properties();

        //都是字符串
        prop.setProperty("小明","1");
        prop.setProperty("小红","2");


        //使用stringPropertuname把集合中的键取出
        Set<String> set=prop.stringPropertyNames();

        for(String key:set){
            String value=prop.getProperty(key);
            System.out.println(key+value);

        }

    }
}
