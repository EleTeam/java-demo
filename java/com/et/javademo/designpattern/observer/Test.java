package com.et.javademo.designpattern.observer;

public class Test {

    public static void main(String[] args) {
        Broker tony = new Broker("tony");
        Broker trace = new Broker("trace");

        Stock stock = new Stock("中海股", 1.0f);
        stock.addObserver(tony);
        stock.addObserver(trace);

        stock.setPrice(9.9f);
        try {
            Thread.sleep(1000);
        } catch( InterruptedException e) {
            System.out.println("Sleep interrupeted" );
        }
        stock.setPrice(2.9f);
        try {
            Thread.sleep(1000);
        } catch( InterruptedException e) {
            System.out.println("Sleep interrupeted" );
        }
        stock.setPrice(2.9f);
        try {
            Thread.sleep(1000);
        } catch( InterruptedException e) {
            System.out.println("Sleep interrupeted" );
        }
        stock.setPrice(3.9f);
        try {
            Thread.sleep(1000);
        } catch( InterruptedException e) {
            System.out.println("Sleep interrupeted" );
        }
        stock.setPrice(34.9f);
    }

}
