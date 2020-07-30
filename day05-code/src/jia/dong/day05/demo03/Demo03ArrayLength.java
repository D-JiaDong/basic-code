package jia.dong.day05.demo03;
/*
* 如何获取数组的长度，格式
* 数组名称.length
* 这将会得到一个int数字，代表数组长度
* 数组一旦创建，程序运行期间，长度不可改变*/
public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA =new int[3];
        int[] arrayB ={10,20,30,40,50,60,70};
        int len=arrayB.length;
        System.out.println("arrayB数组长度："+len);

        int[] arrrayC=new int[3];
        System.out.println(arrrayC.length);
        arrrayC=new int[5];
        System.out.println(arrrayC.length);
    }
}
