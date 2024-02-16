package com.core_java;

public class demonstration_of_methods_by_bank_example {
    public static int currentbalance=1000;
    public static void greatmethod()
    {
        System.out.println("HELLO WELCOME CUSTOMER");
    }

    public void deposite(int amount)
    {
       currentbalance=currentbalance+amount;
        System.out.println("current balance after deposite "+currentbalance);
        System.out.println("AMOUNT IS DEPOSITED SUCCESSFULLY");

    }

    public  static void withdrawl(int amount)
    {
          currentbalance=currentbalance-amount;
        System.out.println("current balance after withdrawl " +currentbalance);
        System.out.println("AMOUNT IS WITHDRAWED  SUCCESSFULLY");
    }
    public int getcurrentbalence()
    {
       return currentbalance;

    }


    public static void main(String[] args) {
        demonstration_of_methods_by_bank_example ob=new demonstration_of_methods_by_bank_example();
        greatmethod();
        System.out.println("current balance is:"+currentbalance);
        ob.deposite(500);
        withdrawl(250);



    }

}
