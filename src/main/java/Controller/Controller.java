package Controller;

import Models.DiscountCode;
import Models.Product;

import java.awt.desktop.UserSessionEvent;
import java.util.ArrayList;

import Models.User.Guest;
import Models.User.User;

public class Controller {
    protected static ArrayList<Product> allProduct = new ArrayList<>();
    private User currentUser;
    private boolean hasHeadManager;

    public Controller() {
        this.currentUser = new Guest();
        this.hasHeadManager = false;
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

    public void deleteUser(String username) {
        User.deleteUser(username);
    }

    public void changeUserType(String username, String newType) {

    }

    public void createManagerProfile(String[] info) {
        User.addUser(null);
    }

    public void deleteProduct(long productID) {

    }

    public void createDiscountCode(String[] info) {
        DiscountCode.addDiscountCode(null);
    }

    public void viewDiscountCodes(long code) {

    }

    public void editDiscountCode(long code) {

    }

    public void removeDiscountCode(long code) {

    }

    public void requestDetails(long requestID) {
        //manager class is not complete
    }

    public void acceptRequest(long requestID) {

    }

    public void declineRequest(long requestID) {

    }

    public void editCategory(String name) {

    }

    public void addCategory(String name) {

    }

    public void removeCategory(String name) {

    }
}
