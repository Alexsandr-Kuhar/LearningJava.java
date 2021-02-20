package main.java.path_12.Api;

public class Task52Thread extends Thread{
    private String name;
    public Task52Thread(String name)
    {
    super(name);
    this.name=name;
    }

    public void run(){
  int r=0;
        for (int i=0;i<10;i++)
        {
  r+=(int) (Math.random()*30);
        }
        try {
            Thread.sleep(1000);
            System.out.println(getName()+"--"+ r/10);
       //     Thread.yield();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
