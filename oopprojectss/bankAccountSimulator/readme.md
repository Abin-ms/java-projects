Project objective

Build a console-based banking application that allows users to create accounts, generate unique account numbers, deposit money, withdraw money, check balances, search accounts, delete accounts and display account details.

Project architecture:
- Account.java – Individual account information and transactions.
- Bank.java – Manages multiple accounts.
- Main.java – User interaction and menu.

1. Classes and Objects
This is one of the most fundamental concepts of Object-Oriented Programming (OOP).
1.1 What is a class?
A class is a blueprint or template used to create objects.

It defines:
- Attributes – What an object has.
- Methods – What an object can do.
For example, imagine a bank account.

An account has:
- Account number
- Account holder name
- Balance
- Account type
An account can:
- Deposit money
- Withdraw money
- Display account details
We represent this using a Java class.
public class Account {

    private int accountNumber;
    private String accountHolderName;
    private int balance;
    private String accountType;

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}


Here:
- Account is the class.
- accountNumber, accountHolderName, balance, and accountType are attributes.
- deposit() and withdraw() are methods.
1.2 What is an object?
An object is an instance of a class.

Think of the class as a blueprint and the object as an actual item created using that blueprint.

For example:
Account account1 = new Account(1001, "Abin", 5000, "Savings");
Account account2 = new Account(1002, "Rahul", 8000, "Current");


Here:
- account1 is an object.
- account2 is another object.
- Both objects belong to the Account class.
One class, multiple objects
Account class

Common blueprint

account1

Account: 1001

Name: Abin

Balance: ₹5,000


account2

Account: 1002

Name: Rahul

Balance: ₹8,000



Each object has its own set of instance variables.
Where did we use this in Project 2?

In Bank.java:
Account account = new Account(
    accountNumber,
    accountHolderName,
    balance,
    accountType
);


This creates an Account object.

And:
Bank bb = new Bank();


This creates a Bank object.

Important: new is the keyword used to create an object.

2. Constructors
2.1 What is a constructor?
A constructor is a special member of a class that gets executed automatically when an object is created.

Its primary purpose is to initialize the object's attributes.
Important characteristics
1. The constructor name must be the same as the class name.
2. It does not have a return type, not even void.
3. It executes automatically when we create an object.
4. It can accept parameters.
Example:
public class Account {

    private int accountNumber;
    private String accountHolderName;
    private int balance;
    private String accountType;

    public Account(int accountNumber, String accountHolderName,
                   int balance, String accountType) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }
}


What is this?
this refers to the current object.

Consider:
this.accountNumber = accountNumber;


There are two variables here:
- this.accountNumber – Instance variable belonging to the object.
- accountNumber – Constructor parameter.
We use this to distinguish between them.
How did we use constructors in Project 2?
In Account.java:
public Account(int accountNumber, String accountHolderName,
               int balance, String accountType)


In Bank.java:
Account account = new Account(
    accountNumber,
    accountHolderName,
    balance,
    accountType
);


Whenever the Bank creates an account, the constructor initializes its details.

Remember: Constructors help ensure that an object starts with the required initial data.

3. Encapsulation
This is one of the four main pillars of OOP.

The four pillars are:
1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction
We primarily used encapsulation in our Bank Account Simulator.
3.1 What is encapsulation?
Encapsulation is the process of wrapping data (variables) and methods together inside a class while controlling access to that data.

In simple words:

Encapsulation protects an object's data from being accessed or modified directly from outside the class.

Consider:
public class Account {

    private int balance;

}


Why did we declare balance as private?

Imagine that balance was public:
public int balance;


Then another class could directly modify it:
account.balance = -50000;


This is dangerous because a bank account should not allow arbitrary balance modification.

Using private prevents direct access from other classes.
3.2 Getters
A getter is a method used to retrieve the value of a private variable.

Example:
public int getBalance() {
    return balance;
}


Usage:
System.out.println(account.getBalance());


Here, we can access the balance without exposing the variable itself.
3.3 Setters
A setter is a method used to modify the value of a private variable.

Example:
public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
}


Usage:
account.setAccountHolderName("Abin");


Notice something important: We did not create a setter for balance.

Why?

Because we don't want anyone to directly change the balance. Instead, we want balance modifications to happen through controlled deposit and withdrawal methods.
public void deposit(int amount) {
    if (amount > 0) {
        balance += amount;
    }
}


