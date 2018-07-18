package com.shejimoshi.observer.one;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    //既然是老大，那就必须要有小弟
    private List<Observer> observer = new ArrayList<Observer>();
    //老大的状态
    private int state;

    public int getState(){
        return state;
    }
    //当老大的状态发生改变的时候，得通知小弟去搞事情吧
    public void setState(int state){
        this.state = state;
        notifyAllObserver();
    }
    //每一天都有要新加入的小弟
    public void attach(Observer observer){
        this.observer.add(observer);

    }
    //有公告要通知每个小弟
    public void notifyAllObserver(){
        for(Observer observer : this.observer){
            observer.update();
        }
    }

}
