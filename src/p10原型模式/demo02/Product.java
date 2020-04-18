package p10原型模式.demo02;

import java.util.Date;

/**
 * @ClassName Product
 * @Description: 原型模式, 浅拷贝, 1. 实现Cloneable接口, 重写 clone() 方法
 * @Author zeng
 * @Date 2020/4/18
 **/
public class Product implements Cloneable{
    String name;
    Date creatDate;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //实现深拷贝的最简单方法就是, clone时将属性的引用对象也clone一份
        Object object= super.clone();
        Product product = (Product) object;

        product.setCreatDate((Date) this.creatDate.clone());
        return product;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", creatDate=" + creatDate +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }
}
