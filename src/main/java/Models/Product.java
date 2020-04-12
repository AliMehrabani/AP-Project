package Models;

import Models.User.Seller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Product {
    private Long productId;
    private String name;
    private String brand;
    private double price;
    private HashMap<Seller , String> sellersBrand;
    private int remainedNumber;
    private Category parentCategory;
    private String explanation;
    private double averageScore;
    private ArrayList<Comment> allComments;
    private enum productStatus {REVIEWFORMAKE, REVIEWFOREDIT, ACCEPTED};
    private double discountPercentage;
    private boolean doesItHaveDiscount;
    private int numberOfView;
    private Date addProductDate;
    public Product() {

    }

    public void setRemainedNumber(int remainedNumber) {
        this.remainedNumber = remainedNumber;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public void addAComment(Comment comment){
        this.allComments.add(comment);
    }

    public Long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getRemainedNumber() {
        return remainedNumber;
    }

    public Category getParentCategory() {
        return parentCategory;
    }

    public String getExplanation() {
        return explanation;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public ArrayList<Comment> getAllComments() {
        return allComments;
    }
}
