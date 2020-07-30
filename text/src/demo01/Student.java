package demo01;

public class Student {
    protected  String Name;
    protected int Age;

    public Student(String name, int age) {
        Name = name;
        Age = age;
    }

    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }
}
