package ru.lemito;

class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread1");
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread2");
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();

        th1.start();
        th2.start();
    }
}
