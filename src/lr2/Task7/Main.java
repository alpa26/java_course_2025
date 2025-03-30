package lr2.Task7;


import lr2.Task6.Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10.0);
        bankAccount.GetAmount();
        double dep = 20;
        bankAccount.MakeDeposit(dep);
        System.out.printf("Внесен депозит %.2f рублей \n",dep);
        bankAccount.GetAmount();
        double dezdep = 10;
        bankAccount.MakeRemoval(dezdep);
        System.out.printf("Сняты средства %.2f рублей \n",dezdep);
        bankAccount.GetAmount();
    }
}
