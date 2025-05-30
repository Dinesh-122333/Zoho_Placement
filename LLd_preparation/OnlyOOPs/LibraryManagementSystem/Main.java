package LLd_preparation.OnlyOOPs.LibraryManagementSystem;

import java.util.*;
//import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Library library = new Library();

        boolean loop = true;
        while (loop){
            System.out.println("1. Add book to library \n 2. Add user details\n 3. Borrow book\n 4. Generate Report");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1){
                System.out.println("Enter the book name: ");
                String bname = sc.next();

                System.out.println("Enter the author name: ");
                String author = sc.next();

                System.out.println("Enter the genre: ");
                String genre = sc.next();

                System.out.println("Enter the number of qty: ");
                int qty = sc.nextInt();

                Book book = new Book(bname, author, genre);
                if (book.getQuantity() == 0){
                    book.setQuantity(qty);
                }
                else {
                    book.setQuantity(book.getQuantity() + qty);
                }
                library.getBooklist().put(book.getBno(), book);

            }  else if (choice == 2) {
                System.out.println("Enter the user name: ");
                String name = sc.next();
                
                User user = new User(name);
                if (user.getUserList() == null){
                    List<User> users = new ArrayList<>();
                    users.add(user);
                    user.setUserList(users);
                }
                else {
                    user.getUserList().add(user);
                }

            } else if (choice == 3) {
                System.out.println("Enter the Book id: ");
                int bid = sc.nextInt();

                System.out.println("Enter the User id: ");
                int uid = sc.nextInt();

                System.out.println("Enter the date: ");
                String takedate = sc.next();

                Book b = library.getBooklist().get(bid);
                b.setBooktaken(takedate);
                System.out.println(b.getGenre());
                if (b.getGenre().equals("Action")){
                    int month = Integer.parseInt(takedate.substring(3, 5)) + 3;
                    if (month > 12) {
                        month -= 12;
                    }
                    String updatedMonthString = String.format("%02d", month);
                    System.out.println(takedate.substring(0, 3) + updatedMonthString + takedate.substring(5));
                    b.setBookreturn(takedate.substring(0, 3)  + updatedMonthString + takedate.substring(5));
                }
            } else if (choice == 4) {
                System.out.println("1. list the book details\n 2. list the transaction details ");
                System.out.println("3. list the book in given date");
                int userdata = sc.nextInt();

                if (userdata == 1){
                    Map<Integer, Book> bookMap = library.getBooklist();
                    for (Map.Entry<Integer, Book> entry: bookMap.entrySet()){
                        System.out.println("Bookid: " + entry.getKey());

                        Book b = entry.getValue();
                        System.out.println("Book Name: " + b.getBname());

                        System.out.println("Book Author: " + b.getAuthor());

                        System.out.println("Book Genre: " + b.getGenre());

                        System.out.println("Book stock: " + b.getQuantity());

                        System.out.println("Book Taken date: " + b.getBooktaken());

                        System.out.println("Book Return date: " + b.getBookreturn());
                        System.out.println();
                        System.out.println("----------------------------------------");
                    }
                } else if (userdata == 2) {

                } else if (userdata == 3) {

                }

            } else {
                loop = false;
            }
        }
    }
}
