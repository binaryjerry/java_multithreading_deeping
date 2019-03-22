package com.jerry.java_multithreading_deeping.demo2;

public class Main {

    public static void main(String[] args) {

        MyThread threadTest = new MyThread();
        threadTest.start();
        System.out.println("我想当threadTest执行完毕之后我再执行");
        System.out.println("");
        System.out.println("不能确定sleep多久");
    }
}
