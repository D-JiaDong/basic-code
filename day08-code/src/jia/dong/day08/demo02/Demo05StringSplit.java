package jia.dong.day08.demo02;
/*
* 分割字符串
* public String[] split(String regex) 按照参数规则 将字符串切分成为若干部分
* 注意事项 split方法参数 其实是一个正则表达式
* 今天要注意 如果按照英文句点“.” 进行切分 必须写“\\.”*/
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1="aaa,bbb,ccc";
        String[] array1=str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("=====================");

        String str2="aaa bbb ccc";
        String[] array2=str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("==============");
        String str3="aaa.bbb.ccc";
        String[] array3=str3.split("\\.");
        System.out.println(array3.length);
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }

    }
}
