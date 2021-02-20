package main.java.test.potoki.Exception;

public class ExceptionThreadDemo {
    public static void main(String[] args)throws InterruptedException {
        new ExeptThread().start();
        Thread.sleep(1000);
        System.out.println("end of main");
    }
}
