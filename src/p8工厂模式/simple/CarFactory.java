package p8工厂模式.simple;

/**
 * @ClassName CarFactory
 * @Description: TODO
 * @Author zeng
 * @Date 2020/4/15
 **/
public class CarFactory {

    private Car getCar(String carName){
        if (carName.equals("Wuling")){
            return new Wuling();
        }else if (carName.equals("BMW")){
            return new BMW();
        }
        return null;
    }
}
