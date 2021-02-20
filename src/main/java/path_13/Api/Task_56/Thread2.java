package main.java.path_13.Api.Task_56;

import main.java.path_13.Task_56;

public class Thread2 extends Thread {
    public void run() {
        synchronized (Task_56.Lock2) {
            System.out.println("Thread2 Удержание lock 2... ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            System.out.println("Thread2 Ожидание for lock 1...");
            synchronized (Task_56.Lock1) {
                System.out.println("Thread 2: Удержание lock 1 and 2");
                synchronized (Task_56.Lock3) {
                    System.out.println("Thread 2: Удержание lock 1 and 2 and 3");
                }
            }
        }
    }
}
