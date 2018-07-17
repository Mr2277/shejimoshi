package com.shejimoshi.singleton.one;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

public class SingletonTest {
    private Singleton singletona=Singleton.newInstance();
    private Singleton singletonb=Singleton.newInstance();
   @Test
    public void testSingleton(){
       //assertEquals(singletona,singletonb);
       assertSame(singletona,singletonb);

   }
}
