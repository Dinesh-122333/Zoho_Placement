package LLd_preparation.OnlyOOPs.EmailwithLinkedlist;

class Node{
    Email data;
    Node next;

    public Node(Email mail){
        this.data = mail;
    }
}

public class Storage {
    Node head;

    public void addMail(Email mail){
        Node newNode = new Node(mail);
        if (head == null){
            head = newNode;
        }
        else {
            Node curNode = head;
            while (curNode.next != null) {
                curNode = curNode.next;
            }
            curNode.next = newNode;

        }
        System.out.println();
        System.out.println("Added new mail");
    }

    public void deleteMail(int mailId){
        if (head == null) {
            System.out.println("No mail added");
            return;
        }


        if (head.data.getMailid() == mailId){
            head.next = head.next.next;
            return;
        }

        Node curNode = head;
        while (curNode.next != null){
            if (curNode.next.data.getMailid() == mailId){
                curNode.next = curNode.next.next;
                System.out.println("Succesfully deleted the mail from mail id "+ mailId);
                return;
            }
            curNode = curNode.next;
        }

    }

    public void editMail(int mailId, String find, String replace){
        if (head == null) {
            System.out.println("No mail added");
            return;
        }

        Node curNode = head;
        while (curNode != null){
            if (curNode.data.getMailid() == mailId){
                String changeContent = curNode.data.getContent().replace(find, replace);
                curNode.data.setContent(changeContent);
                System.out.println("Succesfully edited the content of mail from mail id "+ mailId);
                return;
            }
            curNode = curNode.next;
        }

    }

    public void printMail(int mailId){
        if (head == null) {
            System.out.println("No mail added");
            return;
        }
        Node curNode = head;
        while (curNode != null){
            if(curNode.data.getMailid() == mailId){
                System.out.println("The mail id: " + curNode.data.getMailid());
                System.out.println("The from address: " + curNode.data.getFrom());
                System.out.println("The to address: " + curNode.data.getTo());
                System.out.println("The subject: " + curNode.data.getSubject());
                System.out.println("The content: " + curNode.data.getContent());
                return;
            }
            curNode = curNode.next;
        }
    }

    public void searchMail(String contenttoSearch){
        Node curNode = head;
        while (curNode != null){
            Email emailData = curNode.data;
            if (emailData.getTo().contains(contenttoSearch) || emailData.getFrom().contains(contenttoSearch) || emailData.getSubject().contains(contenttoSearch) || emailData.getContent().contains(contenttoSearch)){
                System.out.println("The mail id: " + curNode.data.getMailid());
                System.out.println("The from address: " + curNode.data.getFrom());
                System.out.println("The to address: " + curNode.data.getTo());
                System.out.println("The subject: " + curNode.data.getSubject());
                System.out.println("The content: " + curNode.data.getContent());
                return;
            }
            curNode = curNode.next;
        }
    }

    public void addTag(int mid, String tag){
        Node curNode = head;
        while (curNode != null){
            if (curNode.data.getMailid() == mid){
                curNode.data.setTag(tag);
                System.out.println("Tag added to mail " + curNode.data.getMailid());
                return;
            }
            curNode = curNode.next;
        }
    }

    public void listbyTag(String tag){
        Node curNode = head;
        System.out.println("--------" + tag + "---------");
        while (curNode != null){
            if (curNode.data.getTag().contains(tag)){
                System.out.println("The mail id: " + curNode.data.getMailid());
                System.out.println("The from address: " + curNode.data.getFrom());
                System.out.println("The to address: " + curNode.data.getTo());
                System.out.println("The subject: " + curNode.data.getSubject());
                System.out.println("The content: " + curNode.data.getContent());
                return;
            }
            curNode = curNode.next;
        }
    }

    public void addImportant(int mailId){
        Node curNode = head;

        while (curNode != null){
            if (curNode.data.getMailid() == mailId){
                curNode.data.setImportant(true);
            }
            curNode = curNode.next;
        }
    }

    public void listbyImportant(){
        Node curNode = head;

        System.out.println("-------Important mails-------");
        while (curNode != null){
            if (curNode.data.isImportant()){
                System.out.println("The mail id: " + curNode.data.getMailid());
                System.out.println("The from address: " + curNode.data.getFrom());
                System.out.println("The to address: " + curNode.data.getTo());
                System.out.println("The subject: " + curNode.data.getSubject());
                System.out.println("The content: " + curNode.data.getContent());
            }
            curNode = curNode.next;
        }

        Node curNode2 = head;

        System.out.println("-------Normal Mail-------");
        while (curNode2 != null){
            if (!curNode2.data.isImportant()){
                System.out.println("The mail id: " + curNode2.data.getMailid());
                System.out.println("The from address: " + curNode2.data.getFrom());
                System.out.println("The to address: " + curNode2.data.getTo());
                System.out.println("The subject: " + curNode2.data.getSubject());
                System.out.println("The content: " + curNode2.data.getContent());
            }
            curNode2 = curNode2.next;
        }
    }

    public void printAll(){
        if (head == null) {
            System.out.println("No mail added");
            return;
        }
        Node curNode = head;
        while (curNode != null){
            System.out.println("The mail id: " + curNode.data.getMailid());
            System.out.println("The from address: " + curNode.data.getFrom());
            System.out.println("The to address: " + curNode.data.getTo());
            System.out.println("The subject: " + curNode.data.getSubject());
            System.out.println("The content: " + curNode.data.getContent());
            System.out.println("--------------------------------");
            System.out.println();
            curNode = curNode.next;
        }
    }
}
