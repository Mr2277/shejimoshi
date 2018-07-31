package com.shejimoshi.facade.one;

public class computer {
    private cpu c;
    private disk d;
    private meory m;
    public computer(){
        c=new cpu();
        d=new disk();
        m=new meory();
    }
    public void start(){
        c.start();
        d.start();
        m.start();
    }
}
