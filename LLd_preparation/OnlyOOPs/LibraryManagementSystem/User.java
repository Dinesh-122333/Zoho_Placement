package LLd_preparation.OnlyOOPs.LibraryManagementSystem;

import java.util.List;

public class User {
    static int id = 1;
    private String name;
    private int uid;
    private List<User> userList;

    public User(String name) {
        this.name = name;
        this.uid = id++;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
