package main.java.path_12;

import main.java.path_12.Api.Task52Thread;

public class Task_52 {
    public static void main(String[] args) throws InterruptedException {
        Task52Thread t1[]= new Task52Thread[10];
        for (int i=0;i<t1.length;i++)
        {
             t1[i]=new Task52Thread("Поток-"+i);
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
