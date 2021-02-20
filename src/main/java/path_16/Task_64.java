package main.java.path_16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task_64 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        LocalDate date = LocalDate.of(2021, month, 1);

        for (int i = 0; i < date.lengthOfMonth(); i++) {
            System.out.println(date.plusDays(i).format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
        }
    }
}

