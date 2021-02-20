package main.java.path_5;

import main.java.path_5.api.Task_24_1;

public class Task_24 {

    public static void main(String[] args) {
        int sec=23223;
        Task_24_1 seconds = new Task_24_1(sec);
        Task_24_1 time = new Task_24_1(12,23,20);
        seconds.Print_Second();
        time.Print_Time();
        time.Sravniti(sec);
        }
}