This is a good example of encapsulation.
Where did we use encapsulation?
In Account.java:
private int accountNumber;
private String accountHolderName;
private int balance;
private String accountType;


And through methods such as:
getBalance()
getAccountNumber()
getAccountHolderName()
setAccountHolderName()
deposit()
withdraw()


Interview question: Why should we make variables private?

Answer: To protect data from direct external modification and provide controlled access through public methods.

4. Access Modifiers
Access modifiers define where classes, variables, constructors and methods can be accessed.

Java has four access levels.
Modifier	Accessibility
private	Within the same class only
default	Within the same package
protected	Same package and subclasses outside the package
public	Accessible from anywhere, subject to class visibility

Where did we use them?
In Account.java:
private int balance;


Only the Account class can directly access this variable.
public int getBalance() {
    return balance;
}


Other classes can call this method.

In Bank.java:
private ArrayList<Account> accounts;


Only Bank can directly manipulate its internal account list.

This is important because the Bank should control how accounts are added and removed.

5. ArrayList
This is one of the most important concepts in our project.
5.1 What is an ArrayList?
ArrayList is a resizable collection in Java that stores elements dynamically.

Unlike a normal array, its size can automatically increase or decrease when elements are added or removed.
Normal array
int[] numbers = new int[3];

numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;


The size is fixed at 3.
ArrayList
import java.util.ArrayList;

ArrayList<Integer> numbers = new ArrayList<>();

numbers.add(10);
numbers.add(20);
numbers.add(30);
numbers.add(40);


Here, we can add more elements without specifying the size initially.
5.2 Understanding the syntax
ArrayList<Account> accounts = new ArrayList<>();


Let's break it down:
Part	Meaning
ArrayList	Collection class
Account	Type of objects stored
accounts	Reference variable
new ArrayList<>()	Creates an empty ArrayList

The important part is Account.

It means this ArrayList stores Account objects, not integers or strings.
5.3 Important ArrayList methods
Method	Purpose
add()	Adds an element
get(index)	Retrieves an element
set(index, value)	Replaces an element
remove()	Removes an element
size()	Returns number of elements
isEmpty()	Checks whether the list is empty
contains()	Checks whether an element exists

Where did we use ArrayList?
In Bank.java:
private ArrayList<Account> accounts;


Inside the constructor:
public Bank() {
    accounts = new ArrayList<>();
}


When creating an account:
accounts.add(account);


When deleting an account:
accounts.remove(i);


Important concept – Object references:

When we write:
accounts.add(account);


The ArrayList stores a reference to the Account object.

It doesn't create another Account object or copy all its attributes.

This means that when we update the account's balance, the object inside the ArrayList reflects that update too.

6. Loops
We used loops extensively to process multiple accounts.

Java provides several types of loops.
6.1 For loop
Used when we know how many times we want to execute something or want to iterate using an index.

Example:
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}


In our project, we used an indexed loop for account deletion:
for (int i = 0; i < accounts.size(); i++) {

    if (accounts.get(i).getAccountNumber() == accountNumber) {
        accounts.remove(i);
        break;
    }
}


Why did we use an indexed loop?

Because we needed to remove an account by its position safely without modifying the ArrayList through an enhanced for loop.
6.2 Enhanced for loop
An enhanced for loop is used to iterate through collections or arrays without manually managing an index.

Syntax:
for (DataType variable : collection) {
    // Statements
}


Example:
for (Account account : accounts) {
    System.out.println(account.getAccountNumber());
}


Understand this:
- accounts – Entire ArrayList.
- Account – Type of object.
- account – Temporary reference to the current object.
During each iteration, account refers to the next Account object.
Where did we use it?
Searching:
for (Account account : accounts) {
    if (account.getAccountNumber() == accountNumber) {
        System.out.println(account.getAccountHolderName());
        return;
    }
}


Account number uniqueness checking:
for (Account account : accounts) {
    if (account.getAccountNumber() == accountNumber) {
        return true;
    }
}



7. Conditional Statements
Conditional statements allow a program to make decisions based on conditions.

We used three important conditional structures.
7.1 if
Executes a block when a condition is true.
if (amount > 0) {
    balance += amount;
}


7.2 if-else
Executes one block if a condition is true and another if it is false.
if (amount > 0) {
    balance += amount;
} else {
    System.out.println("Invalid amount");
}


