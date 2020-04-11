package Models.User;

public class Guest extends User {

    @Override
    public String getType() {
        return "Guest";
    }
}
