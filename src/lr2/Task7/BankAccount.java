package lr2.Task7;

public class BankAccount implements IBankAccount{
    public double MoneyAmount;

    public BankAccount(double _moneyAmount){
        MoneyAmount = _moneyAmount;
    }

    @Override
    public void MakeDeposit(double _moneyAmountDeposit) {
        MoneyAmount += _moneyAmountDeposit;
    }

    @Override
    public void MakeRemoval(double _moneyAmountRemoval) {
        MoneyAmount -= _moneyAmountRemoval;
    }

    @Override
    public void GetAmount() {
        System.out.printf("Ваш текущий счет %d рублей \n", MoneyAmount);
    }
}
