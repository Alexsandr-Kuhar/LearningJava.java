package main.java.path_5;
import main.java.path_5.api.Task_25_1;

import java.util.Scanner;

public class Task_25 {

    public static Integer Input ()
    {
        Scanner g = new Scanner(System.in);
        return g.nextInt();
    }
    public static void main(String[] args) {
        int g20,g50,g100,d;
        System.out.print("Input bills 100: ");
        g100=Input();
        System.out.print("Input bills 50: ");
        g50=Input();
        System.out.print("Input bills 20: ");
        g20=Input();
        System.out.print("Enter the withdrawal amount: ");
          do {
              Task_25_1 number_bills = new Task_25_1(g20, g50, g100);
              d=Input();
              if (d%10==0) {
                  number_bills.withdrawal_money(d);
                 } else {number_bills.Enter();}
             if (d == 10) {number_bills.Not_Input();}
                 else if (d==30){number_bills.Not_Input();}
             }
        while ((g20*20+g50*50+g100*100<=d || d == 10 || d==30) || (d%10!=0));

    }

}