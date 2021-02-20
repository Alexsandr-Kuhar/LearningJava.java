package main.java.path_11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_48 {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/main/java/path_11/Api/task_48/testFile1.txt");
        if (file.createNewFile()) {
            System.err.println("Файл создан");
        } else {
            System.err.println("Файл есть");
        }
        FileWriter writer = new FileWriter(file);
        writer.write("Класс5 File10, опреде5ленный5 в пакете 34 java.io, не 4 работает напрямую45 с потоками.3");
        writer.close();

        Scanner read = new Scanner(file);
        read.useDelimiter("./src/main/java/path_11/Api/task_48/testFile1.txt");
        String s = read.nextLine();
        int sum = 0, k;
        String[] words = s.trim().split("\\D");

        List<Integer> number = new ArrayList<>();
        for (String a : words) {
            if  (a!= "") {
                number.add(Integer.valueOf(a));
                sum += Integer.valueOf(a);
            }
        }
        System.out.println(number);
        System.err.println("Сумма всех цифр " + sum);

        List<Integer> numberNew = new ArrayList<>();
        for (Integer b:number) {
            if (!numberNew.contains(b)) {
                numberNew.add(b);
            }
        }
        System.out.println(numberNew);
    }
}
