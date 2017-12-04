package com.et.javademo.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorThread {

    public ExecutorThread() {
//        ExecutorService es = Executors.newCachedThreadPool();
        ExecutorService es = Executors.newFixedThreadPool(10);
        for (int i=0; i<5; i++) {
            es.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
    }

    public static void main(String[] args) {
        new ExecutorThread();
    }

}
