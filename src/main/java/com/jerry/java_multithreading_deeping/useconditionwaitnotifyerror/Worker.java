package com.jerry.java_multithreading_deeping.useconditionwaitnotifyerror;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Worker {

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await(){
        try {
            lock.lock();
            System.out.println("1");
            condition.await();
            System.out.println("1.1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
            System.out.println("测试提交");
            System.out.println("2");
        }
    }

    public void singal(){
        lock.lock();
        condition.signal();
        System.out.println("3");
        lock.unlock();
    }
}
