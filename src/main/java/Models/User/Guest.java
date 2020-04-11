package Models.User;

import Models.Product;

import java.util.ArrayList;

public class Guest extends User {
    private ArrayList<Product> cart;

    public Guest() {
        super(null, null, null, null, 0, null);
        this.cart = new ArrayList<>();
    }

    public void addProduct(Product product){}

    @Override
    public String getType() {
        return "Guest";
    }
}
