package main.java.path_12;

import main.java.path_12.Api.Task54Thread;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Task_54 {
    public static void main(String[] args) throws InterruptedException, IOException {
        File file = new File("./src/main/java/path_12/Api/testFile.txt");
        if (file.createNewFile()) {
            System.err.println("Файл создан");
        } else {
            System.err.println("Файл есть");
        }

        Task54Thread t1[] = new Task54Thread[5];
        for (int i = 0; i < t1.length; i++) {
            t1[i] = new Task54Thread("Поток-" + i);
        }

        FileWriter writer = new FileWriter(file);
        for (int i = 0; i < t1.length; i++) {
            t1[i].start();
          }
        for (int i = 0; i < t1.length; i++) {
            t1[i].join();
            System.out.println(Arrays.toString(t1[i].getR()));
            writer.write(Arrays.toString(t1[i].getR()) + "\n");
        }
        writer.close();
        System.out.println("OK");
    }
}
