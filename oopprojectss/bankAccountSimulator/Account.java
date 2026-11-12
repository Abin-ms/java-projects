package oopprojectss.bankAccountSimulator;

public class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;

    public Account(int accountNumber, String accountHolderName, double balance, String accountType) {
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

    public double getBalance() {
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

    public void deposite(double amount) {

        if (amount > 0) {
            this.balance = this.balance + amount;
            System.out.println("Money deposited succesfully...");
        } else {
            System.out.println("Enter valid amount!!!!");
        }

    }

    public void withdraw(double amount) {
        if ((amount > 0) && (amount <= balance)) {
            this.balance = this.balance - amount;
            System.out.println("Money Withdrawn Succesfullyy...");
        } else {
            System.out.println("Insufficient Balance!!");
        }

    }

    public void displayAccountDetails() {
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Account holder Name : " + this.accountHolderName);
        System.out.println("Account Type : " + this.accountType);
        System.out.println("Balance : " + this.balance);
    }

    public void balanceAfterTransaction(){
        int chh = 0 ;
        do{
            System.out.println("Do you want to check your balance : ");
            System.out.println("1.Yes");
            System.out.println("2.No");

            switch (chh) {
                case 1:
                    System.out.println("Your Balance : "+this.getBalance());
                    break;
                case 2:
                    System.out.println("Thank you for choosing us.");
                    break;
                default:
                    System.out.println("Enter valid choice");
                    break;
            }
        }while(chh!=2);
        
    }
    
}
