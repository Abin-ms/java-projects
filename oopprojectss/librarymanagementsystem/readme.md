# Java Library Management System – Complete Concept Explanation

Congratulations on completing your Library Management System!

This is an important milestone in your Java OOP learning journey because you have moved beyond writing individual programs and started building a project where multiple classes communicate with each other.

Now, let's understand every important Java concept used in this project, why we used it, how it works, and exactly where we implemented it.

I'll explain this in a way that also helps you answer questions about the project during technical interviews.

# 1. Understanding the project architecture

Before discussing individual concepts, let's understand what we built.

Our application is a console-based Library Management System that allows users to:

- Add books to the library.
- Display all available books.
- Search for books using their IDs.
- Borrow books.
- Return borrowed books.
- Remove books from the library.

We divided the application into three classes.

## Project architecture

Main.java

User interaction • Menu • Input handling

Calls methods

Library.java

Book collection • Library operations

Manages Book objects

Book.java

Book information • Availability • Book details

### Why did we create three different classes?

Imagine writing the entire application inside one class.

You would have:

- Book attributes.
- Book constructors.
- ArrayList operations.
- Borrowing logic.
- Returning logic.
- Menu operations.
- User input handling.

Everything would be mixed together.

Instead, we separated responsibilities:

| Class   | Responsibility                |
| ------- | ----------------------------- |
| Book    | Represents an individual book |
| Library | Manages a collection of books |
| Main    | Interacts with the user       |

This makes the application easier to understand, maintain, debug, and extend.

# 2. Classes and Objects

Core OOP concept

This is one of the most fundamental concepts we used.

### What is a class?

A class is a blueprint or template used to create objects.

It defines:

- Attributes (data).
- Methods (behaviour).

For example, in our project:

```
public class Book {

    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;

}
```

Here, `Book` is a class.

It defines what information every book object should contain.

### What is an object?

An object is an instance of a class.

It represents an actual entity created using that class.

For example:

```
Book book1 = new Book(101, "Java", "James Gosling");

Book book2 = new Book(102, "Python", "Guido van Rossum");
```

Here:

- `book1` is an object.
- `book2` is another object.
- Both are created using the `Book` class.

Class versus objects

Book class

Blueprint

book1

ID: 101

Title: Java

Author: James Gosling

book2

ID: 102

Title: Python

Author: Guido van Rossum

Both objects have the same structure but store different data.

### Where did we use this?

In `Main.java`:

```
Library li = new Library();
```

We created a Library object.

```
Book book = new Book(bookId, title, author);
```

We created a Book object.

### Important distinction

```
Book book;
```

This declares a reference variable.

```
new Book(101, "Java", "James Gosling");
```

This creates a new object.

```
Book book = new Book(101, "Java", "James Gosling");
```

This creates an object and stores its reference in `book`.

Interview question: What is the difference between a class and an object?

Answer: A class is a blueprint that defines the properties and behaviours of an entity, whereas an object is an instance of that class containing actual data.

# 3. Encapsulation

Core OOP concept

### What is encapsulation?

Encapsulation is the process of wrapping data and the methods that operate on that data into a single unit (class), while controlling direct access to that data.

In simple words:

Encapsulation protects the data of an object from uncontrolled external access.

### Where did we use it?

Inside `Book.java`:

```
public class Book {

    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;

}
```

Notice that we declared all attributes as `private`.

What does `private` mean?

It means these variables can only be directly accessed within the `Book` class.

For example, this is not allowed from `Main.java`:

```
book.title = "Java Programming";
```

Because `title` is private.

Instead, we use getter and setter methods.

### Getters

A getter is a method used to retrieve the value of a private variable.

Example:

```
public String getTitle() {
    return title;
}
```

Usage:

```
System.out.println(book.getTitle());
```

This retrieves the book's title.

### Setters

A setter is a method used to modify the value of a private variable.

Example:

```
public void setAvailable(boolean isAvailable) {
    this.isAvailable = isAvailable;
}
```

Usage:

```
book.setAvailable(false);
```

This changes the availability of the book.

### Why is encapsulation useful?

Imagine that anyone could directly modify the availability of a book.

A user could accidentally change a borrowed book to available without performing a proper return operation.

Encapsulation gives us control over how data is accessed and modified.

Interview question: Why do we declare variables as private in Java?

Answer: We declare variables as private to prevent direct external access and protect the internal state of an object. We use public getter and setter methods to provide controlled access.

Important: Getters and setters support encapsulation, but they don't automatically guarantee data validation. We can add validation inside setters when needed.

# 4. Constructors

### What is a constructor?

A constructor is a special member of a class that is automatically executed when an object is created.

Its primary purpose is to initialize an object's attributes.

Important characteristics:

1. The constructor name must be the same as the class name.
2. It does not have a return type, not even `void`.
3. It is executed when an object is created using `new`.
4. It can accept parameters.

### Where did we use it?

Inside `Book.java`:

```
public Book(int bookId, String title, String author) {

    this.bookId = bookId;
    this.title = title;
    this.author = author;
    this.isAvailable = true;

}
```

When we execute:

```
Book book = new Book(101, "Java", "James Gosling");
```

Java automatically calls the constructor.

The values are initialized as follows:

| Attribute   | Initial value |
| ----------- | ------------- |
| bookId      | 101           |
| title       | Java          |
| author      | James Gosling |
| isAvailable | true          |

### Types of constructors

There are two commonly introduced types:

1\. Default constructor

If we don't write any constructor, Java provides a default no-argument constructor automatically.

```
class Book {

    int bookId;

}
```

We can create:

```
Book b = new Book();
```

2\. Parameterized constructor

A constructor that accepts parameters.

```
public Book(int bookId, String title) {
    this.bookId = bookId;
    this.title = title;
}
```

We used a parameterized constructor in our project.

Note: If you define your own constructor, Java does not automatically provide the default no-argument constructor.

# 5. `this` keyword

### What is `this`?

The `this` keyword is a reference variable in Java that refers to the current object.

It is commonly used when instance variables and constructor or method parameters have the same names.

### Where did we use it?

Inside our Book constructor:

```
public Book(int bookId, String title, String author) {

    this.bookId = bookId;
    this.title = title;
    this.author = author;

}
```

Let's understand this statement:

```
this.bookId = bookId;
```

- `this.bookId` refers to the instance variable belonging to the current object.
- `bookId` refers to the constructor parameter.

Suppose we execute:

```
Book b1 = new Book(101, "Java", "James Gosling");
```

Here, `this.bookId` refers to the `bookId` attribute of object `b1`.

Without `this`, Java would not distinguish the parameter from the instance variable when they have the same name.

### Another example

```
public void setTitle(String title) {
    this.title = title;
}
```

This updates the title of the current Book object.

Interview question: What is the purpose of the `this` keyword?

Answer: The `this` keyword refers to the current object and is used to access its instance variables, methods, and constructors. It is particularly useful when local variables or parameters have the same names as instance variables.

# 6. Access Modifiers

### What are access modifiers?

Access modifiers are keywords that define the visibility and accessibility of classes, variables, constructors, and methods.

Java provides four access levels.

| Modifier  | Same class | Same package | Other package (subclass) | Other package (non-subclass) |
| --------- | ---------- | ------------ | ------------------------ | ---------------------------- |
| private   | Yes        | No           | No                       | No                           |
| default   | Yes        | Yes          | Yes                      | No                           |
| protected | Yes        | Yes          | Yes                      | No                           |
| public    | Yes        | Yes          | Yes                      | Yes                          |

### Where did we use them?

Private:

```
private int bookId;
private String title;
```

Used to protect the Book attributes.

Public:

```
public int getBookId() {
    return bookId;
}
```

Used to allow other classes to access the getter method.

Default access:

```
Library() {
    books = new ArrayList<>();
}
```

Your Library constructor has default (package-private) access because you didn't specify an access modifier.

