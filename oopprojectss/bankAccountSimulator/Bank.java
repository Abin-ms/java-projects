package oopprojectss.bankAccountSimulator;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    Bank(){
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        accounts.add(account);

    }
}
