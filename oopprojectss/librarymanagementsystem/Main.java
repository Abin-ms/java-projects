package oopprojectss.librarymanagementsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library li = new Library();

        int choice;
        do {
            System.out.println("=====Menu=====");
            System.out.println("1.Add Book");
            System.out.println("2.Display all Books.");
            System.out.println("3.Search Book.");
            System.out.println("4.Borrow Book.");
            System.out.println("5.Return Book.");
            System.out.println("6.Remove Book.");
            System.out.println("7.Exit.");

            System.out.println("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Book id : ");
                    int bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Title of the Book : ");
                    String title = sc.nextLine();
                    System.out.println("Enter Authors name : ");
                    String author = sc.nextLine();
                    Book book = new Book(bookId, title, author);
                    li.addBook(book);
                    break;

                case 2:
                    li.displayBooks();
                    break;

                case 3:
                    System.out.println("Enter BookId : ");
                    bookId = sc.nextInt();
                    li.searchBooks(bookId);
                    break;

                case 4:
                    System.out.println("Enter BookId : ");
                    bookId = sc.nextInt();
                    li.borrowBooks(bookId);
                    break;

                case 5:
                    System.out.println("Enter BookId : ");
                    bookId = sc.nextInt();
                    li.returnBooks(bookId);
                    break;

                case 6:
                    System.out.println("Enter BookId : ");
                    bookId = sc.nextInt();
                    li.removeBook(bookId);
                    break;

                case 7:
                    System.out.println("Thank you!!!!");
                    break;

                default:
                    System.out.println("Invalid Input!!!");
                    break;
            }

        } while (choice != 7);

        sc.close();
    }
}