Since all three classes belong to the same package, `Main.java` can access it.

You could make it public for clarity:

```
public Library() {
    books = new ArrayList<>();
}
```

# 7. Methods in Java

### What is a method?

A method is a block of code that performs a particular operation.

Methods help us divide a large program into smaller, reusable units.

### Where did we use methods?

We created several methods in our project.

| Method                                | Class   | Purpose               |
| ------------------------------------- | ------- | --------------------- |
| `getBookId()`                         | Book    | Returns book ID       |
| `getTitle()`                          | Book    | Returns title         |
| `getAuthor()`                         | Book    | Returns author        |
| `isAvailable()` / `getisAvailable()`  | Book    | Returns availability  |
| `setAvailable()` / `setisAvailable()` | Book    | Changes availability  |
| `displayBookDetails()`                | Book    | Displays book details |
| `addBook()`                           | Library | Adds a book           |
| `displayBooks()`                      | Library | Displays all books    |
| `searchBooks()`                       | Library | Searches for a book   |
| `borrowBooks()`                       | Library | Borrows a book        |
| `returnBooks()`                       | Library | Returns a book        |
| `removeBook()`                        | Library | Removes a book        |

### Method syntax

```
public returnType methodName(parameters) {

    // Method body

}
```

Example:

```
public void addBook(Book book) {
    books.add(book);
}
```

Let's understand each part:

- `public`: Access modifier.
- `void`: Does not return a value.
- `addBook`: Method name.
- `Book book`: Parameter accepting a Book object.
- `books.add(book)`: Actual operation.

### Methods with return values

Example:

```
public String getTitle() {
    return title;
}
```

This method returns a String.

### Methods without return values

Example:

```
public void displayBooks() {
    // Display books
}
```

This method performs an operation but doesn't return a value.

Why did we use methods?

Instead of writing all the borrowing logic inside `Main.java`, we created a separate method in `Library.java`.

This makes the code reusable and organized.

# 8. ArrayList – Collection Framework

Very important Java concept

This is one of the most important concepts used in our project.

### What is an ArrayList?

`ArrayList` is a resizable collection in Java that stores elements dynamically.

Unlike a normal array, its size can increase or decrease during program execution.

### Why did we use ArrayList?

Imagine our library initially contains five books.

Later, a user adds ten more books.

If we use a normal array:

```
Book[] books = new Book[5];
```

Its capacity is fixed at five.

We cannot directly add a sixth element.

But with ArrayList:

```
ArrayList<Book> books = new ArrayList<>();
```

We can add as many books as needed, subject to available memory.

### Where did we use it?

Inside `Library.java`:

```
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

}
```

Let's understand this statement:

```
private ArrayList<Book> books;
```

- `ArrayList`: Collection class.
- `Book`: Type of objects stored in the collection.
- `books`: Reference variable.

We are storing Book objects, not individual integers or strings.

### Important ArrayList methods we used

1\. add()

Adds an object to the collection.

```
books.add(book);
```

Used inside `addBook()`.

2\. remove()

Removes an element from the collection.

```
books.remove(i);
```

Used inside `removeBook()`.

3\. isEmpty()

Checks whether the collection contains any elements.

```
if (books.isEmpty()) {
    System.out.println("No books available!");
}
```

Used inside `displayBooks()`.

4\. size()

Returns the number of elements.

```
books.size();
```

Used when iterating with an indexed `for` loop.

5\. get()

Retrieves an element using its index.

```
books.get(i);
```

Used when accessing books during indexed iteration.

### Visual understanding

ArrayList of Book objects

Index 0

Book 101

Index 1

Book 102

Index 2

Book 103

Indexes start from 0. Each element is a reference to a Book object.

Interview question: What is the difference between an array and an ArrayList?

| Array                            | ArrayList                                             |
| -------------------------------- | ----------------------------------------------------- |
| Fixed size                       | Dynamically resizable                                 |
| Can store primitives and objects | Stores objects (primitive values use wrapper classes) |
| Uses `length`                    | Uses `size()`                                         |
| Less built-in functionality      | Provides methods such as `add()`, `remove()`, `get()` |

