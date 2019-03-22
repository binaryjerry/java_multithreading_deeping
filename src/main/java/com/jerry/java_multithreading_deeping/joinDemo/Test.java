package com.jerry.java_multithreading_deeping.joinDemo;

public class Test {

    public static void main(String[] args) {

        MyThread thread = new MyThread();
        thread.start();
        try {
            thread.join();
            System.out.println("我想当thread执行完了之后我再执行");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //小结：方法join具有排队运行的作用，有些类似于同步的运行效果，join和synchronized的区别

    //join在内部使用wait方法进行等待，而synchronized使用的是“对象监视器”原理同步
}
