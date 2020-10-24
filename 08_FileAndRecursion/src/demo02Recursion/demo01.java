package demo02Recursion;

/**
 * @program: basic-code
 * @description
 * @author: Jiadong Duan
 * @create: 2020-10-07 15:50
 **/
public class demo01 {
    public static void main(String[] args) {
        //a();
        b(0);
    }
    private static void a(){
        System.out.println("递归");
        a();

    }
    private static void b(int numb){
        if(numb==100)
            return;
        System.out.println("递归");
        b(++numb);
    }

    /*注： 构造方法不能递归*/
}
