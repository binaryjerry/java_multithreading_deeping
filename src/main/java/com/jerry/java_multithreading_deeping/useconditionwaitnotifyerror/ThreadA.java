package com.jerry.java_multithreading_deeping.useconditionwaitnotifyerror;

public class ThreadA extends Thread{
    private Worker worker;
    public ThreadA(Worker worker){
        this.worker = worker;
    }

    @Override
    public void run() {
        worker.await();
    }
}
