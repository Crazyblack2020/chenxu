package day10.demo01;

/*
从Java 8开始，接口当中允许定义静态方法。
格式：
public static 返回值类型 方法名称（参数列表）{

}
提示： 就是将abstract或者default换成static即可，带上方法体。

 */
public interface MyInterfaceStatic {

    public static void methodStatic() {
        System.out.println("这是一个静态方法！！！");
    }

}
