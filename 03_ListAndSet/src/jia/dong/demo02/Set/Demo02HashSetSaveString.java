package jia.dong.demo02.Set;

import java.util.HashSet;

/*
    Set集合不允许存储重复元素的原理
 */
public class Demo02HashSetSaveString {
    public static void main(String[] args) {
        //创建HashSet集合对象
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());


        set.add(s1);
        //调用元素hashCode方法计算字符串哈希值
        //调用s2.equals()比较
        set.add(s2);
        System.out.println("重地".hashCode());
        set.add("重地");
        System.out.println("通话".hashCode());
        set.add("通话");
        set.add("abc");
        System.out.println(set);//[重地, 通话, abc]
    }

}
