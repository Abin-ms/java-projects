package oopprojectss.bankAccountSimulator;

import java.util.ArrayList;
import java.util.Random;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public int generateAcNo() {
        Random rr = new Random();
        int min = 99999;
        int max = 99999999;
        return rr.nextInt(max - min + 1) + min;
    }

    public int accountNumberCreation() {
        int accountNumber;
        do {
            accountNumber = generateAcNo();
        } while (isAccountNumberExists(accountNumber));
        return accountNumber;
    }

    public boolean isAccountNumberExists(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return true;
            }
        }
        return false;
    }

    public void createAccount(String accountHolderName, int balance, String accountType) {

        int accountNumber = accountNumberCreation();
        Account account = new Account(accountNumber, accountHolderName, balance, accountType);

        accounts.add(account);

        System.out.println("Account created successfully..");
        System.out.println("Your account number is :" + accountNumber);
    }

    public void searchAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                System.out.println("Account holder : " + account.getAccountHolderName());
                System.out.println("Account type : " + account.getAccountType());
                return;
            }
        }
        System.out.println("No such account is identified.");

    }

    public void depositemoney(int amount, int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.deposite(amount);
                account.balanceAfterTransaction();
                return;
            }
        }
        System.out.println("You entered the wrong credentails.");
    }

    public void withdrawMoney(int amount, int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.withdraw(amount);
                account.balanceAfterTransaction();
                return;
            }
        }
        System.out.println("You entered the wrong credentails.");
    }

    public void checkBalance(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                System.out.println("Curren balance : " + account.getBalance());
                return;
            }
        }
        System.out.println("You entered the wrong credentails.");
    }

    public void deleteAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                accounts.remove(account);
                System.out.println("Account deletion Succesfull");
                return;
            }
        }
        System.out.println("Cannot found the account , verify account number and try again.");
    }

    public void displayAccountDetails(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {

                System.out.println("Account Number : " + account.getAccountNumber());
                System.out.println("Account holder Name : " + account.getAccountHolderName());
                System.out.println("Account Type : " + account.getAccountType());
                System.out.println("Balance : " + account.getBalance());
                return;

            }
        }
        System.out.println("Enter valid Account number");
    }
}
