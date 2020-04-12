package Controller;

import Models.Product;

import java.util.ArrayList;

import Models.User.Guest;
import Models.User.User;

public class Controller {
    protected static ArrayList<Product> allProduct = new ArrayList<>();
    private User currentUser;

    public Controller() {
        this.currentUser = new Guest();
    }

    public String getCurrentUserType() {
        return this.currentUser.getType();
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public boolean hasUserWithUsername(String username) {
        return false;
    }

    public String createAccount(String[] info) {
        return "";
    }

    public String loginAccount(String username, String password) {
        User.getUserByUsername("");
        return "";
    }
}
