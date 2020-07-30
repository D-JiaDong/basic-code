package jia.dong.day08.demo04;

import java.util.Arrays;

/*
* 将一个随机字符串中的所有字符升序排列 并倒序打印
* */
public class Demo02ArraysPractise {
    public static void main(String[] args) {
        String str="adsfasfgknnkvl56";

        char[] chars=str.toCharArray();
        Arrays.sort(chars);

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
