package jia.dong.Object;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        String s1=null;
//        String s1="abc";
        String s2="aBc";
        //Boolean b=s1.equals(s2);//NullPointerException null是不能调用方法的 就会抛出空指针异常
        /*
        * Object 类的equls方法：对两个对象进行比较 防止空指针异常
        *  return (a == b) || (a != null && a.equals(b));
        * */
        boolean b=Objects.equals(s1,s2);
        System.out.println(b);
    }
}
