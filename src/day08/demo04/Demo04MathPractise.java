package day08.demo04;

/*

题目：
计算在-10.8 到 5.9之间，绝对值大于6或者小于2.1的整数有多少个？

分析：
1. 既然已经确定了范围，for循环
2. 起点位置 -10.8应该转换成为-10
 */
public class Demo04MathPractise {

    public static void main(String[] args) {

        int count = 0; //符合要求的个数

        double min = -10.8;
        double max = 5.9;
        //这样处理，变量i就是区间之间所有的整数
        for(int i = (int)min; i < max; i++){
            int abs = Math.abs(i);
            if (abs > 6 || abs < 2.1){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("总共有：" + count);
    }
}
