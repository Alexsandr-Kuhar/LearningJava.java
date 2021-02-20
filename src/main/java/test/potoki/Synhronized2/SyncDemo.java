package main.java.test.potoki.Synhronized2;

public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {
        Sender snd= new Sender();
        ThreadedSend s1= new ThreadedSend("Hi",snd);
        ThreadedSend s2= new ThreadedSend("Bye",snd);
        ThreadedSend s3= new ThreadedSend("Hi1",snd);
        ThreadedSend s4= new ThreadedSend("Bye1",snd);
        s1.start();s2.start();s3.start();s4.start();
        s2.join();s2.join();  s3.join();s4.join();

    }
}
