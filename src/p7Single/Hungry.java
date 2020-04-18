package p7Single;

/**
 * 饿汉式, 单例模式的特点就是构造器私有
 * 线程安全
 * @ClassName Hungry
 * @Description: TODO
 * @Author zeng
 * @Date 2020/4/13
 **/
public class Hungry {

    //可能会浪费空间
    private byte[] data1 = new byte[1024*1024];
    private byte[] data2 = new byte[1024*1024];
    private byte[] data3 = new byte[1024*1024];

    private Hungry(){

    }

    //饿汉式, 一上来就加载对象, 可能会占用许多空间, 于是我们希望能在使用时才加载对象,于是出现了懒汉式
    private final static Hungry HUNGRY = new Hungry();

    public static Hungry getInstance(){
        return HUNGRY;
    }

    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(Hungry.getInstance());
            }).start();
        }
    }
}


