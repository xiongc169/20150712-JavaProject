package com.yoong.jvm.book01;

import java.util.List;

/**
 * @Desc 《深入理解Java虚拟机·JVM高级特性与实践》
 * PS：第十章、早期(编译期)优化
 * <p>
 * @Author yoong
 * <p>
 * @Date 2016-04-01 09:00:00
 * <p>
 * @Version 1.0
 */
public class Chap10 {

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        try {
            method1003(null);
            method1003A(null);
            box_foreach100302();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * 10.3.1、泛型与类型擦除
     * 'method1003(List<String>)' clashes with 'method1003(List<Integer>)'; both methods have same erasure
     */
    public static void method1003(List<String> list) {
        System.out.println("invoke method1003(List<String> list)");
    }

    //public static void method1003(List<Integer> list) {
    //    System.out.println("invoke method1003(List<Integer> list)");
    //}

    /**
     * 'method1003A(List<Integer>)' clashes with 'method1003A(List<String>)'; both methods have same erasure
     */
    public static String method1003A(List<Integer> list) {
        System.out.println("invoke method1003A(List<Integer> list)");
        return "";
    }

    //public static int method1003A(List<String> list) {
    //    System.out.println("invoke method1003A(List<String> list)");
    //    return 1;
    //}

    /**
     * 包装类的 ==运算 在不遇到算术运算的情况下，不会自动拆箱，它们的 equals()方法 不处理数据转型的关系。 (P316)
     */
    public static void box_foreach100302() {
        final String aaaa = "aa";
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3l;
        System.out.println(c == d);//true
        System.out.println(e == f);//false
        System.out.println(c == (a + b));//true
        System.out.println(c.equals(a + b));//false -> true
        System.out.println(g == (a + b));//true
        System.out.println(g.equals(a + b));//false
    }
}
