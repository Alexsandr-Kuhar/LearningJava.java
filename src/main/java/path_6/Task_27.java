package main.java.path_6;

import java.util.Scanner;

public class Task_27 {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        String text = s.nextLine();
        System.out.println("Number of words "+text.trim().split(" +").length);
    }
}
