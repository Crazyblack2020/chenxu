package day09.demo02;


public class Demo01ExtendsField {
    public static void main(String[] args) {

        Fu fu = new Fu();

        System.out.println(fu.numFu);
        System.out.println("========");


        Zi zi = new Zi();
        System.out.println(zi.numZi);
        System.out.println(zi.numFu);
        System.out.println("========");

        System.out.println(zi.num);
        System.out.println(fu.num);
        System.out.println("=========");

        zi.methodZi();

    }
}
