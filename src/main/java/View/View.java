package View;

import Models.Category;
import Models.Product;
import View.Menu.MainMenu;

import java.util.ArrayList;

public class View {

    public View() {

    }

    public static void printAllProduct(ArrayList<Long> productsId,
                                       ArrayList<String> productName,
                                       ArrayList<Double> productPrice,
                                       ArrayList<Double> offPercentage,
                                       ArrayList<Boolean> doesItHaveOff) {
        //
    }

    public static void printAllOffProduct(ArrayList<Long> productsId,
                                          ArrayList<String> productName,
                                          ArrayList<Double> productPrice,
                                          ArrayList<Double> offPercentage) {
        //
    }

    //in ba printAllProduct fargh dare ya na?
    public static void printFilterdProduct(ArrayList<Long> productsId,
                                           ArrayList<String> productName,
                                           ArrayList<Double> productPrice,
                                           ArrayList<Double> offPercentage,
                                           ArrayList<Boolean> doesItHaveOff) {
        //
    }

    public static void printCurrentFilter(ArrayList<String> filters) {
        //
    }

    //in ba printAllProduct fargh dare ya na?
    public static void printSortedProduct(ArrayList<Long> productsId,
                                          ArrayList<String> productName,
                                          ArrayList<Double> productPrice,
                                          ArrayList<Double> offPercentage,
                                          ArrayList<Boolean> doesItHaveOff) {
        //
    }

    public static void printCurrentSort(ArrayList<String> sort){
        //
    }
    //in ba printAllProduct fargh dare ya na?
    public static void printOffProduct(ArrayList<Long> productsId,
                                       ArrayList<String> productName,
                                       ArrayList<Double> productPrice,
                                       ArrayList<Double> offPercentage,
                                       ArrayList<Boolean> doesItHaveOff) {
        //
    }

    public static void printCategories(ArrayList<String> categoriesName) {
        //
    }

    public static void printAvailableFilters(ArrayList<String> filters) {
        //
    }

    public static void printAvailableSorting(ArrayList<String> sorting) {
        //
    }

    public static void printProductSummery(Product product) {
        //
    }

    public static void printAttributes(Product product) {
        //
    }

    public static void printCompareProduct(Product originalProduct, Product compareProduct) {
        //
    }

    //tavabee ke az alireza type khroji ro migiram.

    public static void printString(String string) {
        System.out.println(string);
    }

    public static void run() {
        new MainMenu().run("");
    }
}
