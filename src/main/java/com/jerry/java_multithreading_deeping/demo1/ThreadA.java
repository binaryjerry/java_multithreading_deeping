package com.jerry.java_multithreading_deeping.demo1;

public class ThreadA extends Thread{
    public Worker worker;
    public ThreadA(Worker worker){
        this.worker = worker;
    }
    @Override
    public void run() {
        worker.work();
    }
}
