package com.et.javademo.designpattern.observer.special;

import java.util.Vector;

public class ClickSource {

    private Vector<ClickListener> listeners = new Vector();

    public void addListener(ClickListener listener) {
        listeners.add(listener);
    }

    public void notifyListeners() {
        for (ClickListener listener : listeners) {
            ClickEvent event = new ClickEvent(this);
            listener.handleEvent(event);
        }
    }

}
