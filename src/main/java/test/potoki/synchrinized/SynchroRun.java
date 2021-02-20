package main.java.test.potoki.synchrinized;

import java.io.IOException;

public class SynchroRun {
    public static void main(String[] args) {
        Resource s=null;
        try{
            s=new Resource("testFile1.txt");
            SyncThread t1= new SyncThread("Первый",s);
            SyncThread t2= new SyncThread("Второй",s);
            SyncThread t3= new SyncThread("Третий",s);
            SyncThread t4= new SyncThread("Четвертый",s);
            t1.start();t2.start(); t3.start();t4.start();
            t1.join();t2.join(); t3.join();t4.join();
        } catch (IOException e)
        {System.err.print("ошибка файла " +e);}
        catch (InterruptedException e)
        {System.err.print("ошибка потока "+ e);}
        finally {
            s.close();
        }
    }
}
