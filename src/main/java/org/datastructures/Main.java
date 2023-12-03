package org.datastructures;


public class Main {



    public static void main(String[] args)  {
    ATM atm=new ATM();
    Person person1=new Person();
    person1.setName("Houdaifa");
    person1.setLastName("R-bahi");
    person1.setBalance(10000);
    person1.setAmount(1000);
    person1.setAtm(atm);
    /////////////////////////////////
        Person person2=new Person();
        person2.setName("Haytaam");
        person2.setLastName("Aghmir");
        person2.setBalance(20000);
        person2.setAmount(5000);
        person2.setAtm(atm);
     person1.start();
     person2.start();




    }
}