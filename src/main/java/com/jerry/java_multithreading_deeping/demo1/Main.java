package com.jerry.java_multithreading_deeping.demo1;

public class Main {

    public static void main(String[] args) {
        Worker worker = new Worker();
        ThreadA a = new ThreadA(worker);
        ThreadB b = new ThreadB(worker);
        a.start();
        b.start();
    }
}
