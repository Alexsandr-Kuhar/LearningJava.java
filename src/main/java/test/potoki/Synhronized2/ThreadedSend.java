package main.java.test.potoki.Synhronized2;

public class ThreadedSend extends Thread{
    private String msg;
    private Thread t;
    final Sender sender;
    ThreadedSend(String m, Sender obj)
    {
        msg=m;
        sender=obj;
    }
    public void run()
    {
        synchronized (sender)
        {sender.send(msg);}
    }
}
