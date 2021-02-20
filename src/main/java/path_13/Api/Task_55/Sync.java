package main.java.path_13.Api.Task_55;

public class Sync extends Thread{
    final Sender sender;
   private String name;

    public Sync(Sender sender,String name) {
        this.sender = sender;
        this.name=name;
    }
    @Override
    public void run() {
        synchronized (this.sender)
        {
            try {

                sender.send(name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
