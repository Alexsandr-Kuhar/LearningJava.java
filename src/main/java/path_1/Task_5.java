package main.java.path_1;

public class Task_5 {
    public static void main (String[] args)
    { int s,remSec,m,remMin,h,day,remDay,remWeek,week;
        s = 8718005;
        remSec = s % 60;
        m = (s - remSec) / 60;
        remMin = m % 60;
        h = (m - remMin) / 60;

        remDay= h % 24;
        day=(h-remDay)/24;
        remWeek=day % 7;
        week=(day-remWeek)/7;


        System.out.println("\nWeek: "+week+"\nDays: "+remWeek +"\nHours: " +remDay + "\nMinutes: "
                + remMin + "\nSeconds: " + remSec);
    }
}
