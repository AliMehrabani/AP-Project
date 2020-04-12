package Controller;

import Models.Category;
import Models.Product;

import java.util.ArrayList;

import Models.User.Guest;
import Models.User.User;

public class Controller {
    private static ArrayList<Product> allProduct;
    private static ArrayList<Category> allCategory;
    private static ArrayList<String> allAvailableFilters;
    private static ArrayList<String> allAvailableSorting;
    private static ArrayList<Product> cart;
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

    public static ArrayList<Product> getAllProduct(boolean Off) {
        return null;
    }

    public static ArrayList<Category>getAllCategory(){
        return allCategory;
    }

    public static ArrayList<String>getAllAvailableFilters(){
        return allAvailableFilters;
    }

    public static ArrayList<String> getAllAvailableSorting() {
        return allAvailableSorting;
    }

    public static Product getProductById(long productId){
        return null;
    }

    public static void addToCart(Product product){
        cart.add(product);
        //check beshe.
    }

    public boolean isPasswordCorrect(String password) {
        return false;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void editField(String field, String newContent) {
        currentUser.setFirstName(newContent);
        currentUser.setLastName(newContent);
    }

    public String viewUser(String username) {
        return "";
    }
}
