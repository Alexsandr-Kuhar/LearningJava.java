package main.java.path_14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Task_58 extends Thread {
    public static void main(String[] args) {
//        ExecutorService service = Executors.newCachedThreadPool();
////        for (int i=0; i<10;i++)
////        {
//
//            service.execute(new Runnable(){ public void run(){
//                System.out.println("sds ");
//            }
//        });
//  //      }


        ScheduledExecutorService callable = Executors.newSingleThreadScheduledExecutor();
        callable.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                    BufferedWriter out = new BufferedWriter(new FileWriter( "./src/main/java/path_14/Api/Task_58/rrr.txt"));
                    out.write("s");
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("sdsddddd");
            }
        },1,3, TimeUnit.SECONDS);

    }
}
