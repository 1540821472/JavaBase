package com.b_practice;

/**
 * 基本运算符和逻辑运算符
 *
 * @Author: 孙江栋
 */
public class Operator {
    public static void main(String[] args) {
        int a = 1;
        int b = a++;// b=1 a=2
        int c = ++a;// c=3,a=3
        System.out.println(b);
        System.out.println(c);
    }

    public static void test() {
        byte a = 3, b = 4, c, d;
//      c = a + b; //报错，Java内部机制，防止两个数相加超出byte范，所转换成int类型再相加，相加的结果也是int，int类型不能直接赋值给byte变量
        d = 3 + 4;//不报错，常量赋值给变量时，会自动匹配类型

        int i = 3;
        int j = 4;
        System.out.println(i > j && ++j > 2);//因为3>4为false，右边的++j>2不运行
        System.out.println(i);//3
        System.out.println(j);//4
    }
}
