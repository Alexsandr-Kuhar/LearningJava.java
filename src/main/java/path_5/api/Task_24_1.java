package main.java.path_5.api;
public class Task_24_1 implements Time_interface {
    private int second;
    private int minute;
    private int hours;
    public Task_24_1(int h, int m, int s)
    { this.second=s;
        this.minute=m;
        this.hours=h;
    }
    public Task_24_1 (int all_Second)
    { second=all_Second;
    }

    public int All_Second ()
    {
        return hours*3600+minute*60+second;
    }
    @Override
    public void Print_Second()
    {
        System.out.println("A time =" + second);
    }
    @Override
    public void Print_Time()
    {
        System.out.println(String.format("B time =  %s hours, %s minute, %s seconds", hours, minute, second));
    }
    public  void  Sravniti(int sec)
    {   int s;
        if (sec>=this.All_Second())
        { s=sec-this.All_Second();
            System.out.println(String.format("A time > B time \nDifference = %s sec", s));
        }
        else
        {   s=this.All_Second()-sec;
            System.out.println(String.format("A time < B time \nDifference = %s sec", s));
        }

    }
}
