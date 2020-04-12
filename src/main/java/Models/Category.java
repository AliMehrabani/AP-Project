package Models;

import java.util.ArrayList;

public class Category {
    private String name;
    private String specialAttribute;
    private ArrayList<Category> subCategories;
    private ArrayList<Product> allProduct;

    public Category(String name, String specialAttribute) {
        this.name = name;
        this.specialAttribute = specialAttribute;
        subCategories = new ArrayList<>();
        allProduct = new ArrayList<Product>();
    }

    public String getName() {
        return name;
    }

    public String getSpecialAttribute() {
        return specialAttribute;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialAttribute(String specialAttribute) {
        this.specialAttribute = specialAttribute;
    }

    public void addProduct(Product product){
        allProduct.add(product);
    }

    public void removeProduct(Product product){
        allProduct.remove(product);
    }

    public void addSubCategory(Category category){
        subCategories.add(category);
    }

    public void removeSubCategory(Category category){
        subCategories.remove(category);
    }

    public ArrayList<String> showCategories(){
        return null;
    }
}
