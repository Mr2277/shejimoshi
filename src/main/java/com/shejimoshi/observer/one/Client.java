package com.shejimoshi.observer.one;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject();
        FirstObserver f = new FirstObserver(subject);
        SecondObserver s =new SecondObserver(subject);
        f.update();
        s.update();
        subject.setState(39);

    }

}
