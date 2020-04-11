package Models.User;

public class Manager extends User {

    public Manager(String username, String firstName, String lastName, String eMail, long phoneNumber, String password) {
        super(username, firstName, lastName, eMail, phoneNumber, password);
    }

    @Override
    public String getType() {
        return "Manager";
    }
}
