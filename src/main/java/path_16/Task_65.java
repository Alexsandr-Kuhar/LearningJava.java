package main.java.path_16;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Task_65 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.of(13,00);
        int git = (date.lengthOfMonth()-date.getDayOfMonth()) +
                date.plusMonths(1).lengthOfMonth() + date.getDayOfMonth();
        for (int i = 0; i < git; i++) {
            System.out.println(date.plusDays(i).format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
            System.out.printf("%s: meeting\n\n", time);
        }
    }
}
