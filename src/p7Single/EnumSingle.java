package p7Single;

//enum 是什么?
//本身也是一个 Class类
public enum EnumSingle {

    INSTANCE;

    public static EnumSingle getInstance(){
        return INSTANCE;
    }
}

class Test{
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(EnumSingle.getInstance().getClass());
            }).start();
        }
    }
}
