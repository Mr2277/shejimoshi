package com.shejimoshi.adapter.Class;

public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        System.out.println("我是适配器类 我能适配任何两孔插座 让它正常工作");
        this.specificRequest();

    }
}
