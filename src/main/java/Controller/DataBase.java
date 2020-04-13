package Controller;

import Models.Category;
import Models.Product;

import java.util.ArrayList;

public class DataBase {
    protected static ArrayList<Product> allProduct = new ArrayList<>();
    protected static ArrayList<Category> allCategory = new ArrayList<>();
    protected static ArrayList<String> allAvailableFilters = new ArrayList<>();
    protected static ArrayList<String> allAvailableSorting = new ArrayList<>();
    protected static ArrayList<Product> cart = new ArrayList<>();
    protected static ArrayList<Product> sortedOrFilteredProduct = new ArrayList<>();
}
