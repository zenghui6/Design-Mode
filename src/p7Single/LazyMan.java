package p7Single;

import java.lang.reflect.Constructor;

/**
 * 懒汉式,在我们要用的时候才去加载, 线程不安全
 * DCL懒汉式, 双重锁懒汉式, 线程安全;
 *
 * @ClassName LazyMan
 * @Description: TODO
 * @Author zeng
 * @Date 2020/4/13
 **/
public class LazyMan {

    private LazyMan(){
        System.out.println(Thread.currentThread().getName()+"ok");
    }

    private volatile static LazyMan lazyMan;

    //为空才去加载创建
    public static  LazyMan getInstance(){

        //双重检测锁模式的 懒汉式单例 DCL懒汉式
        if (lazyMan == null){
            synchronized (LazyMan.class){
                if (lazyMan == null){
                    lazyMan = new LazyMan();    //它不是一个原子性操作
                    /**
                     * 1. 分配内存空间
                     * 2. 执行构造方法, 初始化对象
                     * 3. 把这个对象指向这个空间
                     * 有可能会发生指令重排 123 => 132 A 此时线程 B 进入 lazyMan!=null 但还没有完成构造
                     * 所有要禁止指令重排序 volatile
                     */
                }
            }
        }
        return lazyMan;
    }

    public static void main(String[] args) throws Exception {
       LazyMan instance1 = LazyMan.getInstance();

        Constructor<LazyMan> declaredConstructors = LazyMan.class.getDeclaredConstructor(null);
        declaredConstructors.setAccessible(true); //设置访问权限,无视了私有的构造器
        LazyMan instance2 = declaredConstructors.newInstance();

        System.out.println(instance1);
        System.out.println(instance2);
    }
}
