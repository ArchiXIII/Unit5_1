package main.java.ru.archi;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Черный on 11.10.2017.
 */
public class Bank {
    private int moneyAmount;

    public Bank(int moneyAmount){
        this.moneyAmount = moneyAmount;
    }

    public synchronized void withdrawMoney(int amount) {
        moneyAmount -= amount;
    }

    public synchronized boolean hasMoney(int amount){
        return moneyAmount > amount;
    }
}
