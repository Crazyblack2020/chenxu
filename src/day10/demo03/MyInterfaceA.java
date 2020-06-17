package day10.demo03;

public interface MyInterfaceA {

    public abstract void methodA();

    public abstract void Common();

    public default void methodC() {

        System.out.println("aaaa");
    }
}
