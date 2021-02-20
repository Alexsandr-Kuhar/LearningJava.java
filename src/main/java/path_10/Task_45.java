package main.java.path_10;

public class Task_45 extends Exception {
    private String str;
    public Task_45(String str)
    {
       this.str=str;
        System.out.println("Ошибка task_45");
    }
    public void ExcMessage()
    {
        System.err.println("Ошибка  "+str);
    }
    public static void main(String[] args) {
        try {
            String s="чтения";
            throw new Task_45(s);
        } catch (Task_45 e) {
            e.ExcMessage();
        }
          catch (Exception en) {
             en.fillInStackTrace();
        }            
    }
}
