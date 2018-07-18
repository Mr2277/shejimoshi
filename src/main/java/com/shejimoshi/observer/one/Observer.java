package com.shejimoshi.observer.one;

public abstract class Observer {
    //心中要有老大
    protected Subject subject;
    //接受老大的提示，执行行动
    abstract void update();

}
