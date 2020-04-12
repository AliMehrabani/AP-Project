package Models;

import Models.User.Seller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Product {
    private long productId;
    private String name;
    private ArrayList<String> allbrands;
    private double price;
    private ArrayList<Seller> allSellers;
    private int remainedNumber;
    private Category parentCategory;
    private String explanation;
    private double averageScore;
    private ArrayList<Comment> allComments;

    private enum productStatus {REVIEWFORMAKE, REVIEWFOREDIT, ACCEPTED}

    private double discountPercentage;
    private boolean doesItHaveDiscount;
    private int numberOfView;
    private Date addProductDate;

    public Product(String name, long productId, String brand, double price, String explanation, Category parentCategory, Seller seller) {
        allbrands = new ArrayList<>();
        allSellers = new ArrayList<>();
        allbrands.add(brand);
        this.addSeller(seller);
        allComments = new ArrayList<>();
        this.explanation = explanation;
        addProductDate = new Date();
        this.name = name;
        this.numberOfView = 0;
        this.productId = productId;
        this.price = price;
        this.parentCategory = parentCategory;
        this.discountPercentage = 0;
        this.doesItHaveDiscount = false;
    }

    public void setRemainedNumber(int remainedNumber) {
        this.remainedNumber = remainedNumber;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public void addAComment(Comment comment) {
        this.allComments.add(comment);
    }

    public Long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
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

    public void addSeller(Seller seller) {
        if (!allSellers.contains(seller)) {
            allSellers.add(seller);
        }
    }

    public void addBrand(String brand) {
        allbrands.add(brand);
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public void setDoesItHaveDiscount(boolean doesItHaveDiscount) {
        this.doesItHaveDiscount = doesItHaveDiscount;
    }

    public void setNumberOfView(int numberOfView) {
        this.numberOfView = numberOfView;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public boolean isDoesItHaveDiscount() {
        return doesItHaveDiscount;
    }

    public int getNumberOfView() {
        return numberOfView;
    }

    public Date getAddProductDate() {
        return addProductDate;
    }
}
