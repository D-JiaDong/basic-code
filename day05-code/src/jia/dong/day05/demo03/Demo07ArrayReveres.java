package jia.dong.day05.demo03;
/*
* 数组元素反转
*本来是
* [1,2,3,4]
* 改变后
* [4,3,2,1]*/
public class Demo07ArrayReveres {
    public static void main(String[] args) {
        int[] array={1,2,3,4};
        for (int i = 0; i < array.length/2; i++) {
            int temp;
            temp=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for(int min=0,max=array.length-1;min<max;min++,max--){
            int temp;
             temp=array[min];
             array[min]=array[max];
             array[max]=temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
