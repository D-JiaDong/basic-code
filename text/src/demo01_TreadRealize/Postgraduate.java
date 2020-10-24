package demo01_TreadRealize;

public class Postgraduate extends Student {
    private String Research;

    public Postgraduate(String name, int age,String research) {
        super(name, age);
        this.Research=research;
    }

    public String toString() {
        return "Postgraduate{" +
                "Research='" + Research + '\'' +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }
}
