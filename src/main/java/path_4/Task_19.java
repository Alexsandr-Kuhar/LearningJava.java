package main.java.path_4;

import java.util.Scanner;

public class Task_19 {
    public static void main(String[] args) {
        int a[]=new int[10];
        int i;
       for (i=0;i<=9;i++)
       { System.out.print("Input "+(i+1)+ ":  ");
           Scanner in = new Scanner(System.in);
         a[i]=in.nextInt();
       }
        for (i=0;i<9;i++)
        {
            if (i%2==0)
                System.out.println("Number  "+i+"  ------"+ a[i]);
        }
    }
}