# 9. Generics in Java

You might have noticed this:

```
ArrayList<Book> books = new ArrayList<>();
```

What does `<Book>` mean?

This is called Generics.

Generics allow us to specify the type of data that a collection can store.

For example:

```
ArrayList<Integer> numbers = new ArrayList<>();

ArrayList<String> names = new ArrayList<>();

ArrayList<Book> books = new ArrayList<>();
```

In our project:

```
ArrayList<Book> books;
```

means that the ArrayList is designed to store Book objects.

This prevents us from accidentally adding unrelated objects.

For example:

```
books.add(new Book(101, "Java", "James Gosling"));
```

Valid.

```
books.add("Hello");
```

Invalid because a String is not a Book object.

Why are generics useful?

- Provide compile-time type safety.
- Reduce type-casting requirements.
- Make collections easier to understand.
- Prevent accidental insertion of incompatible data types.

# 10. Loops in Java

Loops allow us to execute a block of code repeatedly.

We used two important types of loops.

## A. Enhanced for loop (For-each loop)

### What is it?

An enhanced for loop is used to iterate through arrays and collections without manually managing indexes.

### Where did we use it?

Inside `displayBooks()`:

```
for (Book book : books) {

    book.displayBookDetails();

}
```

Let's understand it.

Suppose the ArrayList contains three books.

The loop works like this:

1. First iteration: `book` refers to Book 101.
2. Second iteration: `book` refers to Book 102.
3. Third iteration: `book` refers to Book 103.
4. Once all elements are processed, the loop terminates.

The general syntax is:

```
for (DataType variable : collection) {

    // Statements

}
```

Another example:

```
for (Book book : books) {

    if (book.getBookId() == bookId) {
        // Matching book found
    }

}
```

We used this approach in searching and borrowing books.

## B. Traditional for loop

### What is it?

A traditional for loop allows us to control iteration using an initialization, condition, and update expression.

### Where did we use it?

Inside `removeBook()`:

```
for (int i = 0; i < books.size(); i++) {

    if (books.get(i).getBookId() == bookId) {

        books.remove(i);
        break;
    }

}
```

Let's break it down:

| Part               | Meaning                       |
| ------------------ | ----------------------------- |
| `int i = 0`        | Start from index 0            |
| `i < books.size()` | Continue while index is valid |
| `i++`              | Increase index by 1           |

We used the indexed loop because we wanted to remove an element safely without modifying the ArrayList through an enhanced for loop.

Important: Modifying an ArrayList directly while using an enhanced for loop can cause `ConcurrentModificationException`. An indexed loop works here because we immediately exit after removal. An `Iterator` is another appropriate option.

# 11. Conditional Statements

Conditional statements allow a program to make decisions based on conditions.

We mainly used `if`, `else if`, and `else`.

### Where did we use them?

Example 1: Checking book availability

```
if (book.getisAvailable()) {

    book.setisAvailable(false);

    System.out.println("Book borrowed successfully!");

} else {

    System.out.println("Book is already borrowed!");

}
```

Here:

- If availability is `true`, the book can be borrowed.
- If availability is `false`, the book cannot be borrowed again.

Example 2: Checking whether the library is empty

```
if (books.isEmpty()) {

    System.out.println("No books available!");

} else {

    // Display books

}
```

Example 3: Searching by ID

```
if (book.getBookId() == bookId) {

    // Matching book found

}
```

We used conditional statements throughout the project to implement business logic.

# 12. Boolean Data Type

### What is boolean?

Boolean is a primitive data type in Java that stores only two values:

- `true`
- `false`

### Where did we use it?

Inside `Book.java`:

```
private boolean isAvailable;
```

We used it to represent the current availability of a book.

| Value   | Meaning           |
| ------- | ----------------- |
| `true`  | Book is available |
| `false` | Book is borrowed  |

### How does it work?

When a book is created:

```
this.isAvailable = true;
```

