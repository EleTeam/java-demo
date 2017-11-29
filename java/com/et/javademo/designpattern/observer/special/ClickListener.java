package com.et.javademo.designpattern.observer.special;

import java.util.EventListener;

public interface ClickListener extends EventListener {

    void handleEvent(ClickEvent event);

}
