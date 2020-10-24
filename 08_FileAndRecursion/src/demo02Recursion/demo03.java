package demo02Recursion;

/**
 * @program: basic-code
 * @description
 * @author: Jiadong Duan
 * @create: 2020-10-07 16:00
 **/
public class demo03 {
    public static void main(String[] args) {
        int n=10;
        System.out.println(df(n));
    }
    private static int df(int n){
        if(n==0)
            return 1;
        else
            return n*df(n-1);
    }
}
