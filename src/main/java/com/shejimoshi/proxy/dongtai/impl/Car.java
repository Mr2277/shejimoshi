package com.shejimoshi.proxy.dongtai.impl;

import com.shejimoshi.proxy.dongtai.imp.Moveable;

import java.util.Random;

public class Car implements Moveable{
    public void move() throws Exception {
        Thread.sleep(new Random().nextInt(1000));
        System.out.println("汽车行驶中…");
    }
}
