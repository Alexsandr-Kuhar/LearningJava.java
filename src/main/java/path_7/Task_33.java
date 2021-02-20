package main.java.path_7;

import main.java.path_7.api.Task_33.NameBank;
import main.java.path_7.api.Task_33.PaymentSystem;

public class Task_33 {
    public static void main(String[] args) {
        PaymentSystem pay = new PaymentSystem("MasterCard");
        NameBank score = new NameBank("Беларусбанк","1234 5678 9876 5432","Kuharhuk Aleksandr","21.12.2021",202);
        score.Register();
        pay.Out();

        score.OutInfo();
        score.WithdrawMoney();
        score.InternetBanking();
    }
}
