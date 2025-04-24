package org.example1.observer;

public class MobileDevice implements Observer{
    @Override
    public void update(String s) {
        System.out.println("Mobile device received weather update: " + s);

    }
}
