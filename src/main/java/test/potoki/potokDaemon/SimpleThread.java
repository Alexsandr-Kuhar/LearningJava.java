package main.java.test.potoki.potokDaemon;

public class SimpleThread extends Thread {
    public void run(){
        try{
            if(isDaemon())
            {
                System.out.println("старт потока-демона");
                Thread.sleep(10);
            }else System.out.println("старт обычного потока");
        }catch (InterruptedException e)
        {
            System.err.println(e);
        }finally {
            if (!isDaemon()){
                System.out.println("завершение обычного потока");
            }else {
                System.out.println("завершение потока-демона");
            }
        }
    }
}
