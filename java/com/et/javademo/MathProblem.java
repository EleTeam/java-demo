package com.et.javademo;

public class MathProblem {

    public static void main(String[] args) {
        byte a = 100;
        byte b = 101;
//        b = a + b; //编译出错：Error:(8, 15) java: 不兼容的类型: 从int转换到byte可能会有损失
        b += a;
        System.out.println(b);

        System.out.println("---------------");
        System.out.println(3*0.1 == 0.3);
        System.out.println(3*0.1);
        System.out.println(0.3);

        System.out.println("---------------");
        System.out.println(3+0.1 == 3.1);
        System.out.println(3+0.1);

        System.out.println("---------------");
        System.out.println(3-0.1 == 2.9);
        System.out.println(3-0.1);
    }

}
