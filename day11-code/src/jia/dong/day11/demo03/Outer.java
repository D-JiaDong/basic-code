package jia.dong.day11.demo03;
//如果出现了重名现象 那么格式：外部类名称.this.外部类成员变量名
public class Outer {
    int num=10;
    public class Inner{
        int num=20;
        public void methodInner(){
            int num=30;//内部类方法的局部变量
            System.out.println(num);//局部变量 就近原则
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }

    }
}
