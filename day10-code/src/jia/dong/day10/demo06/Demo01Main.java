package jia.dong.day10.demo06;
/*
* 向上转型一定是安全的 没有问题的 正确的 但是也有一个弊端
* 对象一旦向上转型为父类 那么就无法调用子类原本特有内容
*
* 解决方法：用对象的向下转型还原
* */
public class Demo01Main {
    public static void main(String[] args) {
        Animal animal=new Cat();
        animal.eat();

        Cat cat=(Cat)animal;
        cat.catchMouse();

//        Dog dog=(Dog)animal;//错误写法

    }
}
