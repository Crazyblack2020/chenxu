public class idoit {
}
/*

5.24

数组工具类：Arrays

由于Arrays是util中的类所以需要引用
Arrays的使用暂时知道两种：1. Arrays.toString（）   这种是将数组转变成字符串
                        2. Arrays.sort（）     这种是将数组中的数字或者字符串（字母）进行排序

Math数学工具常用的操作
1. abs  获取绝对值，有多种重载。
2. ceil 向上取整。
3. floor 向下取整。
4. round 四舍五入

Mat.PI代表近似圆周率常量


5.25

继承的使用：
分为父类与子类 其中子类就是父类 父类内的东西子类都可以使用 子类内自己特有的的东西父类不能使用。

父类 子类的使用： 父类的创建：public class 父类名称{       }
                子类的创建：public class 子类名称 extends 父类名称{      }

使用时 先创建对象 例如 Fu fu = new Fu（）；  再进行使用

可用子类对象访问
也可用成员方法访问调用

局部变量
本类变量
父类变量

6.3

类与类之间的继承是一个对一个，一个类只能有一个上属父类。
类与接口之间，一个类可以接多个接口。
接口与接口之间是多实现的，一个接口可以继承多个接口

接口当中的抽象方法表达式：  public abstract void 方法名 （）;
接口当中的默认方法表达式： public default void 方法名（） { 方法体  };

父接口当中有重复的抽象方法就是【abstract方法】是可以的，但是不能有重复的默认方法就是【default方法】
如果有重复的默认方法则在子接口中进行【覆盖】



6.4

向上转型：Animal animal = new Cat();
向下转型：Cat cat = (Cat)Animal;


 */
