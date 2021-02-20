package main.java.path_7.api.Task_34;

public  class ZP extends Implementation implements AddMoney {
public ZP(int hourPrice,int amount,int postLevel)
{
  //  super(10);
    this.hour=hourPrice;
   this.amount=amount;
   this.postLevel=postLevel;
}

protected int summa;
protected String s;
    @Override
    public void hourZP() {
     summa=this.hour*8;
     s="почесовая ";
    }
    protected int percentage;
    @Override
    public void percentageZP() {
        summa=(this.amount*this.levelPercentage)/100+this.amount;
        s="процентная ";
    }

protected int mixed;
    @Override
    public void mixedZP() {
   summa=this.hour*8+(this.amount*this.levelPercentage)/100+this.amount;
        s="смешаная ";
    }

    public void Bet()
    { switch (this.postLevel) {
        case 1:
            this.levelPercentage = 10;
            break;
        case 2:
            this.levelPercentage = 20;
            break;
        case 3:
            this.levelPercentage = 30;
            break;
        default:
            System.out.println("Должнасть не выбрана");
    }
    }
    @Override
    public void PrepaidExpense() {
        if (this.postLevel==1)
        { System.out.println("Рабочий аванс "+s+(((this.levelPercentage*summa)/100+summa)*40/100+summa));}
        if (this.postLevel==2)
        { System.out.println("Инжинер  аванс "+s+(((this.levelPercentage*summa)/100+summa)*40/100+summa));}
        if (this.postLevel==3)
        { System.out.println("Директор  аванс "+s+(((this.levelPercentage*summa)/100+summa)*40/100+summa));}
       //40
    }

    @Override
    public void Salary() {
        if (this.postLevel==1)
        { System.out.println("Рабочий ЗП "+s+(((this.levelPercentage*summa)/100+summa)*60/100+summa));}
        if (this.postLevel==2)
        { System.out.println("Инжинер  ЗП "+s+(((this.levelPercentage*summa)/100+summa)*60/100+summa));}
        if (this.postLevel==3)
        { System.out.println("Директор  ЗП "+s+(((this.levelPercentage*summa)/100+summa)*60/100+summa));}
    }
}
