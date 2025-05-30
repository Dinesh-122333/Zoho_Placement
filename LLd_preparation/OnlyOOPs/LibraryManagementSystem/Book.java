package LLd_preparation.OnlyOOPs.LibraryManagementSystem;

import java.util.List;

public class Book {
    static int id = 1;
    private String bname;
    private int bno;
    private String Author;
    private boolean available;
    private String genre;
    private String booktaken;
    private String bookreturn;
    private int quantity;


    public Book(String bname, String author, String genre) {
        this.bname = bname;
        this.bno = id++;
        this.Author = author;
        this.available = true;
        this.genre = genre;
        this.booktaken = "";
        this.bookreturn = "";
    }


    public void setBooktaken(String booktaken) {
        this.booktaken = booktaken;
    }

    public void setBookreturn(String bookreturn) {
        this.bookreturn = bookreturn;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static int getId() {
        return id;
    }

    public String getBname() {
        return bname;
    }

    public int getBno() {
        return bno;
    }

    public String getAuthor() {
        return Author;
    }

    public boolean isAvailable() {
        return available;
    }

    public String getGenre() {
        return genre;
    }

    public String getBooktaken() {
        return booktaken;
    }

    public String getBookreturn() {
        return bookreturn;
    }
}
