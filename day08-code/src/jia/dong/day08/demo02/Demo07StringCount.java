package jia.dong.day08.demo02;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*
* 题目：
* 键盘输入一个字符串 并且统计其中各种字符出现的次数
* 种类有大写字母 小写字母 数字 其他*/
public class Demo07StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String input=sc.next();

        int countUpper=0;//大写字母
        int countLower=0;//小写字母
        int countNumer=0;//数字
        int countOther=0;//其他

        char[] charArray=input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch=charArray[i];
            if('A'<=ch&&ch<='Z')
                countUpper++;
            else if('a'<=ch&&ch<='b')
                countLower++;
            else if ('0'<=ch&&ch<='b')
                countNumer++;
            else
                countOther++;
        }
        System.out.println(" "+countUpper+countLower+countNumer+countOther);
    }
}
