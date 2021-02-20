package main.java.path_11;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task_49 {

    public static void main(String[] args) throws IOException {

        DataOutputStream a;
        try {
            a = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("./src/main/java/path_11/Api/task_49/testFle1.dat")));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }
        for (int i = 0; i < 20; i++) {
            a.write((int) (Math.random() * 25));
        }
        a.close();
        Path get = Paths.get("./src/main/java/path_11/Api/task_49/testFle1.dat");
        byte[] data = Files.readAllBytes(get);
        int sum = 0;
        for (byte t : data) {
            sum += t;
            System.out.print(t + " ");
        }
        System.err.println("\nСреднее арифметическое значение " + sum / data.length);
    }
}
