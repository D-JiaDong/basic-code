package jia.dong.day07.demo05;


import java.sql.SQLOutput;
import java.util.ArrayList;

/*题目：
 定义以指定格式打印集合的方式（ArrayList类型作为参数）使用{}括起集合 使用@分隔每个元素
 格式参照{元素@元素@元素}
 System.out.println(list);
 printArrayList(list)
 */
public class Demo02ArrayListPrint{
     public static void main(String[] args) {
         ArrayList<String> list=new ArrayList<>();
         list.add("张三");
         list.add("李四");
         list.add("王五");
         list.add("赵六");
         System.out.println(list);
         printArrayList(list);
     }
     public static void printArrayList(ArrayList<String> list){
         System.out.print("{");
         for (int i = 0; i < list.size(); i++) {
             String name=list.get(i);
             if(i!=list.size()-1)
                System.out.print(name+"@");
             else
                 System.out.print(name);
         }
         System.out.println("}");
     }
 }

 /*
 * 定义方法的三要素
 * 返回值类型：只是打印而已 没有运算 没有结果 所以用void
 * 方法名称：printArrayList
 * */