package Controller;

import Models.Category;
import Models.DiscountCode;
import Models.Product;

import java.util.ArrayList;

import Models.User.Guest;
import Models.User.User;

import static Controller.DataBase.*;

public class Controller {
    private static User currentUser;
    private static boolean hasHeadManager;

    public Controller() {
        this.currentUser = new Guest();
        this.hasHeadManager = false;
    }

    public static String editField(String field, String newContent) {
        currentUser.setFirstName(newContent);
        currentUser.setLastName(newContent);
        return "";
    }

    public static String getCurrentUserType() {
        return currentUser.getType();
    }

    public static void setCurrentUser(User user) {
        currentUser = user;
    }

    public static String getProductById(long productId) {
        return null;
    }

    public static boolean isPasswordCorrect(String password) {
        return false;
    }

    public static String getCurrentUser() {
        return "";
    }

    public static String createAccount(String[] info) {
        return "";
    }

    public static String loginAccount(String username, String password) {
        return "";
    }

    public static double getBalance() {
        return 0;
    }

    public static boolean hasUserWithUsername(String username) {
        return false;
    }

    public static void addToCart(Product product) {
        cart.add(product);
        //check beshe.
    }

    public static void logout() {

    }
}
