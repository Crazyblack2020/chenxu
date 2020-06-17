package day09.demo03;

public class Zi extends Fu{

    int num = 10101;

    public void method() {
        int num = 1010101;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
