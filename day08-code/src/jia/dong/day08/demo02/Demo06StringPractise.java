package jia.dong.day08.demo02;
/*
* 题目：
* 定义一个方法 把数组{1,2,3}按照指定格式拼成一个字符串 格式参照如下
*
* 分析
* 1，首先准备一个int[] 数组 内容是：1,2,3
* 2，定义一个方法 用来将数组变成字符串
*
* 三要素
* 返回值类型 String
* 方法名称 fromArrayString
* 参数列表 int[]
* 3，格式[word1#word2#word3]
* */
public class Demo06StringPractise {
    public static void main(String[] args) {
        int[] array={1,2,3};
        String result=fromArrayString(array);
        System.out.println(result);
    }
    public static String fromArrayString(int[] array){
        String str="[";
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1)
                str+="word"+array[i]+"]";
            else
                str+="word"+array[i]+"#";
        }
        return str;
    }
}
