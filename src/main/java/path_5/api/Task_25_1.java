package main.java.path_5.api;

public class Task_25_1 implements Bankomat{
    private int m20;
    private int m50;
    private int m100;
    public Task_25_1(int d20, int d50, int d100)
    {
        this.m20=d20;
        this.m50=d50;
        this.m100=d100;
    }
    public void  withdrawal_money(int summa)
    {
        int  Refresh_Summa=summa,l100=0,l50=0,l20=0,Summa2=m100*100+m50*50+m20*20;
        do
        {
            if (m100>=1 && summa>=100 && summa%100!=10 && summa%100!=30)
            { summa-=100;
                m100--;l100++;
            }
            else if ((m50>=1 && summa>=50) && (summa%100!=60   && summa%100!=80)) {
                summa-=50;
                m50--;l50++;
            }
            else if (m20>=1 && summa>=20) {
                summa-=20;
                m20--;l20++;
            }
            else if (l20*20+l50*50+l100*100!=Refresh_Summa){
                System.out.println("Aviable "+ (l20*20+l50*50+l100*100)+" or  Max "+ Summa2);
                summa=0;}
        } while (summa!=0);
        if (Proverca(l20*20+l50*50+l100*100==Refresh_Summa))
        {System.out.print(String.format("Bills 100: %s ,  Bills 50: %s , Bills 20: %s  \nThe remainder : %s ",l100,l50,l20,Summa2-(l100*100+l50*50+l20*20)));}
    }
    @Override
    public void Enter()
    {
        System.out.println("Enter a multiple of 10 ");
    }
    @Override
    public void Not_Input()
    {
        System.out.println("not available 10, input 20 or more 30 ");
    }
     public  static Boolean Proverca(boolean a)
    {      if (a==true)
    {
        System.out.println("Operation "+ a);

    }
    else  {System.out.println("Operation "+ a);}
        return a;
    }
}
