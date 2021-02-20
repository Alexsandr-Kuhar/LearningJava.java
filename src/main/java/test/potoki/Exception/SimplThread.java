package main.java.test.potoki.Exception;

public class SimplThread extends Thread{
    public void run(){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.err.println("end of SimpleThread");
        }
    }
}
