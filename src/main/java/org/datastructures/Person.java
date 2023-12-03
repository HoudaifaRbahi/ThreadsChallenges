package org.datastructures;

public class Person extends Thread {
    private String name;
    private String lastName;
    private ATM atm;
    private int Balance;
    private int amount;

    public String getName1() {
        return name;
    }

    public void setName1(String name) {
        this.name = name;
    }

    public String getLastName1() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ATM getAtm() {
        return atm;
    }

    public void setAtm(ATM atm) {
        this.atm = atm;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void run() {
        try {
            Thread crrentThread=Thread.currentThread();
            this.getAtm().withraw_money(this);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
