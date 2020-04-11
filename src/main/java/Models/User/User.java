package Models.User;

import java.util.ArrayList;

public abstract class User {
    private static ArrayList<User> allUsers = new ArrayList<User>();
    private String username;
    private String firstName;
    private String lastName;
    private String eMail;
    private long phoneNumber;
    private String password;

    public User(String username, String firstName, String lastName, String eMail, long phoneNumber, String password) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.password = password;
        allUsers.add(this);
    }



    public abstract String getType();
}
