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

    public static Product getProductById(long productId) {
        return null;
    }

    public static boolean isPasswordCorrect(String password) {
        return false;
    }

    public static User getCurrentUser() {
        return currentUser;
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



    public ArrayList<Product> getAllProduct() {
        return null;
    }

    public ArrayList<Product> getAllOffProduct() {
        return null;
    }

    public ArrayList<Category> getAllCategory() {
        return allCategory;
    }

    public ArrayList<String> getAllAvailableFilters() {
        return allAvailableFilters;
    }

    public ArrayList<String> getAllAvailableSorting() {
        return allAvailableSorting;
    }

    public void addComments(Product product, String title, String content) {
        //
    }

    public ArrayList<Product> filtering(String filter) {
        //bayad havasam bashe shayad chnta filter yoho On bokone.
        return null;
    }

    public ArrayList<String> getCurrentFilter() {
        return Filter.showCurrentFilters();
    }

    public void disableFilter(String filter) {
        //
    }

    public ArrayList<Product> sorting(String sort) {
        return null;
    }

    public ArrayList<String> getCurrentSort() {
        return null;
    }

    public void disableSort(String sort) {
        Sort.sortByView();
    }

    public void restartSortedOrFilterProducts() {
        sortedOrFilteredProduct.clear();
        sortedOrFilteredProduct = allProduct;
    }

    public ArrayList<String> showSortedOrFilteredProducts() {
        ArrayList<String> sortedOrFiltered = new ArrayList<>();
        for (Product product : sortedOrFilteredProduct) {
            sortedOrFiltered.add("Product Name: " + product.getName() + " | Price: " + product.getPrice());
        }
        return  sortedOrFiltered;
    }
}
