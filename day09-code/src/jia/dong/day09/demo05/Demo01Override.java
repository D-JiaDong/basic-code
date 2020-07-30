package jia.dong.day09.demo05;
/*
* 方法覆盖重写的注意事项
* 1，必须保证父子类之间方法的名称相同 参数列表也相同
* @Override 写在方法前边 用来检测是不是有效的正确覆盖重写 注解
* 这个注解就算不写 只要满足要求 也是正确的覆盖重写
* 2，子类方法的返回值 必须小于等于父类方法的返回值范围
* 扩展提示：java.long.Object类是所有类的公共最高父类（祖宗类），java.long.String就是Object的子类
* 3，子类方法的权限必须大于等于父类方法的权限修饰符
* 扩展：public>protect>(default)private
* 备注：default不是关键字 而是什么都不写 留空
* */
public class Demo01Override {
}
