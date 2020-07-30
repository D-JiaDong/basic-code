package demo01;

public class Test {
    public static void main(String[] args) {
        Student s1=new Student("张三",19);
        Student s2=new Postgraduate("王五",21,"人工智能");
        Student s3=new Student("李四",20);
        Student[] students={s1,s2,s3};
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
