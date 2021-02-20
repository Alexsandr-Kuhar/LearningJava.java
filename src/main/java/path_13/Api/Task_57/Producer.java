package main.java.path_13.Api.Task_57;

import java.util.Random;

public class Producer implements Runnable {
    private Queue queue;

    public Producer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        Random rand = new Random(100);
        while (!false) {
            try {
                Thread.sleep(rand.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            queue.add(rand.nextInt(100));
            System.out.println("Очередь элемента размер: "+ queue.getElementsCount());
        }
    }
}
