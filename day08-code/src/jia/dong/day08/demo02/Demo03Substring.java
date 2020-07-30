package jia.dong.day08.demo02;



/*
* 字符串的截取方法：
*
* public String substring(int index):截取从参数位置一直到字符串末尾 返回新字符串
* public String subString(int begin,int end):截取从begin开始，一直到end结束 中间的字符串:[begin,end)
* */
public class Demo03Substring {
    public static void main(String[] args) {
        String str1="HelloWorld";
        String str2=str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("================");

        String str3=str1.substring(4,7);
        System.out.println(str3);

        //下面这种写法 字符串的内容仍然是没有改变的
        //strA保存的是地址值

        String strA="Hello";
        System.out.println(strA);
        strA="World";
        System.out.println(strA);

    }
}
