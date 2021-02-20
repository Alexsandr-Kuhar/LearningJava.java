package main.java.path_10;

import java.util.Optional;

public class Task_43 {

    public static void main(String[] args) {
        try {
            System.out.println(Optional.of(null).orElse("La-la"));
        } catch (NullPointerException e) {
            System.out.println("Not link");
        } finally {
            System.out.println("Работаем дальше");
        }
    }
}
