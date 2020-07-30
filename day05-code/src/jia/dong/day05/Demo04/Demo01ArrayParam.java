package jia.dong.day05.Demo04;
/*
* 数组可以作为方法的参数
* 当调用方法的时候 想方法的小括号进行传参 传递近期的其实是数组的地址值*/
public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};

        System.out.println(array);

        System.out.println("===aaa===");
        printArray(array);
        System.out.println("===bbb===");
        printArray(array);
    }
    public static void printArray(int[] array){
        System.out.println("收到的参数"+array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
