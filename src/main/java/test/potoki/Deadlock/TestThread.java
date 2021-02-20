package main.java.test.potoki.Deadlock;

public class TestThread {
    public static  Object Lock1 = new Object();
    public static Object Lock2 = new Object();
    public static Object Lock3 = new Object();

    public static void main(String[] args) throws InterruptedException {
        ThreadDemo1 T1=new ThreadDemo1();
        ThreadDemo2 T2=new ThreadDemo2();
        ThreadDemo3 T3=new ThreadDemo3();
       T1.start();
       T2.start();
       T3.start();
        }
    private static class ThreadDemo1 extends Thread{
        public void run(){
            synchronized (Lock1){
                System.out.println("Thread1 Удержание lock 1... ");
                try {Thread.sleep(10);}catch (InterruptedException e){}
                System.out.println("Thread1 Ожидание for lock 3...");
                synchronized (Lock3){
                    System.out.println("Thread 1: Удержание lock 1 and 2");
                    synchronized (Lock2){
                        System.out.println("Thread 1: Удержание lock 1 and 2 and 3");
                    }
                }
            }
        }
    }
    private static class ThreadDemo2 extends Thread{
        public void run(){
            synchronized (Lock2){
                System.out.println("Thread2 Удержание lock 2... ");
                try {Thread.sleep(100);}catch (InterruptedException e){}
                System.out.println("Thread2 Ожидание for lock 1...");
                synchronized (Lock1){
                    System.out.println("Thread 2: Удержание lock 1 and 2");
                    synchronized (Lock3){
                        System.out.println("Thread 2: Удержание lock 1 and 2 and 3");
                    }
                }
            }
        }
    }
    private static class ThreadDemo3 extends Thread{
        public void run(){
            synchronized (Lock3){
                System.out.println("Thread3 Удержание lock 3... ");
                try {Thread.sleep(100);}catch (InterruptedException e){}
                System.out.println("Thread3 Ожидание for lock 2...");
                synchronized (Lock1){
                    System.out.println("Thread 3: Удержание lock 1 and 2");
                    synchronized (Lock2){
                        System.out.println("Thread 3: Удержание lock 1 and 2");
                    }
                }
            }
        }
    }
}
