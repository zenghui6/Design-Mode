package 类加载顺序;

public class AppTest {
    public static void main(String[] args) {
        AppTest.f1();   // 类加载　　2 3  a=110,b=0 1 4
//        new AppTest(); //类加载和实例化，2 ,3 ,a=110, b=0, 1, 2, 3, a=110, b=112
    }

    static AppTest t = new AppTest();   //这里只是调用了构造器，
    static {
        System.out.println("1");
    }
    {
        System.out.println("2");
    }

    AppTest(){
        System.out.println("3");
        System.out.println("a="+a+",b="+b);
    }
    public static void f1(){
        System.out.println("4");
    }

    int a= 110;
    static int b =112;
}
