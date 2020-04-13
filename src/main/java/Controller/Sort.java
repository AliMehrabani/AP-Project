package Controller;

import Models.Product;

import java.security.PublicKey;
import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.ArrayList;
import java.util.Comparator;

public class Sort {

    private static String currentSort;

    public static void setCurrentSort(String currentSort) {
        Sort.currentSort = currentSort;
    }

    public static ArrayList<String> sortByTime() {
        return null;
    }

    public static ArrayList<String> sortByScore() {
        return null;
    }

    public static ArrayList<String> sortByNumberOfView() {
        return null;
    }

    abstract class SortByNumberOfView implements Comparator<Product> {
        public int compare(Product a, Product b) {
            return 0;
        }
    }

    abstract class SortByNumberOfScore implements Comparator<Product> {
        public int compare(Product a, Product b) {
            return 0;
        }
    }

    abstract class SortByTime implements Comparator<Product> {
        public int compare(Product a, Product b) {
            return 0;
        }
    }

    public static boolean isInputASortKind(String input) {
        if (input.equals("Score") || input.equals("Time") || (input.equals("Viewed"))) {
            return true;
        }
        return false;
    }

    public static ArrayList<String> showAvailableSorts() {
        ArrayList<String> availableSorts = new ArrayList<>();
        availableSorts.add("sort by time");
        availableSorts.add("sort by score");
        availableSorts.add("sort by number of veiw");
        return availableSorts;
    }

    public static String showCurrentSort() {
        return currentSort;
    }

}
