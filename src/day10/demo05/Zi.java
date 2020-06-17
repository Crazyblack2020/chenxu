package day10.demo05;

public class Zi extends Fu {

    int num = 20;

    @Override
    public void method() {
        System.out.println(num);
    }

    public void methodZi() {

        System.out.println("子类特有方法");
    }
}
