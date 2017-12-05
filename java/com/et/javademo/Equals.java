package com.et.javademo;

public class Equals {

    public static void main(String[] args) {
        System.out.println(1 == new Integer(1));
        System.out.println(new Integer(1) == 1);
        System.out.println(new Integer(1) == new Integer(1));
    }

}