When a user borrows it:

```
book.setisAvailable(false);
```

When a user returns it:

```
book.setisAvailable(true);
```

This is an example of using a boolean variable to maintain the state of an object.

### Important: Logical NOT operator

We also used:

```
if (!book.getisAvailable()) {
    // Book is currently borrowed
}
```

The `!` operator reverses a boolean value.

| Expression | Result |
| ---------- | ------ |
| `!true`    | false  |
| `!false`   | true   |

This is particularly useful when checking whether a book has been borrowed.

# 13. Scanner Class – User Input

### What is Scanner?

`Scanner` is a predefined Java class used to read input from different sources, including keyboard input.

### Where did we use it?

Inside `Main.java`:

```
import java.util.Scanner;
```

We created a Scanner object:

```
Scanner sc = new Scanner(System.in);
```

Let's understand this statement.

- `Scanner`: Class name.
- `sc`: Reference variable.
- `new Scanner()`: Creates a Scanner object.
- `System.in`: Specifies standard keyboard input.

### Important Scanner methods

| Method          | Purpose                |
| --------------- | ---------------------- |
| `nextInt()`     | Reads an integer       |
| `nextDouble()`  | Reads a decimal number |
| `next()`        | Reads a single token   |
| `nextLine()`    | Reads an entire line   |
| `nextBoolean()` | Reads a boolean value  |

### Where did we use them?

For example:

```
int bookId = sc.nextInt();
```

Reads the book ID.

```
String title = sc.nextLine();
```

Reads the entire book title.

### Important Scanner problem: nextInt() and nextLine()

This is something you encountered while building the project.

Consider:

```
int id = sc.nextInt();
String title = sc.nextLine();
```

The problem is that `nextInt()` does not consume the newline after the number.

Therefore, we use:

```
int id = sc.nextInt();

sc.nextLine();

String title = sc.nextLine();
```

The additional `nextLine()` consumes the leftover newline.

This is an important concept to remember when working with Scanner.

# 14. do-while Loop

### What is a do-while loop?

A do-while loop executes its statements at least once before checking the condition.

Syntax:

```
do {

    // Statements

} while (condition);
```

### Where did we use it?

Inside `Main.java`:

```
do {

    System.out.println("1. Add Book");
    System.out.println("2. Display Books");
    System.out.println("3. Search Book");

    System.out.println("Enter your choice:");

    choice = sc.nextInt();

} while (choice != 7);
```

### Why did we use do-while instead of while?

Our application needs to display the menu at least once.

A do-while loop guarantees this.

Let's understand its execution:

1. Display the menu.
2. Accept the user's choice.
3. Execute the selected operation.
4. Check whether the choice is 7.
5. If the choice is not 7, display the menu again.
6. If the choice is 7, terminate the loop.

do-while execution flow

Display menu

Get user choice

Execute selected operation

Is choice equal to 7?

No

Repeat menu

Yes

Exit loop

# 15. switch Statement

### What is switch?

A switch statement is a control-flow statement that executes different blocks of code depending on the value of an expression.

It is useful when we have multiple fixed choices.

### Where did we use it?

Inside `Main.java`:

```
switch (choice) {

    case 1:
        // Add book
        break;

    case 2:
        // Display books
        break;

    case 3:
        // Search book
        break;

    case 4:
        // Borrow book
        break;

    case 5:
        // Return book
        break;

    case 6:
        // Remove book
        break;

    case 7:
        // Exit
        break;

    default:
        System.out.println("Invalid input!");

}
```

### How does it work?

Suppose the user enters:

```
Enter your choice: 3
```

Java checks the value of `choice`.

It matches `case 3` and executes the search operation.

### What is break?

`break` terminates the current switch case and prevents execution from falling through to the next case.

For example:

```
case 1:
    System.out.println("Add Book");
    break;

case 2:
    System.out.println("Display Books");
    break;
```

Without `break`, traditional switch cases can continue executing subsequent cases.

### What is default?

The `default` block executes when none of the cases match.

