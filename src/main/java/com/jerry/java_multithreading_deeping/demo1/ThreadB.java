package com.jerry.java_multithreading_deeping.demo1;

public class ThreadB extends Thread{
    public Worker worker;
    public ThreadB(Worker worker){
        this.worker =worker;
    }
    @Override
    public void run() {
        worker.work();
    }
}