7.3 if-else-if ladder
Checks multiple conditions in order.
if (amount <= 0) {
    System.out.println("Invalid amount");
}
else if (amount > balance) {
    System.out.println("Insufficient balance");
}
else {
    balance -= amount;
}


Where did we use conditions?
- Checking whether the deposit amount is positive.
- Checking whether the withdrawal amount exceeds the balance.
- Checking whether an account exists.
- Checking whether a generated account number already exists.
- Checking whether the initial balance is valid.

8. Methods
What is a method?
A method is a block of code designed to perform a particular task.

Methods help us divide a large program into smaller, reusable parts.

Example:
public void deposit(int amount) {
    balance += amount;
}


Types of methods we used
1. Methods without return values
public void deposit(int amount) {
    // Logic
}


The return type is void, meaning the method does not return a value.

2. Methods with return values
public int getBalance() {
    return balance;
}


This method returns an integer.

3. Methods with parameters
public void withdraw(int amount) {
    // Logic
}


Here, amount is a parameter.

4. Methods with no parameters
public int generateAcNo() {
    // Generate and return account number
}


Where did we use methods?
Method	Responsibility
createAccount()	Creates a new account
generateAcNo()	Generates a random account number
accountNumberCreation()	Ensures account number uniqueness
isAccountNumberExists()	Checks whether an account number exists
deposit()	Deposits money
withdraw()	Withdraws money
checkBalance()	Displays balance
deleteAccount()	Deletes an account
searchAccount()	Searches for an account

The main benefit is that we can reuse the same method whenever required.

9. Random Class
We used Java's Random class to generate account numbers automatically.
What is Random?
Random is a Java utility class that generates pseudorandom values.

First, import it:
import java.util.Random;


Create an object:
Random rr = new Random();


Generate a random integer:
int number = rr.nextInt(100);


This generates a number from 0 to 99.
Understanding our account number generator
public int generateAcNo() {

    Random rr = new Random();

    int min = 99999;
    int max = 99999999;

    return rr.nextInt(max - min + 1) + min;
}


The important expression is:
rr.nextInt(max - min + 1) + min


It generates an integer between the minimum and maximum values, inclusive.
Why did we need uniqueness checking?
Random numbers can repeat.

For example:
Account 1 → 123456
Account 2 → 456789
Account 3 → 123456


This creates a duplicate account number.

So we created:
public boolean isAccountNumberExists(int accountNumber) {

    for (Account account : accounts) {

        if (account.getAccountNumber() == accountNumber) {
            return true;
        }
    }

    return false;
}


Then:
public int accountNumberCreation() {

    int accountNumber;

    do {
        accountNumber = generateAcNo();
    } while (isAccountNumberExists(accountNumber));

    return accountNumber;
}


This brings us to another concept.
10. do-while Loop
A do-while loop executes its statements at least once before checking the condition.

Syntax:
do {
    // Statements
} while (condition);


Difference between while and do-while:
while	do-while
Checks condition first	Executes first
May execute zero times	Executes at least once
Entry-controlled loop	Exit-controlled loop

Where did we use it?
In account number generation:
do {
    accountNumber = generateAcNo();
} while (isAccountNumberExists(accountNumber));


Why is this suitable?

We must generate at least one account number before checking whether it already exists.

If it exists, we generate another one.

11. return and break
These two keywords are often confused by beginners.
return
Terminates the current method immediately.

Example:
public void checkBalance(int accountNumber) {

    for (Account account : accounts) {

        if (account.getAccountNumber() == accountNumber) {
            System.out.println(account.getBalance());
            return;
        }
    }

    System.out.println("Account not found");
}


Once the matching account is found, return exits the entire method.
break
Terminates the nearest loop or switch statement.

Example:
for (int i = 0; i < 5; i++) {

    if (i == 3) {
        break;
    }

    System.out.println(i);
}


Output:
0
1
2


Where did we use them?
- return – To stop searching once an account is found.
- return – To prevent the account-not-found message from appearing after a successful operation.
- break – To exit switch cases and loops.
Remember: return exits a method; break exits a loop or switch.

12. Scanner Class
The Scanner class is used to accept input from the user.

Import:
import java.util.Scanner;


Create an object:
Scanner sc = new Scanner(System.in);


Important Scanner methods:
Method	Input type
nextInt()	Integer
nextDouble()	Decimal
next()	Single word
nextLine()	Complete line
nextFloat()	Float

Where did we use it?
In Main.java:
Scanner sc = new Scanner(System.in);


