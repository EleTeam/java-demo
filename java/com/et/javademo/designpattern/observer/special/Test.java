package com.et.javademo.designpattern.observer.special;

public class Test {

    public static void main(String[] args) {
        ClickListener listener = new ClickListenerImpl();

        ClickSource clickSource = new ClickSource();
        clickSource.addListener(listener);
        clickSource.addListener(new ClickListener() {
            @Override
            public void handleEvent(ClickEvent event) {
                System.out.println("匿名监听器");
            }
        });

        clickSource.notifyListeners();
    }

}
