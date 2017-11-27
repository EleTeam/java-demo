package com.et.javademo;

import com.et.javademo.impl.HumanImpl;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Human human = new HumanImpl();
        System.out.println(human.eat());
    }

}
