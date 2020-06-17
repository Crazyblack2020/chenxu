package day10.demo01;

/*
从Java 8开始，接口里允许默认方法。
格式：
public default 返回值类型 方法名称（参数列表） {
        方法体
}

备注： 接口当中的默认方法，可以解决接口升级的问题。
 */
public interface MyInterfaceDefault {
    public abstract void methods1();

//    public abstract  void methods2();

    // 新添加的方法，改成默认方法

    public default void methodDefault() {
        System.out.println("接口实现成功!!!");
    }

}
