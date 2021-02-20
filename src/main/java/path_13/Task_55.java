package main.java.path_13;

import main.java.path_13.Api.Task_55.Sender;
import main.java.path_13.Api.Task_55.Sync;

public class Task_55 {

    public static void main(String[] args) throws InterruptedException {
        Sender sender = new Sender();
        Sync s[] = new Sync[10];
        for (int i = 0; i < s.length; i++) {
            s[i] = new Sync(sender,"Поток:"+i);
        }
        for (int i = 0; i < s.length; i++) {
            s[i].start();s[i].join();
        }
    }
}
