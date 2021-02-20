package main.java.path_2;

import java.util.Scanner;

public class Task_11 {

    public static String Week(Integer i)
    {
        String s1=" ";

        switch (i)
        {   case 1:  s1 = "I run on Monday"; break;
            case 2:  s1 = "I eat on Tuesday "; break;
            case 3:  s1 = "I work on Wednesday";break;
            case 4:  s1 = "I'm learning English on Thursday"; break;
            case 5:  s1 = "I drive on Friday"; break;
            case 6:  s1 = "I watch TV on Saturday "; break;
            case 7:  s1 = "Sunday fun "; break;
            default:
                System.out.println("There is no such number");
        }
        return  s1;
    }

    public static void main(String[] args) {

        System.out.print("Input a number 1-7: ");
        Scanner in = new Scanner(System.in);
        Integer Date = in.nextInt();
        System.out.println(Week(Date));
    }
}
