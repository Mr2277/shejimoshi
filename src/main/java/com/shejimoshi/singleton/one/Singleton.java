package com.shejimoshi.singleton.one;

public class Singleton {
    private static Singleton singleton;
    public static Singleton newInstance(){
        if(singleton == null){
           singleton= new Singleton();
        }
        return singleton;
        }
}
