package main.java.path_12;

import main.java.path_12.Api.Task53Thread;

public class Task_53 {
    public static void main(String[] args) throws InterruptedException {
        Task53Thread t1[]= new Task53Thread[10];
        for (int i=0;i<t1.length;i++)
        {
            t1[i]=new Task53Thread("Поток-"+i);
        }
        for (int i=0;i<t1.length;i++)
        {
            t1[i].start();
        }
        for (int i=0;i<t1.length;i++)
        {
            t1[i].join();
        }
        System.out.println("OK");
    }
}
