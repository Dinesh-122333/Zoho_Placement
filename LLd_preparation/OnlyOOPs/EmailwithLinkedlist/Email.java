package LLd_preparation.OnlyOOPs.EmailwithLinkedlist;

import java.util.*;

public class Email {
    private static int mid = 1;
    private int mailid;
    private String from;
    private String to;
    private String subject;
    private String content;
    private boolean important;
    private List<String> tag;

    public Email( String from, String to, String subject, String content){
        this.mailid = mid++;
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.content = content;
        this.tag = new ArrayList<>();
    }

    //    getter and setter
    public int getMailid() {
        return mailid;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isImportant() {
        return important;
    }

    public void setImportant(boolean important) {
        this.important = important;
    }

    public List<String> getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag.add(tag);
    }
}
