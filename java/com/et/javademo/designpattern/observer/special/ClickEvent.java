package com.et.javademo.designpattern.observer.special;

import java.util.EventObject;

public class ClickEvent extends EventObject {

    private final String name = "ClickButton";

    public ClickEvent(ClickSource source) {
        super(source);
    }

    public String getName() {
        return name;
    }
}
