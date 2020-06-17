package day10.demo01;


public interface MyInterfacePrivateB {

    public static void methodDefult1() {
        System.out.println("静态方法1");
     methodStaticCommon();


    }

    public static void methodDefult2() {
        System.out.println("静态方法2");
       methodStaticCommon();

    }


    private static void methodStaticCommon() {
        System.out.println("aaaa");
        System.out.println("bbbb");
        System.out.println("cccc");

    }
}
