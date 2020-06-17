package day10.demo06;

/*
向上转型一定是安全的，没有问题，正确的。但是也有一个弊端。
对象一旦向上转型为父类，那么久无法调用子类原本特有的内容。

解决方法：用对象的向下转型【还原】
 */
public class Demo01Main {

    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.eat();

        Cat cat = (Cat)animal;
        cat.eat();
        System.out.println();
    }


}
