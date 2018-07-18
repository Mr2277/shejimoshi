package com.shejimoshi.adapter.O;

public class Adapter implements Target {
    // 直接关联被适配类
    private Adaptee adaptee;

    // 可以通过构造函数传入具体需要适配的被适配类对象
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        // 这里是使用委托的方式完成特殊功能
        System.out.println("我是适配器类 我能适配任何两孔插座 让它正常工作");
        this.adaptee.specificRequest();
    }

}
