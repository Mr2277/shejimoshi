package com.shejimoshi.proxy.jingtai;

import com.shejimoshi.proxy.jingtai.imp.Iuser;
import com.shejimoshi.proxy.jingtai.impl.UserImpl;

public class UserProxy implements Iuser {
    private Iuser user = new UserImpl();

    public void eat(String s) {
        System.out.println("静态代理前置内容");
        user.eat(s);
        System.out.println("静态代理后置内容");

    }
}
