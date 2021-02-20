package main.java.path_11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Task_47 {
    public static void main(String[] args) throws IOException, URISyntaxException {
        File file = new File("./src/main/java/path_11/Api/task_47/testFile1.txt");
        if (file.createNewFile()) {
            System.err.println("Файл создан");
        } else {
            System.err.println("Файл есть");
        }
        FileWriter writer = new FileWriter(file);
        writer.write("Класс File, определенный в пакете java.io, не работает напрямую с потоками.");
        writer.close();

        Scanner read = new Scanner(file);
        read.useDelimiter("./src/main/java/path_11/Api/task_47/testFile1.txt");
        String s=read.nextLine();
        System.out.println("Количество слов "+s.trim().split(" +").length);
        String words = s.replaceAll("[^.,:;!?]","");
        System.out.println("Количество знаков препинани "+ words.length());
        }
    }





