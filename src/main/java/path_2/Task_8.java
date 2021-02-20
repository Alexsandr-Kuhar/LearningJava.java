package main.java.path_2;
import java.util.Scanner;
public class Task_8 { public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Input a number X: ");
    Integer x = in.nextInt();
    in.close();
    if (x%10==1 && x%100!=11)
    {
        System.out.println(x+" rubl");
    }  else if (x%100==11 || x%100==12 || x%100==13 || x%100==14)
    {System.out.println(x+" rublei");}
    else   if (x%10==2 || x%10==3 || x%10==4)
    {
        System.out.println(x+" rublya");
    } else {System.out.println(x+" rublei");}
}
}
