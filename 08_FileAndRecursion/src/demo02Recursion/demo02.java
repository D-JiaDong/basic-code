package demo02Recursion;

/**
 * @program: basic-code
 * @description
 * @author: Jiadong Duan
 * @create: 2020-10-07 15:56
 **/
public class demo02 {
    public static void main(String[] args) {
        int n=100;
        System.out.println(df(n));
    }
    private static int df(int n){
        if(n==1)
            return 1;
        else
            return n+df(n-1);
    }
}
