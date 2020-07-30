package jia.dong.day11.demo03;

public class Body {
    //内部类
    public class Heart{//成员内部类
        //内部类方法
        public void beat(){
            System.out.println("心脏跳动");
            System.out.println("我叫："+name);
        }
    }


    private String name;
    //外部类方法
    public void methodBody(){
        System.out.println("外部类方法");
        Heart heart=new Heart();
        heart.beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
