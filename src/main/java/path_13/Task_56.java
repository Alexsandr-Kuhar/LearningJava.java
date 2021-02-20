package main.java.path_13;

import main.java.path_13.Api.Task_56.Thread1;
import main.java.path_13.Api.Task_56.Thread2;
import main.java.path_13.Api.Task_56.Thread3;

public class Task_56 {

    public final static  Object Lock1 = new Object();
    public final static Object Lock2 = new Object();
    public final static Object Lock3 = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        Thread3 t3=new Thread3();
        t1.start();
        t2.start();
        t3.start();
    }

}
