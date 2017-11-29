package com.et.javademo.designpattern.observer.special;

public class ClickListenerImpl implements ClickListener {

    public void handleEvent(ClickEvent event) {
        System.out.println("Event handled");
        System.out.println("Event name: " + event.getName());
    }

}
