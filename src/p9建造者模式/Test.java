package p9建造者模式;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author zeng
 * @Date 2020/4/16
 **/
public class Test {
    public static void main(String[] args) {
        //服务员
        Worker worker = new Worker();

        //默认,不指定参数
        Product product = worker.getProduct();
        System.out.println(product.toString());

        //指定建造的材料
        Product product1 = worker.builderA("老八小憨堡")
                .builderB("雪碧")
                .getProduct();
        System.out.println(product1.toString());
    }
}
