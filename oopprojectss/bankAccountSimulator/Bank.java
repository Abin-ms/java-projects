package oopprojectss.bankAccountSimulator;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void createAccount(Account account) {
        accounts.add(account);

    }

    public void searchAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                System.out.println("Account identified.");
                System.out.println("Account holder : " + account.getAccountHolderName());
            } else {
                System.out.println("No such account is identified.");
            }
        }

    }

    public void depositemoney(double amount, int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.deposite(amount);
                account.balanceAfterTransaction();
                return;

            }
        }
        System.out.println("You entered the wrong credentails.");
    }

    public void withdrawMoney(double amount, int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.deposite(amount);
                account.balanceAfterTransaction();
            }
        }
        System.out.println("You entered the wrong credentails.");
    }

    public void checkBalance(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.getBalance();
            }
        }
        System.out.println("You entered the wrong credentails.");
    }

    public void deleteAccount(int accountNumber){
        for(Account account : accounts){
            if(account.getAccountNumber() == accountNumber){
                accounts.remove(account);
            }
        }
    }
}
