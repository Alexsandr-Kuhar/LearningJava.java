package main.java.path_6;

import java.util.Scanner;

public class Task_26 {
      public static void main(String[] args) {
          Scanner s =  new Scanner(System.in);
          String as =s.nextLine();
          System.out.println(as.length()-as.replaceAll("[.,:;!?]", "").length());
    }
}
