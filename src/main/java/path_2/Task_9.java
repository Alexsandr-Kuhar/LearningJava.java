package main.java.path_2;
import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Integer d=-1,day=0,month=0,year=0;
        System.out.print("Input a year : ");
        while (d<=1600 || d>=3000)
        {
            Scanner in = new Scanner(System.in);
            d=in.nextInt();year=d;
            if (d<=1600 || d>=3000){ System.out.print("You did not enter correctly, please enter 1600-3000: ");}
        }
        d=-1;
        System.out.print("Input a Month : ");
        while (d<=0 || d>=13)
        {
            Scanner in = new Scanner(System.in);
            d=in.nextInt(); month=d;
            if (d<=0 || d>=13){ System.out.print("You did not enter correctly, please enter 1-12: ");}
        }d=-1;
        System.out.print("Input a Day : ");
        while (d<=0 || d>=32 ||(day==31 && month==4 )||
                (day==29 && month==2 && year%4!=0)||(day==30 && month==2)||(day==31 && month==2)
                 ||(day==31 && month==6 )||(day==31 && month==9 ))
        {
            Scanner in = new Scanner(System.in);
            d=in.nextInt(); day=d;
            if (d<=0 || d>=32||(day==31 && month==4 )||
                    (day==29 && month==2 && year%4!=0)||(day==30 && month==2)||(day==31 && month==2)
                    ||(day==31 && month==6 )||(day==31 && month==9 ))
            { System.out.print("Date doesn't match ");}
        }
 //jan(1)=31,feb(2)=28,mar(3)=31,apr(4)= 30,may(5)=31,yun(6)=30,jul(7)=31, ago(8)=31 ,sep(9)=30, okt(10)=31,nov(11)=30,dec=31,
 switch (month) {
     case 1: //January
         if (day == 31) { day=1; month = 2; }
         else {day++;}
     break;
     case 2: //February
         if (day == 28||(day == 29 && year%4==0)) { day=1; month = 3; }
         else {day++;}
         break;
     case 3: //March
         if (day == 31) { day=1; month = 4; }
         else {day++;}
         break;
     case 4: //April
         if (day == 30) { day=1; month = 5; }
         else {day++;}
         break;
     case 5: // May
         if (day == 31) { day=1; month = 6; }
         else {day++;}
         break;
     case 6: //June
         if (day == 30) { day=1; month = 7; }
         else {day++;}
         break;
     case 7: //July
         if (day == 31) { day=1; month = 8; }
         else {day++;}
         break;
     case 8: //August
         if (day == 31) { day=1; month = 9; }
         else {day++;}
         break;
     case 9: //September
         if (day == 30) { day=1; month = 10; }
         else {day++;}
         break;
     case 10: //Oktomber
         if (day == 31) { day=1; month = 11; }
         else {day++;}
         break;
     case 11: //November
         if (day == 30) { day=1; month = 12; }
         else {day++;}
         break;
     case 12: //December
         if (day == 31) { day=1; month = 1; year++;}
         else {day++;}
         break;
 }
        System.out.print("Next Day:"+ day+"."+month+"."+year);
    }
 }
