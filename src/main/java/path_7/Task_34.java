package main.java.path_7;

import main.java.path_7.api.Task_34.ZP;

import java.util.Scanner;

public class Task_34 {
    public static void main(String[] args) {
        System.out.println("Введите:Рабочий 1,Инжинер 2,Директор 3: ");
        Scanner s =  new Scanner(System.in);
        ZP salary=new ZP(10,200,Integer.valueOf(s.nextLine()));

        System.out.println("Введите:Почесовая 1,Процетная 2,Смешаная 3: ");
        Scanner l =  new Scanner(System.in);
        String as =l.nextLine();
        salary.Bet();
        if (Integer.valueOf(as)==1)
        {salary.hourZP();}
        if (Integer.valueOf(as)==2)
        {salary.percentageZP();}
        if (Integer.valueOf(as)==3)
        {salary.mixedZP();}

        salary.PrepaidExpense();
        salary.Salary();
    }
}
