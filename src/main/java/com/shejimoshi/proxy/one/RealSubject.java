package com.shejimoshi.proxy.one;

public class RealSubject implements Subject {
    @Override
    public void operate() {
        System.out.println("RealSubject");
    }
}
