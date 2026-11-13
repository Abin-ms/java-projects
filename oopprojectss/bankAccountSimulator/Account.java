package oopprojectss.bankAccountSimulator;

import java.util.Scanner;

public class Account {
    private int accountNumber;
    private String accountHolderName;
    private int balance;
    private String accountType;

    public Account(int accountNumber, String accountHolderName, int balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void deposite(int amount) {

        if (amount > 0) {
            this.balance = this.balance + amount;
            System.out.println("Money deposited succesfully...");
        } else {
            System.out.println("Enter valid amount!!!!");
        }

    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Enter a valid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance!!");
        } else {
            this.balance = this.balance - amount;
            System.out.println("Money Withdrawn Succesfullyy...");
        }

    }

    public void balanceAfterTransaction() {
        Scanner s1 = new Scanner(System.in);
        int chh = 0;
        System.out.println("Do you want to check your balance : ");
        System.out.println("1.Yes");
        System.out.println("2.No");
        chh = s1.nextInt();
        if (chh == 1) {
            System.out.println("Current Balance : " + this.getBalance());
            s1.close();
            return;
        } else if (chh == 2) {
            s1.close();
            return;
        } else {
            System.out.println("Invalid input");
            balanceAfterTransaction();
        }
        s1.close();
    }
}
