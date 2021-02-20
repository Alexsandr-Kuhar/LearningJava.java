package main.java.path_8;

import main.java.path_8.api.Task_36.Seasons;

import java.util.Scanner;

public class Task_36 {
    public static void main(String[] args) {
        Seasons ss = Seasons.AUTUMN;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение от 1 до 4");
        ss.Next(Integer.valueOf(in.next()));
    }
}