Example:

```
Enter your choice: 10

Invalid input!
```

Why did we use switch?

Because our application has seven fixed menu options. A switch statement makes the menu logic clean and readable.

# 16. break and return Statements

These two statements are very important because you encountered logical errors involving them during development.

### A. break

The `break` statement terminates the nearest enclosing loop or switch.

Example:

```
for (Book book : books) {

    if (book.getBookId() == bookId) {

        System.out.println("Book found!");
        break;
    }
}
```

Once the book is found, the loop terminates.

### B. return

The `return` statement terminates the current method.

Example:

```
public void searchBooks(int bookId) {

    for (Book book : books) {

        if (book.getBookId() == bookId) {

            book.displayBookDetails();
            return;
        }
    }
}
```

Once the book is found, the entire `searchBooks()` method terminates.

### Difference between break and return

| break                                        | return                                |
| -------------------------------------------- | ------------------------------------- |
| Terminates a loop or switch                  | Terminates the current method         |
| Execution continues after the loop or switch | Control returns to the calling method |
| Does not necessarily terminate the method    | Always exits the current method       |

This distinction helped us correct the search, borrow, and return methods.

# 17. Package in Java

### What is a package?

A package is a mechanism used to group related classes and interfaces together.

It helps organize code, avoid naming conflicts, and control access.

### Where did we use it?

At the beginning of all three Java files:

```
package oopprojectss.librarymanagementsystem;
```

This means that all three classes belong to the same package.

Our project structure:

```
src/
└── oopprojectss/
    └── librarymanagementsystem/
        ├── Main.java
        ├── Book.java
        └── Library.java
```

Because all three classes belong to the same package, they can access each other's package-private members.

### Why are packages useful?

- Organize related classes.
- Make large applications easier to manage.
- Prevent class naming conflicts.
- Provide package-level access control.

# 18. Object References and Object Interaction

Very important for understanding OOP

This is a concept that is easy to overlook, but understanding it will make you much better at Java.

Consider:

```
Book book = new Book(101, "Java", "James Gosling");

li.addBook(book);
```

What exactly happens here?

1. A new Book object is created in memory.
2. The variable `book` holds a reference to that object.
3. `li.addBook(book)` passes that reference to the Library object.
4. The Library stores the reference in its ArrayList.

Conceptually:

Main.java

`book` reference

Same object reference is passed

Library.java

`books` ArrayList

Element 0 → Book object

Book object

ID: 101

Title: Java

Availability: true

Now consider:

```
book.setisAvailable(false);
```

The object stored inside the ArrayList also reflects this change because both references point to the same object.

This is why our borrowing operation works without adding the book to the ArrayList again.

### Another example

Inside Library:

```
for (Book book : books) {

    if (book.getBookId() == bookId) {

        book.setisAvailable(false);

    }
}
```

We retrieve a reference to the existing object and modify its state.

Interview question: What happens when we pass an object to a method in Java?

Answer: Java passes the value of the reference by value. The method receives a copy of the reference that points to the same object, so it can modify that object's state.

# 19. Method Calling and Object Communication

We used method calling throughout our application to make different classes communicate.

### Where did we use it?

Inside `Main.java`:

```
li.addBook(book);
```

Here, we are calling the `addBook()` method of the Library object.

Similarly:

```
li.displayBooks();

li.searchBooks(bookId);

li.borrowBooks(bookId);

li.returnBooks(bookId);

li.removeBook(bookId);
```

All these methods belong to the `Library` class.

### Understand the execution flow

Suppose the user selects option 4 (Borrow Book).

The execution happens like this:

1. `Main.java` accepts the book ID.
2. Main calls `li.borrowBooks(bookId)`.
3. Java transfers control to the `borrowBooks()` method in Library.
4. Library searches the ArrayList.
5. It checks the book ID.
6. It checks availability.
7. It updates the book's availability.
8. Control returns to Main.

This is called interaction between objects through method calls.

# 20. static keyword and main() method

