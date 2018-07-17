package com.shejimoshi.singleton.one;

public class Singleton {
    private static Singleton singleton;
    private static Singleton newInstance(){
        if(singleton == null){
           singleton= new Singleton();
        }
        return singleton;
        }
}
