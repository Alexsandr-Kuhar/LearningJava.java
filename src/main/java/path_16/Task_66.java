package main.java.path_16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task_66 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
        System.out.println(date.minusDays(60).format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
    }
    }

