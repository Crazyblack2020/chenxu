package day11.demo01;

/*
final关键字代表最终，不可改变的。

常见四种用法：
1. 可以用来修饰一个类
2. 可以用来修饰一个方法
3. 还可以用来修饰一个局部变量
4. 还可以用来修饰一个成员变量
 */
public class Demo01Final {


    public static void main(String[] args) {

        int num1 = 100;
        System.out.println(num1);

        num1 = 300;
        System.out.println(num1);

        final int num2 = 400;
        System.out.println(num2);


        Student stu = new Student("江");

        System.out.println(stu);

        System.out.println(stu.getName());

        final Student stu1 = new Student("你好呀！！");

        stu1.setName("你不好呀！！！");






    }



}
