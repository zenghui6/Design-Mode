package p8工厂模式.method;

/**
 * @ClassName BMWFactory
 * @Description: TODO
 * @Author zeng
 * @Date 2020/4/15
 **/
public class BMWFactory implements IFactory {
    @Override
    public Car makeCar() {
        return new BMW();
    }
}
