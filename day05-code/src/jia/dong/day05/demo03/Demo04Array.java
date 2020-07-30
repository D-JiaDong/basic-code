package jia.dong.day05.demo03;

public class Demo04Array {
    public static void main(String[] args) {
        int[] array={15,25,30,40,50};
        //首先使用原始方式
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println("============");
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
        System.out.println("============");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
