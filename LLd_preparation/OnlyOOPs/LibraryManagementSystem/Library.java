package LLd_preparation.OnlyOOPs.LibraryManagementSystem;

import java.util.*;

public class Library {
    private Map<Integer, Book> booklist = new HashMap<>();
    private Map<Integer, List<Integer>> transaction = new HashMap<>();


    public Map<Integer, List<Integer>> getTransaction() {
        return transaction;
    }

    public Map<Integer, Book> getBooklist() {
        return booklist;
    }

    public void setBooklist(Map<Integer, Book> booklist) {
        this.booklist = booklist;
    }

    public void setTransaction(Map<Integer, List<Integer>> transaction) {
        this.transaction = transaction;
    }
}
