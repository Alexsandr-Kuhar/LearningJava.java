package main.java.path_13.Api.Task_57;

import java.util.Random;

public class Consumer implements Runnable {

    private volatile Queue queue;
    private  boolean ready = false;

    public Consumer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        Random rand = new Random();

        while (!ready) {
            try {
                Thread.sleep(rand.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            queue.remove();
            System.out.println("Очередь элемента размер: "+ queue.getElementsCount());
        }
        System.out.println("Конец потребителя  " + Thread.currentThread().getName());
        synchronized(queue){
            int с=queue.getElementsCount();

            while (с>0) {
                try {
                    Thread.sleep(rand.nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                queue.remove();
                с=queue.getElementsCount();
                System.out.println("Очередь элемента размер: "+ с);
            }
        }
        System.out.println("Конец потребителя " + Thread.currentThread().getName());
    }
}
