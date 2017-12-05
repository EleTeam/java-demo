package com.et.javademo;

public class Add {

    public static void main(String[] args) {
        byte a = 100;
        byte b = 101;
//        b = a + b; //编译出错：Error:(8, 15) java: 不兼容的类型: 从int转换到byte可能会有损失
        b += a;
        System.out.println(b);
    }

}
