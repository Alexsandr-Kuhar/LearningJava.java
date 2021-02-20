package main.java.path_13.Api.Task_56;

import main.java.path_13.Task_56;

public class Thread1 extends Thread {
    public void run() {
        synchronized (Task_56.Lock1) {
            System.out.println("Thread1 Удержание lock 1... ");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
            System.out.println("Thread1 Ожидание for lock 3...");
            synchronized (Task_56.Lock3) {
                System.out.println("Thread 1: Удержание lock 1 and 2");
                synchronized (Task_56.Lock2) {
                    System.out.println("Thread 1: Удержание lock 1 and 2 and 3");
                }
            }
        }
    }
}