We also used the `static` keyword, although we didn't explicitly declare our own static methods.

### What is static?

The `static` keyword is used to declare members that belong to a class rather than individual objects.

### Where did we use it?

```
public static void main(String[] args)
```

Let's understand each keyword:

| Keyword       | Meaning                                       |
| ------------- | --------------------------------------------- |
| public        | Accessible from outside the class             |
| static        | Can be invoked without creating a Main object |
| void          | Does not return a value                       |
| main          | Entry-point method name                       |
| String[] args | Accepts command-line arguments                |

### Why is main() static?

The Java runtime needs to invoke the main method to start program execution.

Making it static allows it to be called without first creating an object of the Main class.

For example, we don't need:

```
Main obj = new Main();
obj.main(args);
```

The Java runtime invokes the entry-point method for us.

# 21. System.out.println() and System.in

These are Java's standard input/output facilities.

### Where did we use them?

For displaying information:

```
System.out.println("Book added successfully!");
```

For reading user input:

```
Scanner sc = new Scanner(System.in);
```

Let's understand:

- `System`: A predefined Java class.
- `out`: Standard output stream.
- `println()`: Prints text and moves to the next line.
- `in`: Standard input stream.

We used these to make our console application interactive.

# 22. Input Validation and Resource Management

There are two additional programming practices worth understanding.

### Input validation

Input validation means checking whether user-provided information is valid before processing it.

For example, in our project, we should check:

- Book ID should be positive.
- Book ID should not already exist.
- Title and author should not be empty.
- Menu choice should be between 1 and 7.

If you implemented these checks, they are part of your application's input validation.

### Resource management

At the end of Main, we used:

```
sc.close();
```

This closes the Scanner and releases its associated resources.

We should close resources when they are no longer needed.

One consideration: closing a Scanner created with `System.in` also closes standard input, so it should generally be done when the application is finished reading input.

# 23. Algorithms and Logic Used in Our Project

Apart from Java syntax and OOP, we also implemented some basic algorithms.

Let's understand them because interviewers often ask about the logic behind project operations.

### A. Linear Search

We used linear search to find a book using its ID.

Example:

```
for (Book book : books) {

    if (book.getBookId() == bookId) {

        book.displayBookDetails();
        break;

    }
}
```

How does it work?

Linear search checks each element one by one until the required element is found or the collection ends.

Suppose we have:

```
[101, 102, 103, 104, 105]
```

We search for `104`.

Execution:

```
101 → Not matched
102 → Not matched
103 → Not matched
104 → Matched!
```

Time complexity:

- Best case: O(1)
- Average case: O(n)
- Worst case: O(n)

Here, `n` represents the number of books.

### B. Insertion

We used:

```
books.add(book);
```

This inserts a new Book object into the ArrayList.

ArrayList generally adds an element at the end in amortized O(1) time.

### C. Deletion

We used:

```
books.remove(i);
```

This removes the book at a particular index.

ArrayList shifts subsequent elements to fill the gap.

Time complexity:

- Finding the element: O(n).
- Removing the element: O(n) in the worst case.

### D. Updating an object

We used:

```
book.setisAvailable(false);
```

This updates the availability attribute of an existing object.

The update itself takes O(1) time.

### Overall complexity

| Operation     | Time complexity |
| ------------- | --------------- |
| Add Book      | Amortized O(1)  |
| Display Books | O(n)            |
| Search Book   | O(n)            |
| Borrow Book   | O(n)            |
| Return Book   | O(n)            |
| Remove Book   | O(n)            |

These are the expected complexities for the basic implementations we built.

# 24. Which OOP principles have we actually implemented?

Java has four commonly recognized pillars of Object-Oriented Programming.

Let's see how our project relates to them.

## Four pillars of OOP

1\. Encapsulation

Implemented

Private attributes and public getters/setters in Book.java.

2\. Inheritance

Not implemented

We did not extend one class from another.

3\. Polymorphism

Not explicitly implemented

We did not implement method overriding or overloading as an OOP feature.

