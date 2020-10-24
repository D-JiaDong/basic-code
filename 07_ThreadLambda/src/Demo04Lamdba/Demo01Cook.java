package Demo04Lamdba;

public class Demo01Cook {
    public static void main(String[] args) {
        invokeCoke(new Cook() {
            @Override
            public void makefood() {
                System.out.println("。。。。。");
            }
        });

        //使用Lamdba表达式
        invokeCoke(()->{
            System.out.println("。。。。。");
        });
    }
    public  static void invokeCoke(Cook cook){
        cook.makefood();
    }
}
