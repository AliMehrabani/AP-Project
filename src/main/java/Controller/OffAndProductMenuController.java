package Controller;
import Models.Category;
import Models.Product;

import java.util.ArrayList;

import static Controller.DataBase.*;

public class OffAndProductMenuController {

    //agar bekham az in estefade konam bayad hamash static beshe ya to Menu tarif beshe.

    public ArrayList<String> getAllAvailableFilters() {
        return allAvailableFilters;
    }

    public ArrayList<Category> getAllCategory() {
        return allCategory;
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

    public ArrayList<String> getAllAvailableSorting() {
        return allAvailableSorting;
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

    public Product getProductById(long productId) {
        return null;
        //bayad ye product jadid bargardone na khode model halro
    }

    public void addComments(Product product, String title, String content) {
        //
    }
}
