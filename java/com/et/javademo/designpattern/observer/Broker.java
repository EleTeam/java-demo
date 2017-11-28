package com.et.javademo.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class Broker implements Observer {

    private String name;

    public Broker(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof Stock && arg instanceof Integer) {
            if (arg.equals(1)) {
                System.out.println(this.name + " 说 : "
                        + ((Stock) observable).getName() + "涨到 " + ((Stock) observable).getPrice() + "元了 ！");
            } else if (arg.equals(-1)) {
                System.out.println(this.name + " 说 : "
                        + ((Stock) observable).getName() + "降到 " + ((Stock) observable).getPrice() + "元");
            }
        }
    }

    public String getName() {
        return name;
    }

}
