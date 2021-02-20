package main.java.test;

import java.util.concurrent.locks.Lock;

public class Egg1111 extends Thread {
    private StringBuffer text;
    private int countTo;
    private Lock lock;
    public Egg1111(StringBuffer s, int c, Lock Lock)
    {
        text=s;
        countTo=c;
        this.lock=lock;
          }
    @Override
    public void run()
    {
        lock.lock();
        int sum=0;
        for (int i=1;i<=countTo;i++)
        {
            sum+=i;
            text.append("Next value="+i);
        }
text.append("nsum="+sum+"\n");
        lock.unlock();

    }

    public static void main(String[] args) {
    //    StringBuffer text = new StringBuffer();
//NewCountClass ggg = new NewCountClass(text,100,)
    }

}
