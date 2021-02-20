package main.java.test.potoki.Exception;

public class ExeptThread extends  Thread{
    public void run(){
        boolean flag=true;
        if (flag){
            throw new RuntimeException();
        }
        System.out.println("end of ExeptThead");
    }
}
