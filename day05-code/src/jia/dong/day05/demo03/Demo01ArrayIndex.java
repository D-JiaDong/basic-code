package jia.dong.day05.demo03;
/*
*数组的索引编号从零开始，一直到”数组长度-1“为止
* 如果访问数组元素时 索引编号并不存在  那么将会发生数组索引越界异常：ArrayIndexOutOfBoundsException
* 原因 索引编号写错 进行修改
* */
public class Demo01ArrayIndex {
    public static void main(String[] args) {
        int [] array={15,25,35};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        //错误写法 并不存在三号元素 所以发现异常
        System.out.println(array[3]);
    }
}
