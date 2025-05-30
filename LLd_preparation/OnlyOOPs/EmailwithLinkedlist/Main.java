package LLd_preparation.OnlyOOPs.EmailwithLinkedlist;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner sc = new Scanner(System.in);

        Storage storage = new Storage();
        while (loop){
            System.out.println("1. Add mail\n2. Delete/edit mail\n3. Print mail");
            System.out.println("4. Search mail\n5. Add tag\n6. Search by tag\n7. Add important tag");
            System.out.println("8.List by important\n9. Search on Regex\n10. print all");

            System.out.println("Enter your choice");
            int choice = sc.nextInt();


            switch (choice){
                case 1:
                    sc.nextLine();

                    System.out.println("Enter the from address: ");
                    String from = sc.nextLine();

                    System.out.println("Enter the to address: ");
                    String to = sc.nextLine();

                    System.out.println("Enter the subject: ");
                    String subject = sc.nextLine();

                    System.out.println("Enter the content: ");
                    String content = sc.nextLine();  // Allows multi-word input

                    Email email = new Email(from, to, subject, content);
                    storage.addMail(email);

                    System.out.println("*****************************");
                    break;

                case 2:
                    System.out.println("1. Delete the mail\n2. Edit the mail");
                    System.out.println("Enter your choice:");
                    int uChoice = sc.nextInt();

                    System.out.println("Enter the mailId to be deleted: ");
                    int mailId = sc.nextInt();
                    if (uChoice == 1){
                        storage.deleteMail(mailId);
                    }
                    else if (uChoice == 2){
                        sc.nextLine(); // ✅ Flush newline

                        System.out.println("Enter the older text");
                        String older = sc.nextLine();

                        System.out.println("Enter the replacing text");
                        String replace = sc.nextLine();

                        storage.editMail(mailId, older, replace);
                    }
                    System.out.println("******************************");
                    break;

                case 3:
                    System.out.println("Enter your mailId: ");
                    int mailid = sc.nextInt();

                    storage.printMail(mailid);
                    System.out.println("*******************************");
                    break;

                case 4:
                    sc.nextLine(); // ✅ Flush newline
                    System.out.println("Enter the content to search: ");
                    String contenttoSearch = sc.nextLine();
                    storage.searchMail(contenttoSearch);
                    System.out.println("**********************************");
                    break;

                case 5:

                    System.out.println("Enter the mailId: ");
                    int mid = sc.nextInt();

                    sc.nextLine(); // ✅ Flush newline
                    System.out.println("Enter the tags: ");
                    String tag = sc.nextLine();

                    storage.addTag(mid, tag);
                    System.out.println("**********************************");
                    break;

                case 6:
                    sc.nextLine(); // ✅ Flush newline
                    System.out.println("Enter the tags: ");
                    String usertag = sc.nextLine();

                    storage.listbyTag(usertag);
                    System.out.println("**********************************");
                    break;

                case 7:
                    System.out.println("Enter the mailId: ");
                    int id = sc.nextInt();

                    storage.addImportant(id);
                    System.out.println("**********************************");
                    break;

                case 8:

                    storage.listbyImportant();
                    System.out.println("**********************************");
                    break;

                case 10:
                    storage.printAll();
                    System.out.println("**********************************");
                    break;

                default:
                    loop = false;
                    break;
            }
        }
        sc.close();
    }
}
