package jia.dong.day04.demo04;

public class Demo04OverloadPrint {
    public static void main(String[] args) {
        myprint((byte)1);
        myprint((int)1);
        myprint((short)1);
        myprint((long)1);

    }

    public static void myprint(byte x){
        System.out.println(x);
    }
    public static void myprint(int x){
        System.out.println(x);
    }
    public static void myprint(short x){
        System.out.println(x);
    }
    public static void myprint(char x){
        System.out.println(x);
    }
    public static void myprint(long x){
        System.out.println(x);
    }

}
