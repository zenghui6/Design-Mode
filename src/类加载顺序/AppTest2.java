package 类加载顺序;

public class AppTest2 {
    static {
        System.out.println("1");
    }
    {
        System.out.println("2");
    }

    AppTest2(){
        System.out.println("3");
        System.out.println("a="+a+",b="+b);
    }
    public static void f1(){
        System.out.println("4");
    }

    int a= 110;
    static int b =112;

    public static void main(String[] args) {
//        f1();   //会触发一次类加载，但不会触发实例化构造器
//        f1();
        new AppTest2(); //实例化
    }
}
