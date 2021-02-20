package main.java.path_13;

import main.java.path_13.Api.Task_57.Consumer;
import main.java.path_13.Api.Task_57.Producer;
import main.java.path_13.Api.Task_57.Queue;

public class Task_57 {
    public static void main(String[] args) throws InterruptedException {
        Queue queue = new Queue(200);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(producer);
        Thread t3 = new Thread(producer);

        Thread t4 = new Thread(consumer);
        Thread t5 = new Thread(consumer);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        System.out.println("OK");
    }
}