4\. Abstraction

Not explicitly implemented

We did not use abstract classes or interfaces.

An important distinction: Your project demonstrates object-oriented programming, but it does not need to demonstrate all four pillars.

We used classes, objects, encapsulation, constructors, and object interaction. That is already a good foundation.

# 25. Concepts we haven't implemented yet

To understand the project's current limitations, let's identify what we can learn next.

| Concept            | Current project     | Possible improvement                  |
| ------------------ | ------------------- | ------------------------------------- |
| Inheritance        | Not used            | Create Admin and Member classes       |
| Polymorphism       | Not used            | Override member-specific methods      |
| Abstraction        | Not used            | Create a LibraryOperations interface  |
| Exception handling | Not explicitly used | Handle invalid inputs using try-catch |
| File handling      | Not used            | Save books permanently in files       |
| Database           | Not used            | Store books in MySQL                  |
| Collections        | ArrayList           | Explore HashMap and HashSet           |

One important limitation: your current project stores data in memory. Once the program terminates, all added books and their updated availability are lost.

Later, we can introduce file handling or JDBC with MySQL to solve this.

# 26. Project concepts – Quick revision sheet

Here is a consolidated list of everything we covered.

| No. | Concept                | Where used                           |
| --- | ---------------------- | ------------------------------------ |
| 1   | Classes                | Book, Library, Main                  |
| 2   | Objects                | Creating Book and Library objects    |
| 3   | Encapsulation          | Private Book attributes              |
| 4   | Constructors           | Initializing Book objects            |
| 5   | `this` keyword         | Assigning constructor parameters     |
| 6   | Access modifiers       | Private and public members           |
| 7   | Methods                | All library operations               |
| 8   | Getters and Setters    | Accessing and modifying attributes   |
| 9   | ArrayList              | Storing Book objects                 |
| 10  | Generics               | `ArrayList<Book>`                    |
| 11  | Enhanced for loop      | Displaying and searching books       |
| 12  | Traditional for loop   | Removing books                       |
| 13  | if-else                | Availability and ID checking         |
| 14  | Boolean                | Maintaining book availability        |
| 15  | Scanner                | Accepting user input                 |
| 16  | do-while               | Repeating the menu                   |
| 17  | switch-case            | Handling menu choices                |
| 18  | break                  | Terminating loops and switch cases   |
| 19  | return                 | Exiting methods                      |
| 20  | Packages               | Organizing Java files                |
| 21  | Object references      | Sharing Book objects between classes |
| 22  | static                 | Main method                          |
| 23  | Standard I/O           | System.in and System.out             |
| 24  | Linear search          | Finding books by ID                  |
| 25  | Insertion and deletion | Managing the ArrayList               |

# 27. Interview preparation – Test your understanding

Now that you've completed the project, I want you to check whether you can explain the concepts without looking at the notes.

Here are 10 questions based directly on your project.

Project interview quiz

1 of 10

Question 1

Why did we declare the Book attributes as private?

Reveal answer

Previous

Next question&#x20;

# 28. What should you learn next?

Now that you've completed this project, I recommend the following progression:

Completed

Project 1 – Library Management System

Classes, objects, encapsulation, constructors, ArrayList, loops and object interaction.

Next

Project 2 – Bank Account Simulator

Practice encapsulation, validation, constructors, multiple objects and transaction management.

Project 3 – Student Grade Management System

Practice ArrayList, searching, sorting, calculations and object management.

Project 4 – Employee Payroll Calculator

Introduce inheritance, method overriding and polymorphism.

Project 5 – Inventory Management System

Practice collections, exception handling, file handling and more complex object interactions.

## My final advice

Don't just memorize the definitions in this explanation.

For every concept, make sure you can answer three questions:

1. What is it? – Definition.
2. Why did we use it? – Purpose.
3. Where did we use it? – Actual code from your project.

If you can explain these three things for every concept, you will be much more confident when discussing your project in interviews.

Your Library Management System is a good first step towards understanding real Java application development. Keep building on it!