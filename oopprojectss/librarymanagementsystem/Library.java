package oopprojectss.librarymanagementsystem;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Member> members;

    Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);

    }
    public void addMember(Member member){
        members.add(member);
    }
    public void removeMember(int memberId){
        for(Member member : members){
            if(member.getMemberId() == memberId){
                members.remove(member);
                return ;
            }
            else{
                System.out.println("Member not found!!!");
            }
        }
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No book is available in the Library!!!");
        } else {
            for (Book book : books) {
                book.displayBookDetails();
            }

        }
    }

    public void searchBooks(int bookId) {
        boolean bookFound = false;

        for (Book book : books) {
            if (book.getBookId() == bookId) {
                book.displayBookDetails();
                bookFound = true;
                return;
            }
        }
        if (!bookFound) {
            System.out.println("Sorry the Book with id" + bookId + " was not found..");
        }

    }

    public void borrowBooks(int bookId) {
        boolean bookFound = false;
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                bookFound = true;
                if (book.getisAvailable()) {
                    book.setisAvailable(false);
                    System.out.println(book.getTitle() + " is available , status updated to issued.");
                } else {
                    System.out.println(book.getTitle() + " is not available.");
                }
                break;
            }
        }
        if (!bookFound) {
            System.out.println("Sorry the Book with id" + bookId + " was not found..");
        }

    }

    public void returnBooks(int bookId) {
        boolean bookFound = false;
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                bookFound = true;
                if (book.getisAvailable()) {
                    System.out.println(book.getTitle() + " is not Currently issued.");
                } else {
                    System.out.println(book.getTitle() + " returned Succesfully..");
                    book.setisAvailable(true);
                }

            }
        }
        if (!bookFound) {
            System.out.println("The book is not found.!!");
        }
    }

    public void removeBook(int bookId) {

        for (Book book : books) {
            if (book.getBookId() == bookId) {
                if (book.getisAvailable()) {
                    books.remove(book);
                    System.out.println("Book is removed succesfully..!!1");
                    return;
                }
                else{
                    System.out.println("Book is Borrowed cannot remove borrowed books.!!!");
                }

            }

        }
        System.out.println("Book is not found in the library...");
    }

}