For account holder name:
String name = sc.nextLine();


For initial balance:
int balance = sc.nextInt();


Important: nextInt() and nextLine() problem
When you use:
int age = sc.nextInt();
String name = sc.nextLine();


The nextLine() may consume the leftover newline from the previous input.

Correct approach:
int age = sc.nextInt();
sc.nextLine();

String name = sc.nextLine();


We encountered this issue while building your Main class.

13. switch Statement
A switch statement allows us to execute different blocks depending on a selected value.

Example:
switch (choice) {

    case 1:
        System.out.println("Create Account");
        break;

    case 2:
        System.out.println("Delete Account");
        break;

    case 3:
        System.out.println("Check Balance");
        break;

    default:
        System.out.println("Invalid choice");
}


Where did we use it?
In Main.java, to implement our banking menu.

The user enters a number, and the corresponding operation is executed.

We used default to handle invalid menu choices.

14. do-while Menu System
We combined do-while and switch to create a menu-driven application.

Example:
int choice;

do {

    System.out.println("1. Create Account");
    System.out.println("2. Delete Account");
    System.out.println("3. Exit");

    choice = sc.nextInt();

    switch (choice) {

        case 1:
            // Create account
            break;

        case 2:
            // Delete account
            break;

        case 3:
            System.out.println("Thank you!");
            break;

        default:
            System.out.println("Invalid choice");
    }

} while (choice != 3);


Why did we use do-while?

Because we want the menu to appear at least once and continue appearing until the user selects Exit.

15. Packages and Imports
What is a package?
A package is a mechanism for organizing related Java classes.

For example:
package oopprojectss.bankaccountsimulator;


This means all three classes belong to the same package.

Your project structure could look like:
src/
 └── oopprojectss/
      └── bankaccountsimulator/
           ├── Account.java
           ├── Bank.java
           └── Main.java


What is import?
An import statement allows us to use classes from other packages without writing their fully qualified names.

Examples from our project:
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


- ArrayList – Stores multiple account objects.
- Random – Generates account numbers.
- Scanner – Accepts user input.

16. Separation of Responsibilities
This is an important software design concept that we practised in this project.

Instead of writing all the code inside one class, we divided the application into three classes.
Class	Responsibility
Account	Account information and transaction rules
Bank	Managing multiple accounts
Main	Menu and user interaction

For example, when a user deposits money:
Main.java

Receives account number and deposit amount


Bank.java

Finds the matching account object


Account.java

Validates the amount and updates the balance


This makes the program easier to understand, debug, maintain and extend.

This design is related to the principle of Separation of Concerns: each part of the application should have a clear responsibility.

17. Input Validation
Input validation means checking whether user-provided data is valid before processing it.

We used this in multiple places.
Deposit validation
if (amount > 0) {
    balance += amount;
} else {
    System.out.println("Enter a valid amount!");
}


Withdrawal validation
if (amount <= 0) {
    System.out.println("Enter a valid amount.");
}
else if (amount > balance) {
    System.out.println("Insufficient balance!");
}
else {
    balance -= amount;
}


Account number validation
if (account.getAccountNumber() == accountNumber) {
    // Account found
}


Initial balance validation
if (balance < 0) {
    System.out.println("Invalid initial balance");
    return;
}


Input validation prevents incorrect data from entering the system.

18. CRUD Operations
CRUD is a very important concept in application development.

CRUD stands for:
Operation	Meaning	Our Bank Project
C – Create	Add new data	createAccount()
R – Read	Retrieve data	searchAccount(), checkBalance()
U – Update	Modify data	deposit(), withdraw()
D – Delete	Remove data	deleteAccount()

Our Bank Account Simulator implemented all four CRUD operations.

This is particularly important because many real-world applications are built around CRUD functionality.

19. Concepts we have NOT yet implemented
There are some concepts that will be introduced in our next project.

Don't confuse these with what we already used in the Bank Account Simulator.
Concept	Bank Project	Next Project
Classes and objects	Used	Revision
Constructors	Used	Revision
Encapsulation	Used	Revision
ArrayList	Used	Revision
CRUD operations	Used	Revision
Sorting	Not implemented	New
File handling	Not implemented	New
Saving data permanently	Not implemented	New
Loading data from a file	Not implemented	New

One important distinction: our Bank project stored data in an ArrayList, which exists only while the program is running. When the program terminates, that data is lost. We did not implement permanent storage.