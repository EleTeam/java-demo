package com.et.javademo.helloworld;

import com.et.javademo.helloworld.impl.HumanImpl;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Human human = new HumanImpl();
        System.out.println(human.eat());
        System.out.println(System.getProperty("user.dir"));
        try {
            Class<?> clazz = Class.forName("com.et.javademo.helloworld.HelloWorld");
            System.out.println("");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
