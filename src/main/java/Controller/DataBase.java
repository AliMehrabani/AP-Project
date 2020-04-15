package Controller;

import Models.Category;
import Models.Product;

import java.util.ArrayList;

public class DataBase {
    static ArrayList<Product> allProduct = new ArrayList<>();
    static ArrayList<Category> allCategory = new ArrayList<>();
    static ArrayList<String> allAvailableFilters = new ArrayList<>();
    static ArrayList<String> allAvailableSorting = new ArrayList<>();
    static ArrayList<Product> cart = new ArrayList<>();
    static ArrayList<Product> sortedOrFilteredProduct = new ArrayList<>();
}
