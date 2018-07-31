package com.shejimoshi.proxy.one;

public class Proxy implements Subject{
    private Subject target;
    @Override
    public void operate() {
        target=new RealSubject();
        target.operate();
    }
}
