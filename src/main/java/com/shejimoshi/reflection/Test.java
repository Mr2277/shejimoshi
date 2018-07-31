package com.shejimoshi.reflection;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class  cls=Class.forName("com.shejimoshi.reflection.Person");
        Method[] method=cls.getDeclaredMethods();
        for(Method m:method){
            System.out.println(m);
        }
    }
}
