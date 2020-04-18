package p7Single;

/**静态内部类
 * @ClassName Holder
 * @Description: TODO
 * @Author zeng
 * @Date 2020/4/13
 **/
public class Holder {
    private Holder(){

    }

    public static Holder getInstance(){
        return InnerClass.HOLDER;
    }

    private static class InnerClass{
        private static final Holder HOLDER = new Holder();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(LazyMan.getInstance());
            }).start();
        }
    }
}
