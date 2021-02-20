package main.java.path_7.api.Task_33;

public   class  NameBank extends Implementation implements Money,Register,OutputDate{

    public NameBank(String nameBank,String numberScore,String namePerson,String endDate,int summa)
    {
        this.nameBank=nameBank;
        this.numberScore=numberScore;
        this.namePerson=namePerson;
        this.endDate=endDate;
        this.summa=summa;
    }
    @Override
    public void OutInfo() {
        if (this.status)
        { System.out.println(nameBank+"\n"+numberScore+"\n"+namePerson+"\n"+endDate+"\n"+summa);}
    }

    public NameBank() {
   }

    @Override
    public void Block(){
    this.status=false;
    System.out.println("Заблокирован. Спасибо вам за сотрудничество");
    }
    @Override
    public void Register() {
    this.status=true;
    System.out.println(" Зарегестрирован.Спасибо за сотрудничество");

    }
    @Override
    public void WithdrawMoney() {
    if (statusMoney)
    {System.out.println("Снимаем денюшку");}
    else {System.out.println("Надо карту зарегать");}
    }
    @Override
    public void InternetBanking() {
        if (status)
        {System.out.println("Интернет банкинг необходимо зарегестрировать");}
    }
    @Override
    public void Out() {
        System.out.println(this.nameBank);
    }
}
