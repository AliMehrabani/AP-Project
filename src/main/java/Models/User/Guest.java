package Models.User;

import Models.Product;

import java.util.ArrayList;
import java.util.HashMap;

public class Guest extends User {
    private HashMap<Product, Integer> cart;

    public Guest() {
        super(null, null, null, null, 0, null);
        this.cart = new HashMap<>();
    }

    public void addProduct(Product product){}

    @Override
    public String getType() {
        return "Guest";
    }
}
