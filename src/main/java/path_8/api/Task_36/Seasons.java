package main.java.path_8.api.Task_36;

public enum Seasons {
    WINTER,SPRING,SUMMER,AUTUMN;

    public int Next(int k)
    {if (k==Seasons.values().length)
    {k=1;}
    else
    {k++;}
    System.out.println(Seasons.values()[k-1]);
        return k;
    }
}
