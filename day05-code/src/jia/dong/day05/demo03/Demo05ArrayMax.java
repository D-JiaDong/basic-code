package jia.dong.day05.demo03;

public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array={5,15,30,20,10000};
        int max=array[0];
        for (int i = 1; i < array.length; i++) {
                     if(max<array[i])
                         max=array[i];
        }
        System.out.println("最大值"+max);
    }
}
