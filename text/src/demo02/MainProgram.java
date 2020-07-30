package demo02;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        int[]arr=getIntArray();
        int sum=getSum(arr);
        System.out.println(sum);
    }
    public static int[] getIntArray(){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
       return arr;
    }
    public static int getSum(int[] arr){
        int Sum=0;
        for (int i = 0; i < arr.length; i++) {
            Sum+=arr[i];
        }
        for(int i : arr)
            System.out.println(i);
        return Sum;
    }
}
