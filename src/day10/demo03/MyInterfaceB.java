package day10.demo03;

public interface MyInterfaceB {

    public abstract void methodB();

    public abstract  void Common();


    public default void methodC() {

        System.out.println("bbbb");
    }
}
