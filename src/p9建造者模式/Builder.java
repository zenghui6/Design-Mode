package p9建造者模式;

/**
 * @ClassName Builder
 * @Description: TODO
 * @Author zeng
 * @Date 2020/4/16
 **/
//建造者
public abstract class Builder {

    abstract  Builder builderA(String msg); // 汉堡
    abstract  Builder builderB(String msg); // 可乐
    abstract  Builder builderC(String msg); // 薯条
    abstract  Builder builderD(String msg); // 甜点

    abstract  Product getProduct();
}
