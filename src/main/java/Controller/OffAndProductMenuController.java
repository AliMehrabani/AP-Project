package Controller;

import Models.Category;
import Models.Product;
import static Controller.DataBase.*;
import java.util.ArrayList;



public class OffAndProductMenuController {

    private ArrayList<Product> SortedProduct=new ArrayList<>();

    //agar bekham az in estefade konam bayad hamash static beshe ya to Menu tarif beshe.

    public static ArrayList<String> getName(){
        ArrayList<String> productName=new ArrayList<String>();
        for (Product product : allProduct) {
            productName.add(product.getName());
        }
        return productName;
    }

    public static ArrayList<String> getCurentName(){
        ArrayList<String> productName=new ArrayList<String>();
        for (Product product : sortedOrFilteredProduct) {
            productName.add(product.getName());
        }
        return productName;
    }

    public static ArrayList<Long> getId(){
        ArrayList<Long> productId=new ArrayList<Long>();
        for (Product product : allProduct) {
            productId.add(product.getProductId());
        }
        return productId;
    }

    public static ArrayList<Long> getCurrentId(){
        ArrayList<Long> productId=new ArrayList<Long>();
        for (Product product : sortedOrFilteredProduct) {
            productId.add(product.getProductId());
        }
        return productId;
    }

    public static ArrayList<Double> getOffPercentage(){
        ArrayList<Double> productOffPercentage=new ArrayList<Double>();
        for (Product product : allProduct) {
            productOffPercentage.add(product.getOffPercentage());
        }
        return productOffPercentage;
    }

    public static ArrayList<Double> getCurrentOffPercentage(){
        ArrayList<Double> productOffPercentage=new ArrayList<Double>();
        for (Product product : sortedOrFilteredProduct) {
            productOffPercentage.add(product.getOffPercentage());
        }
        return productOffPercentage;
    }

    public static ArrayList<Double> getPrice(){
        ArrayList<Double> productPrice=new ArrayList<Double>();
        for (Product product : allProduct) {
            productPrice.add(product.getPrice());
        }
        return productPrice;
    }

    public static ArrayList<Double> getCurrentPrice(){
        ArrayList<Double> productPrice=new ArrayList<Double>();
        for (Product product : sortedOrFilteredProduct) {
            productPrice.add(product.getPrice());
        }
        return productPrice;
    }

    public static ArrayList<Boolean> doesItOff(){
        ArrayList<Boolean> isIfOff=new ArrayList<Boolean>();
        for (Product product : allProduct) {
            isIfOff.add(product.getDoesItHaveOff());
        }
        return isIfOff;
    }

    public static ArrayList<Boolean> doesCurrentOff(){
        ArrayList<Boolean> isIfOff=new ArrayList<Boolean>();
        for (Product product : sortedOrFilteredProduct) {
            isIfOff.add(product.getDoesItHaveOff());
        }
        return isIfOff;
    }

    public static ArrayList<String> getAllAvailableFilters() {
        return allAvailableFilters;
    }

    public static ArrayList<Category> getAllCategory() {
        return allCategory;
    }

    public static ArrayList<Product> filtering(String filter) {
        Filter.filterByBrand("");
        // va baghie.

        //bayad havasam bashe shayad chnta filter yoho On bokone.
        return null;
    }

    public static ArrayList<String> getCurrentFilter() {
        return Filter.showCurrentFilters();
    }

    public static void disableFilter(String filter) {
        //
    }

    public static ArrayList<String> getAllAvailableSorting() {
        return allAvailableSorting;
    }

    public static ArrayList<Product> sorting(String sort) {
        Sort.sortByView();
        //va baghie
        return null;
    }

    public static ArrayList<String> getCurrentSort() {
        return null;
    }

    public static void disableSort(String sort) {
        Filter.disableAvailabilityFilter();
        //va baghie.
    }

    public static void addCommentsById(long productId, String title, String content) {
        //
    }

    public static ArrayList<String> getCategoriesName(){
        return null;
    }

    public static void addToCartById(long productId){
        for (Product product : allProduct) {
            if (product.getProductId()==productId){
                Controller.addToCart(product);
            }
        }
    }

}
