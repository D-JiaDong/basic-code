package jia.dong.day04.demo02;

/*方法定义的先后顺序无所谓
 * 方法定义必须是挨着的 不能再一个方法的内部定义另一个方法
 * 方法定义之后方法不会执行 如果需要执行 一定要执行方法的调用*/
public class Demo01Method {
    public static void main(String[] args) {
        printMethod();
    }
    public static void printMethod(){
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
