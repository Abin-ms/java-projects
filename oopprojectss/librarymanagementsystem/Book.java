package oopprojectss.librarymanagementsystem;

public class Book {

    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getisAvailable() {
        return isAvailable;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setisAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void displayBookDetails() {
        System.out.println("Book ID :" + this.bookId);
        System.out.println("Title :" + this.title);
        System.out.println("Author :" + this.author);
        if (this.isAvailable) {
            System.out.println("Availability : Available");

        } else {
            System.out.println("Availability :Not Available");
        }

    }

}
