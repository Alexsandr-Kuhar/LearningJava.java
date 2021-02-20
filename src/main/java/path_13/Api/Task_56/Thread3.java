package main.java.path_13.Api.Task_56;

import main.java.path_13.Task_56;

public class Thread3 extends Thread {
    public void run() {
        synchronized (Task_56.Lock3) {
            System.out.println("Thread3 Удержание lock 3... ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            System.out.println("Thread3 Ожидание for lock 2...");
            synchronized (Task_56.Lock1) {
                System.out.println("Thread 3: Удержание lock 1 and 2");
                synchronized (Task_56.Lock2) {
                    System.out.println("Thread 3: Удержание lock 1 and 2");
                }
            }
        }
    }
}
