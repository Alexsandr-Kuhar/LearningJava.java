package main.java.path_2;
import java.util.Scanner;
public class Task_6 {
    static Boolean number(Integer x) {
    if (x%10==7)
    {  return true;}
    else {   return false;}
}

    public static void main(String[] args)
    {   Scanner in = new Scanner(System.in);
        System.out.print("Input a number X: ");
        Integer x = in.nextInt();
        System.out.println("Last number 7 ??? "+ number(x));
        in.close();
    }
}
