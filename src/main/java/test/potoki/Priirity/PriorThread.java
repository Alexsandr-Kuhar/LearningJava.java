package main.java.test.potoki.Priirity;

public class PriorThread extends Thread {
    public PriorThread(String name)
    {
        super();
    }
    public void run() {
        for (int i=0;i<71;i++)
        {
            System.out.println(getName()+" "+i);
            try{
                Thread.sleep(10);
            } catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
