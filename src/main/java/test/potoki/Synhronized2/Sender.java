package main.java.test.potoki.Synhronized2;

public class Sender {
    public void send(String msg)
    {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Thread interrupted");
        }
        System.out.println(msg);
    }
}
