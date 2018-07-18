package com.shejimoshi.observer.one;

public class FirstObserver extends Observer {
    public FirstObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    void update() {
        System.out.println("current state is"+this.subject.getState()+19);
        }

}
