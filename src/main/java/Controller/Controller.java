package Controller;

import Models.Category;
import Models.DiscountCode;
import Models.Product;

import java.util.ArrayList;

import Models.User.Guest;
import Models.User.User;

import static Controller.DataBase.*;

public class Controller {
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

    public Product getProductById(long productId) {
        return null;
    }

    public void addToCart(Product product) {
        cart.add(product);
        //check beshe.
    }

    public boolean isPasswordCorrect(String password) {
        return false;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public String editField(String field, String newContent) {
        currentUser.setFirstName(newContent);
        currentUser.setLastName(newContent);
        return "";
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

    public void viewCompanyInfo() {

    }

    public void viewSellerProducts() {
    }

    public String viewSalesHistory() {
        return "";
    }

    public String viewProductBuyers() {
        return "";
    }

    public void editProduct(String field, String newContent, long productID) {

    }

    public void addProduct(String[] info) {

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

    public double getBalance() {
        return 0;
    }

    public String viewCostumerDiscountCodes() {
        return "";
    }

    public String showProducts() {
        return "";
    }

    public void removeFromCart(long ProductId) {
    }

    public double getTotalPrice() {
        return 0;
    }

    public String viewDiscountCode(long discountCode) {
        return "";
    }

    public void removeProduct(long productId) {
    }

    public String showCategories() {
        return "";
    }

    public String viewOff(long offId) {
        return "";
    }

    public void editOff(String field, String newContent, long offId) {
    }

    public void addOff(String[] info) {
    }
}
