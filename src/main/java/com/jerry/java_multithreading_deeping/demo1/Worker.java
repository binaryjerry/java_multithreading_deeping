package com.jerry.java_multithreading_deeping.demo1;

import java.util.concurrent.locks.ReentrantLock;

public class Worker {
    private ReentrantLock reentrantLock = new ReentrantLock();
    public void work(){
        reentrantLock.lock();
        System.out.println(Thread.currentThread().getName()+""+System.currentTimeMillis());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        reentrantLock.unlock();
    }
}
