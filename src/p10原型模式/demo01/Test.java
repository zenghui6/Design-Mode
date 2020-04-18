package p10原型模式.demo01;

import java.util.Date;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author zeng
 * @Date 2020/4/18
 **/
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Product product1 = new Product();
        product1.setName("可口可乐");
        product1.setCreatDate(date);

        Product product2 =(Product) product1.clone();
        System.out.println(product1);
        System.out.println(product2);

        System.out.println("==================================");
        product1.setName("百事可乐");
        date.setTime(1231314);

        System.out.println(product1);
        System.out.println(product2);
    }
}
