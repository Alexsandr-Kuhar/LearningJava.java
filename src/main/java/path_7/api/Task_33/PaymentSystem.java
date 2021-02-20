package main.java.path_7.api.Task_33;

public class PaymentSystem extends NameBank implements OutputDate{
    public String PaymentSystem;
   public  PaymentSystem(String PaymentSystem){
         this.PaymentSystem=PaymentSystem;
   }
    @Override
    public void Out() {
        if (this.status)
        { System.out.println(this.PaymentSystem);}
    }
}
