package View;

import Models.Category;
import Models.Product;
import View.Menu.MainMenu;

import java.util.ArrayList;

public class View {

    public View() {

    }

    public static void printAllProduct(ArrayList<Product> products) {
        //
    }

    public static void printAllOffProduct(ArrayList<Product> products) {
        //
    }

    public static void printFilterdProduct(ArrayList<Product> products){
        //
    }

    public static void printCurrentFilter(ArrayList<String> filters){
        //
    }

    public static void printSortedProduct(ArrayList<Product> products){
        //
    }

    public static void printCurrentSort(ArrayList<String> sort){
        //
    }

    public static void printOffProduct(ArrayList<Product> products) {
        //
    }

    public static void printCategories(ArrayList<Category> categories) {
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
