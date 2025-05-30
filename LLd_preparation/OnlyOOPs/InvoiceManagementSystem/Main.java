package LLd_preparation.OnlyOOPs.InvoiceManagementSystem;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean loop = true;
        ItemsManager itemsManager = new ItemsManager();

        Items items1 = new Items("Headphone", 400);
        Items items2 = new Items("Speaker", 1000);
        Items items3 = new Items("SD card", 500);
        Items items4 = new Items("Battery", 6000);

        itemsManager.setItemsList(items1);
        itemsManager.setItemsList(items2);
        itemsManager.setItemsList(items3);
        itemsManager.setItemsList(items4);

        CustomerManager customerManager = new CustomerManager();
        while (loop){
            System.out.println(" 1. Add Customer\n 2. Add Invoice\n 3. Add Item to Invoice");
            System.out.println(" 4. List all Customer\n 5. List all the Invoices\n 6. List all invoices of a customer");
            System.out.println(" 7. Display an invoice");

            System.out.println("Enter the choice: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter customer name: ");
                    String name = sc.next();

                    System.out.println("Enter address: ");
                    String address = sc.next();

                    System.out.println("Enter Mobile no: ");
                    long phone = sc.nextInt();

                    Customer customer = new Customer(name, address, phone);
                    customerManager.setCustomerHashMap(customer.getId(), customer);
                    System.out.println("Your customer id is " + customer.getId());
                    break;

                case 2:
                    System.out.println("1. Existing Customer\n2. New Customer");
                    int userChoice = sc.nextInt();

                    if (userChoice == 1){

                    } else if (userChoice == 2) {
                        System.out.println("Enter the customer id: ");
                        int custId = sc.nextInt();

                        boolean innerLoop = true;
                        while (innerLoop){
                            List<Items> itemsList = itemsManager.getItemsList();
                            for (int i = 0; i < itemsList.size(); i++) {
                                System.out.print(itemsList.get(i).getId() + " ");
                                System.out.print(itemsList.get(i).getName() + " Rs.");
                                System.out.print(itemsList.get(i).getAmount());
                                System.out.println();
                            }

                            System.out.println("Enter the item number: ");
                            int itemNo = sc.nextInt();

                            Invoice invoice = new Invoice();
                            invoice.setItemsList(itemsList.get(itemNo - 1));

                        }

                    }
            }

        }
    }
}
