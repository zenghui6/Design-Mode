package p4依赖倒置原则.Positive;

public class DIP {
    interface Annimal{
        void eat();
    }

    static class Dog implements Annimal{
        @Override
        public void eat() {
            System.out.println("狗啃骨头");
        }
    }

    class Cat implements Annimal{
        @Override
        public void eat() {
            System.out.println("猫吃老鼠");
        }
    }

    class person {
        void feed(Annimal annimal){
            System.out.println("开始");
            annimal.eat();
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();


    }

}
