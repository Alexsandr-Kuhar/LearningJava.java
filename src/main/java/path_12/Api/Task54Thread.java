package main.java.path_12.Api;

public class Task54Thread extends Thread{
    private String name;
    private int[] r;
    public  Task54Thread(String name)
    {
        super(name);
        this.name=name;
    }
    public int[] getR() {
        return r;
    }
    public void run(){
        r= new int[10];
        for (int i=0;i<10;i++)
        {
            r[i]=(int) (Math.random()*100);
        }
    }
}
