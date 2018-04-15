package com.shejimoshi.singleton;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSingleton {
    /*
    boolean lock ;

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    public static void main(String[] args) throws InterruptedException {
        final Set<String> instanceSet = Collections.synchronizedSet(new HashSet<String>());
        final TestSingleton lock = new TestSingleton();
        lock.setLock(true);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            executorService.execute(new Runnable() {

                public void run() {

                    while (true) {

                        boolean flag = !lock.isLock();

                        System.out.println(Thread.currentThread().getName() + " " + flag);

                        if (flag) {

                            Singleton singleton = Singleton.getInstance();

                            instanceSet.add(singleton.toString());

                            break;

                        }

                    }
                }
            });
        }
        Thread.sleep(5000);
        lock.setLock(false);
        Thread.sleep(5000);
        System.out.println("------并发情况下我们取到的实例------");
        for (String instance : instanceSet) {
            System.out.println(instance);
        }
        executorService.shutdown();
    }
    */

    public static void main(String[] args) throws InterruptedException {



        final Set<String> set = Collections.synchronizedSet(new HashSet<String>());

        final CountDownLatch cdl = new CountDownLatch(1);



        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 10000; i++) {

            executor.execute(new Runnable() {



                public void run() {

                    try {

                        cdl.await();



                        Singleton singleton = Singleton.getInstance();

                        set.add(singleton.toString());

                    } catch (InterruptedException e) {

                        e.printStackTrace();

                    }

                }

            });

        }





        Thread.sleep(1000);

        cdl.countDown();

        Thread.sleep(1000);



        System.out.println("一共有" + set.size() + "个实例");

        for (String str : set) {

            System.out.println(str);

        }



        executor.shutdown();



    }



}
