package main.java.path_1;
import java.util.Scanner;
public class Task_4 {
    public static  Integer numb(Integer x1,Integer x2)
    {
        return x1+x2+x1*x2;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number X1: ");
        Integer x1 = in.nextInt();
        System.out.print("Input a number X2: ");
        Integer x2 = in.nextInt();
        System.out.println("Result = "+ numb(x1,x2));
        in.close();
    }
}
