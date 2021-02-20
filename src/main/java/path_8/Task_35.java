package main.java.path_8;

import main.java.path_8.api.Task_35.Seasons;

public class Task_35 {
    public static void main(String[] args) {
        Seasons ar[]=Seasons.values();
        for (Seasons a:ar)
        {System.out.println(a);}

//end solution


        ///workout
      Seasons summer = Seasons.SUMMER;
      Seasons autumn = Seasons.AUTUMN;
      Seasons spring = Seasons.SPRING;
      Seasons winter = Seasons.WINTER;
      System.out.println(summer.getCountOfDays()+" "+ summer.getDescription());
      System.out.println(autumn.getCountOfDays()+" "+autumn.getDescription());
      System.out.println(spring.getCountOfDays()+" "+spring.getDescription());
      System.out.println(winter.getCountOfDays()+" "+winter.getDescription());

       switch (summer){
           case WINTER:
               System.out.println("s");
               break;
           case AUTUMN:
               System.out.println("sss");
               break;
           case SPRING:
               System.out.println("sds");
               break;
           case SUMMER:
               System.out.println("sd");
               break;
       }
   ///workout
    }
}
