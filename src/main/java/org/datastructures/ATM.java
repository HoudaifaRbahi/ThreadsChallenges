package org.datastructures;

public class ATM  {
    private Person person;
    private int money_out;
    public boolean checkBalance(Person person,int amount){
        return (person.getBalance()>=amount)?true:false;
    }
    public synchronized   void withraw_money(Person person){
        this.setPerson(person);
        System.out.println("Hi Mr "+person.getName1()+" "+ person.getLastName1());
        if(checkBalance(person,person.getAmount())){
            this.setMoney_out(person.getAmount());
            person.setBalance(person.getBalance()-person.getAmount());
            System.out.println("successful withdrawing with amount of: "+person.getAmount());
            System.out.println("<<<<<<<<==============>>>>>>>>>");
            System.out.println("the rest in your account is : "+person.getBalance());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else{
            System.out.println("failed process try again");
        }
    }
    public int getMoney_out() {
        return money_out;
    }

    public void setMoney_out(int money_out) {
        this.money_out = money_out;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }



    }

