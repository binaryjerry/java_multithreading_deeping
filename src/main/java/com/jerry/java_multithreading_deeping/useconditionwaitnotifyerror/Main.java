package com.jerry.java_multithreading_deeping.useconditionwaitnotifyerror;

public class Main {

    public static void main(String[] args) {
        Worker worker = new Worker();
        ThreadA threadA = new ThreadA(worker);
        worker.singal();
        threadA.start();

    }
}
