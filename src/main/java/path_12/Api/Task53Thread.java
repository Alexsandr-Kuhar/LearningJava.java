package main.java.path_12.Api;

public class Task53Thread extends Thread {
    private String name;
    public Task53Thread(String name)
    {
        super(name);
        this.name=name;
    }
    public void run(){
        int[] r;
        r= new int[10];
        for (int i=0;i<10;i++)
        {
            r[i]=(int) (Math.random()*100);
        }
        int max=0;
        for (int i=0;i<10;i++) {
         if (r[i]>=max)
         {max=r[i];}
        }

        try {
            Thread.sleep(1000);
            System.out.println(getName() + "--"+"MAX:" + max);
            //     Thread.yield();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
