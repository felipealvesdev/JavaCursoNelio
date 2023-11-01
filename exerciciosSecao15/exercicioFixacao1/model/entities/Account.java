package exercicioFixacao1.model.entities;

import exercicioFixacao1.model.Exception.NotEnoughBalanceError;
import exercicioFixacao1.model.Exception.NotEnoughWithdrawLimitError;

public class Account {

    private Integer number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdraw(double amount) throws NotEnoughBalanceError, NotEnoughWithdrawLimitError{

        if(amount > withdrawLimit) {
            throw new NotEnoughWithdrawLimitError("The amount exceeds withdraw limit");
        }else if(amount > this.balance) {
            throw new NotEnoughBalanceError("Not enough balance");
        }
        this.balance -= amount;
    }



}
