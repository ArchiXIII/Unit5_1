package main.java.ru.archi;

/**
 * Created by Черный on 11.10.2017.
 */
public class Bank {
    private int moneyAmount;

    public Bank(int moneyAmount){
        this.moneyAmount = moneyAmount;
    }

    public void withdrawMoney(int amount) {
        moneyAmount -= amount;
    }

    public boolean hasMoney(int amount){
        return moneyAmount > amount;
    }
}
