package com.shejimoshi.proxy.one.two;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHandler implements InvocationHandler{
    private Object target;
    public Object newProxyHandler(Subject subject){
        target=subject;
        Class<?> classType = target.getClass();
        return  Proxy.newProxyInstance(classType.getClassLoader(), classType.getInterfaces(), this);
     }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //return null;
        System.out.print("I'm Proxy, I'm invoking...");
        Object object = method.invoke(target, args);
        //System.out.println(object);
        return object;
    }
}
