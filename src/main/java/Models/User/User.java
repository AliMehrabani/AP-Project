package Models.User;

import java.util.ArrayList;

public abstract class User {
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
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEMail() {
        return eMail;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static User getUserByUsername(String username) {
        return null;
    }

    public static void deleteUser(String username) {

    }

    public static void addUser(User user) {

    }

    public abstract String getType();
}
