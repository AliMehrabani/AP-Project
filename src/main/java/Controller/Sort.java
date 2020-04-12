package Controller;

import Models.Product;
import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.ArrayList;
import java.util.Comparator;

public class Sort {

    private static enum sortOptions {Score, Time, Viewed};

    public static void setSortType(String type){

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

    abstract class SortbyNumberOfView implements Comparator<Product> {
        public int compare(Product a, Product b) {
            return 0;
        }
    }

    abstract class SortbyNumberOfScore implements Comparator<Product> {
        public int compare(Product a, Product b) {
            return 0;
        }
    }

    abstract class SortbyNumberOfTime implements Comparator<Product> {
        public int compare(Product a, Product b) {
            return 0;
        }
    }

}
