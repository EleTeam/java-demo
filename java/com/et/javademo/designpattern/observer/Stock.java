package com.et.javademo.designpattern.observer;

import java.util.Observable;

public class Stock extends Observable {

    private String name;
    private float price;

    public Stock(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price > this.price) {
            this.price = price;
            setChanged();
            notifyObservers(1);
        } else if (price < this.price) {
            this.price = price;
            setChanged();
            notifyObservers(-1);
        }
    }

}
