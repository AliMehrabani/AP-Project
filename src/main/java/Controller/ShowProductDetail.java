package Controller;

import Models.Product;

import java.util.ArrayList;

import static Controller.DataBase.*;

public class ShowProductDetail {
    public static String getName(long productId){
        for (Product product : allProduct) {
            return product.getName();
        }
        return null;
    }
    public static Double getOffPercentage(long productId){
        for (Product product : allProduct) {
            return product.getOffPercentage();
        }
        return null;
    }
    public static String getExplanation(long productId){
        for (Product product : allProduct) {
            return product.getExplanation();
        }
        return null;
    }
    public static Double getPrice(long productId){
        for (Product product : allProduct) {
            return product.getPrice();
        }
        return null;
    }
    public static String getCategory(long productId){
        for (Product product : allProduct) {
            return product.getParentCategory().getName();
        }
        return null;
    }
    public static Double getAverageScore(long productId){
        for (Product product : allProduct) {
            return product.getAverageScore();
        }
        return null;
    }
    public static ArrayList<String> getAllSeller(long productId){
        for (Product product : allProduct) {
            return product.getAllSellersName();
        }
        return null;
    }
    public static int getRemainedNumber(long productId){
        for (Product product : allProduct) {
            return product.getRemainedNumber();
        }
        return 0;
    }
}
