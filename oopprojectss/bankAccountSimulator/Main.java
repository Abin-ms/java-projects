package oopprojectss.bankAccountSimulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        Bank bb = new Bank();
        do {
            System.out.println("=====Menu=====");
            System.out.println("1.create new Account.");
            System.out.println("2.Remove Account.");
            System.out.println("3.Get Account info.");
            System.out.println("4.Deposit Money.");
            System.out.println("5.Withdraw Money.");
            System.out.println("6.See Balance");
            System.out.println("7.Exit.");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nEnter account holders name : ");
                    String accountHolderName = sc.nextLine();
                    System.out.println("Enter Initail balance :");
                    int balance = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter account type : ");
                    String accountType = sc.nextLine();
                    bb.createAccount(accountHolderName, balance, accountType);
                    break;
                case 2:
                    System.out.println("Enter account number :");
                    int accountNumber = sc.nextInt();
                    bb.deleteAccount(accountNumber);
                    break;
                case 3:
                    System.out.println("Enter account number :");
                    accountNumber = sc.nextInt();
                    bb.displayAccountDetails(accountNumber);
                    break;
                case 4:
                    System.out.println("Enter the account number:");
                    accountNumber = sc.nextInt();
                    System.out.println("Enter the amount amount to deposit : ");
                    int amount = sc.nextInt();
                    bb.depositemoney(amount, accountNumber);
                    break;
                case 5:
                    System.out.println("Enter the Account number:");
                    accountNumber = sc.nextInt();
                    System.out.println("Enter the amount to Withdraw.");
                    amount = sc.nextInt();
                    bb.withdrawMoney(amount, accountNumber);
                    break;
                case 6:
                    System.out.println("Enter the Account number :");
                    accountNumber = sc.nextInt();
                    bb.checkBalance(accountNumber);
                    break;
                case 7:
                    System.out.println("Thank you for using our service...");
                    break;
                default:
                    System.out.println("Invalid choice.!!!");
                    break;
            }
        } while (choice != 7);
        sc.close();
    }
}
